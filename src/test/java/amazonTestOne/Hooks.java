package amazonTestOne;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import utility.BaseMain;

import java.io.IOException;

// This class will invoke Open and close Browser methoods of the Base Main class
// This use @Before and @ After annotations of the Cuccumber API

public class Hooks {
    BaseMain baseMain=new BaseMain();

    @Before
    public void setUpBrowser() throws IOException {
        baseMain.openBrowser();
    }
    @After
    public void tearDownBrowser(){
        baseMain.closeBrowser();
    }
}
