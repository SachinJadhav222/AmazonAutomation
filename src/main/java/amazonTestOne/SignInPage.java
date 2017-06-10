package amazonTestOne;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utility.BaseMain;

public class SignInPage extends BaseMain {

    @FindBy(css = "input[id='ap_email']")
    private WebElement enter_email;

    @FindBy(css = "input[id='ap_password']")
    private WebElement enter_password;

    @FindBy(css = "input[id='signInSubmit']")
    private WebElement click_SignIn_Login;

    public void enterLoginDetails(String email, String password){
        enter_email.sendKeys(email);
        enter_password.sendKeys(password);
      //  click_SignIn_Login.click();

    }
    public void click_SignInButton(){
        click_SignIn_Login.click();
    }
}
