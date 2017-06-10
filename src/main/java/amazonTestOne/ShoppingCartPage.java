package amazonTestOne;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utility.BaseMain;

import java.util.prefs.BackingStoreException;


public class ShoppingCartPage extends BaseMain {

    @FindBy(css="p[class=\"a-spacing-small\"] span[class*=\"a-size-medium\"]")
    private WebElement price_in_cart;

    public String check_Price_In_cart(){
       String priceInCart=price_in_cart.getText();
        System.out.println("Price of the product in Cart is= "+priceInCart);
        return  priceInCart;
    }
}
