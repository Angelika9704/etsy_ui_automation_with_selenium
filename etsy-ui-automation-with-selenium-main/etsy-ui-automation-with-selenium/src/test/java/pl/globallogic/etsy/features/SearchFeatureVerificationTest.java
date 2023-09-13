package pl.globallogic.etsy.features;

import org.testng.Assert;
import org.testng.annotations.Test;
import pl.globallogic.etsy.BaseLandingPageTest;
import pl.globallogic.etsy.features.pageobjects.InvalidSearchResultPage;
import pl.globallogic.utils.InvalidQueryGenerator;

public class SearchFeatureVerificationTest extends BaseLandingPageTest {
    @Test
    public void shouldDisplaySearchResultsForValidQuery() {
        String validQuery = "leather bag";
        landingPage.searchFor(validQuery);
        Assert.assertTrue(landingPage.isSearchResultsValidFor(validQuery));
    }

    @Test
    public void shouldDisplayNotFoundPageForInvalidQuery() {
        String queryForInvalidSearchResultPage = InvalidQueryGenerator.getRandomInvalidQuery();
        landingPage.searchFor(queryForInvalidSearchResultPage);
        invalidSearchResultPage = new InvalidSearchResultPage(driver);
        Assert.assertTrue(invalidSearchResultPage.isVisible());
    }
}
