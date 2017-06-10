package amazonTestOne;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


public class MyStepDefinitions {
    HomePage homePage=new HomePage();
    SignInPage signInPage=new SignInPage();
    ProductInfoPage productInfoPage=new ProductInfoPage();
    ShoppingCartPage shoppingCartPage=new ShoppingCartPage();

    @Given("^I am on \"([^\"]*)\"$")
    public void iAmAt(String homePageName) throws Throwable {
       Assert.assertTrue(homePage.assertHomePage(homePageName));
    }

    @When("^I Click SignIn Button$")
    public void iClickSignInButton() throws Throwable {
     homePage.click_SignIn_Button();
    }

    @Then("^Enter \"([^\"]*)\" and \"([^\"]*)\"$")
    public void enterAnd(String email, String password) throws Throwable {
    //  SignInPage signInPage=new SignInPage();
      signInPage.enterLoginDetails(email,password);
    }

    @And("^click SignIn$")
    public void clickSignIn() throws Throwable {
    signInPage.click_SignInButton();
    }

    @Then("^I can see I am Logged In as \"([^\"]*)\"$")
    public void iCanSeeIAmLoggedInAs(String nameDisplayed) throws Throwable {
       Assert.assertTrue(homePage.checkSignInText_Login(nameDisplayed));

    }

    @When("^I enter \"([^\"]*)\" into search product page$")
    public void iEnterIntoSearchProductPage(String product) throws Throwable {
        homePage.enter_Product_to_SearchBox(product);
    }

    @Then("^I should see page showing \"([^\"]*)\"$")
    public void iShouldSeePageShowing(String product) throws Throwable {
        System.out.println("===Search Page Info===");
        Assert.assertTrue(homePage.searchPageTextInfo(product));
        SearchResultPage searchResultPage = new SearchResultPage();
        searchResultPage.searchResult_List_Info(product);
    }

    @And("^I select the \"([^\"]*)\"  and add product to Shopping cart$")
    public void iSelectTheAndAddProductToShoppingCart(String size) throws Throwable {
        System.out.println("=== Select Size and Add Product to Cart====");
        productInfoPage.select_Size_Dropdown(size);
        productInfoPage.addToCart();
    }

    @Then("^I can see \"([^\"]*)\" in shopping cart$")
    public void iCanSeeInShoppingCart(String product) throws Throwable {
        System.out.println("== " + product + " Added to Cart==");
        Assert.assertTrue(productInfoPage.add_Confirmation("Added to Basket"));
    }

    @Then("^I click on Proceed to Checkout$")
    public void iClickOnProceedToCheckout() throws Throwable {
        productInfoPage.click_ProceedButton();
    }

    @Then("^I check the price of the \"([^\"]*)\"$")
    public void iCheckThePriceOfThe(String product) throws Throwable {
       productInfoPage.check_PriceTag();
    }

    @And("^I check the price of the \"([^\"]*)\" in Shopping cart$")
    public void iCheckThePriceOfTheInShoppingCart(String product) throws Throwable {
      shoppingCartPage.check_Price_In_cart();
    }

    @Then("^I check if the price is matching$")
    public void iCheckIfThePriceIsMatching() throws Throwable {
     Assert.assertEquals(shoppingCartPage.check_Price_In_cart(),productInfoPage.check_PriceTag());
    }


}
