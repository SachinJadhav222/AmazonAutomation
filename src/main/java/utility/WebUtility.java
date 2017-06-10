package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WebUtility extends BaseMain {
    public static void sleepTime(int sleepTime){
        System.out.println("===waiting for element to load===");
        try {
            Thread.sleep(1000*sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void waitForElementToBeClickable(By by) {
        System.out.println("Waiting for element to be clickable " + by);
        WebDriverWait webDriverWait = new WebDriverWait(driver,30);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(by));

    }
}
