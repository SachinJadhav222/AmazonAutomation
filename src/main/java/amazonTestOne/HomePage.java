package amazonTestOne;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utility.BaseMain;

//This is Home Page Of the Amazon.co.uk
// All the element of required functionality are initialised using Page Factory
//This code is pushed to GitHub Using Intelij Ideal  IDE

public class HomePage extends BaseMain {

    @FindBy(css="span.nav-action-inner")
    private WebElement signIn_Button;

    @FindBy(css = "input#twotabsearchtextbox")
    private WebElement searchTextBox;

    @FindBy(css = "input[class=\"nav-input\"][value=\"Go\"]")
    private WebElement submitSearch;

    @FindBy(xpath = "//span[@id=\"nav-search-submit-text\"]")

    private WebElement submitSearch1;

    @FindBy(css = "span[id=\"quartsPagelet\"]")
    private WebElement searchPageInfo;

    @FindBy(css = "a[id='nav-link-yourAccount'] span[class='nav-line-1']")
    private WebElement checkSignInText;

    public void click_SignIn_Button(){
        signIn_Button.click();
    }
    public void enter_Product_to_SearchBox(String product)  {
        System.out.println("===Entering " + product + " to search Box===");
        searchTextBox.click();
        searchTextBox.sendKeys(product);
        submitSearch.click();
        System.out.println("===Searching and waiting for reply===");
    }

    public boolean getPageTitle(String homePage) {
        boolean isTextPresent = false;
        if (driver.getTitle().contains("")) {
            isTextPresent = true;
        }
        return isTextPresent;
    }

    public boolean searchPageTextInfo(String product) {
        boolean isTextPresent = false;
        System.out.println(searchPageInfo.getText());
        if (searchPageInfo.getText().contains(product)) {
            isTextPresent = true;
        }
        return isTextPresent;
    }

    public boolean assertHomePage(String homePageName){
        boolean isHomePage=false;
        if(driver.getTitle().trim().contains(homePageName)){
            System.out.println("====Home Page :"+homePageName+" =====");
            isHomePage=true;
        }
        return isHomePage;
    }

    public boolean checkSignInText_Login(String textPresnt){
        boolean isTextPresent=false;
        String foudnText=checkSignInText.getText();
        System.out.println(foudnText);
        if(foudnText.trim().contains(textPresnt)){
            System.out.println("==User Log In : "+textPresnt);
            isTextPresent=true;
        }
        return isTextPresent;
    }




  public void addMessage(){


  System.out.println("=====Welcome To Amazon.co.uk=======");
  System.out.println("=====Welcome To Amazon.co.uk=======");

  }



}
