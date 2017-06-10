package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class BaseMain {
    public static WebDriver driver;
    public BaseMain()  {
        PageFactory.initElements(driver,this);
    }




    public void openBrowser() throws IOException {
        String congigFilePath="\\src\\test\\resources\\config.properties";

        Properties properties=new Properties();
        FileInputStream fileInputStream=new FileInputStream(System.getProperty("user.dir")+congigFilePath);
        properties.load(fileInputStream);
        String url=properties.getProperty("url");
        String browser=properties.getProperty("browser");

        if (browser.equalsIgnoreCase("chrome")) {
            System.out.println("====="+browser+" Browser Started ===");
            System.setProperty("driver.chromedriver.driver", "chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.out.println("====="+browser+" Browser Started ===");
            System.setProperty("driver.geckodriver.driver", "geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("IE")) {
            System.out.println("====="+browser+" Browser Started ===");
            System.setProperty("driver.IEDriverServer.driver", "IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        }
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


    }
    public void closeBrowser(){
        System.out.println("======Browser Closing=========");
        WebUtility.sleepTime(2);
        driver.quit();
    }
}
