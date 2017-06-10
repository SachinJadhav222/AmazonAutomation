package amazonTestOne;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import utility.BaseMain;
import utility.WebUtility;

// This is Product info page showing details of the searched product

public class ProductInfoPage extends BaseMain {
    @FindBy(css = "select#native_dropdown_selected_size_name")
    private WebElement select_Size;

    @FindBy(css = "")
    private WebElement priceTag;

    @FindBy(id="add-to-cart-button")
    private WebElement add_to_cart_Button;

    @FindBy(id="huc-v2-order-row-confirm-text")
    private  WebElement added_Confirmation;

    @FindBy(id="hlb-ptc-btn-native")
    private WebElement proceed_CheckOut_Button;

    public void select_Size_Dropdown(String selectsize){
        Select select=new Select(select_Size);
        select.selectByVisibleText(selectsize);
    }

    public String check_PriceTag(){
        String priceTagLable= priceTag.getText();
        System.out.println(" Price of the Product Displayed in Product Info Page="+priceTagLable);
        return  priceTagLable;
    }

    public void addToCart() throws InterruptedException {
        WebUtility.sleepTime(2000);
        add_to_cart_Button.click();
    }

    public boolean add_Confirmation(String message){
        boolean isConfirmed=false;
        if(added_Confirmation.getText().trim().equalsIgnoreCase(message)){
            isConfirmed=true;
        }
        return isConfirmed;
    }

    public void click_ProceedButton(){

        proceed_CheckOut_Button.click();
    }
}
