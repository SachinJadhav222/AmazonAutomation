package amazonTestOne;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utility.BaseMain;

import java.util.List;

// This is Search result page showing result after user enter the product details

public class SearchResultPage extends BaseMain {

    @FindBy(css = "h2.a-size-medium.s-inline.scx-truncate.s-access-title.a-text-normal")
    private List<WebElement> searchResultList;

    public void searchResult_List_Info(String product) {
        System.out.println("==Search Result List==");
        System.out.println("Total Results Showns= " + searchResultList.size());
        for (int i = 0; i < searchResultList.size(); i++) {
            if (searchResultList.get(i).getText().trim().equalsIgnoreCase(product)) {
                searchResultList.get(i).click();
            }
        }

        System.out.println("==End Result List==");
    }
}
