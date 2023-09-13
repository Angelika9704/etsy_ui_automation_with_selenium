package pl.globallogic.etsy.features;

import org.testng.annotations.Test;

public class SearchResultsSortingTest {

    //WebDriver
    //LandingPage
    //SearchResultsPage

    //Sort by lowest price -> verify that number of items (one of the result rows) sorted in ascending order
    @Test
    public void pricesShouldBeOrderedAccordingToSortingCriteria() {
        //go to the landing page
        //search for item
        //wait for search result to be loaded
        //select required sorting order (lowest price)
        //apply sorting
        //wait for search result to be sorted
        //verify item prices sorting order (take 4 consequtive items and check if price[i] < price[i+1])
    }
}
