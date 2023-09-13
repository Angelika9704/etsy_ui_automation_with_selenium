package pl.globallogic.etsy.features;

import org.testng.annotations.Test;

public class SearchResultsFilteringTest {

    //WebDriver
    //LandingPage
    //SearchResultsPage


    //Filter search result by price -> price didn’t is lower then price value for filtering
    @Test
    public void searchResultPriceFitPriceRangeAfterFiltering(){
        //go to the landing page
        //search for item
        //wait for search result to be loaded
        //expand filtering panel
        //select required filters ( by price )
        //apply selected filters
        //wait for search result to be filtered
        //verify item price is in range ( one or more items have a price from specified range )
    }

    //Filter search by free shipping -> free shipping tag need to be present on all items
    @Test
    public void freeShippingTagNeedToBePresentAfterFiltering() {
        //go to the landing page
        //search for item
        //wait for search result to be loaded
        //expand filtering panel
        //select required filters ( by free shipping )
        //apply selected filters
        //wait for search result to be filtered
        //verify free shipping tag/label is present on search result page
    }

    //Already filtered search results not changed when canceling filtering
    @Test
    public void searchResultPageContentNotChangedIfFilterApplicationCanceled() {
        //go to the landing page
        //search for item
        //wait for search result to be loaded
        //get 1st item in results title to be used in verification (after canceling remain in-place)
        //expand filtering panel
        //cancel filter application
        // verify 1st item in results title
    }

    //Search results filtered by color -> check if color from filter can be selected for purchase
    @Test
    public void filteredColorSelectionOptionShouldBeAvailableInItemDetailsView() {
        //go to the landing page
        //search for item
        //wait for search result to be loaded
        //expand filtering panel
        //select required filters ( by color )
        //apply selected filters
        //wait for search result to be filtered
        //go to 1st result item details view
        //verify color selection element contains required color
    }

    //Ship to country filtering -> check if item details contains expected country for shipping
    @Test
    public void filteredShippingCountryShouldBePresentInShippingDestinationOptions() {
        //go to the landing page
        //search for item
        //wait for search result to be loaded
        //expand filtering panel
        //select required filters ( by shipping country )
        //apply selected filters
        //wait for search result to be filtered
        //go to 1st result item details view
        //verify shipping destination selection element contains required country
    }
}
