package stackOverSearch.autoTest.BfgGroup;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class SeleniumWebDriverInit {

    public ChromeDriver driver;
    public  String mainPage ="http://46.101.59.136";

    @Before
    public void setUp() {
        driver = new ChromeDriver();

            }

    //@After

    //public void closeBrowser(){
   //     driver.quit();
    //}
}
