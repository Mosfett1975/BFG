package stackOverSearch.autoTest.BfgGroup;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebDriverInit {

    public ChromeDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();

            }

    //@After

    //public void closeBrowser(){
   //     driver.quit();
    //}
}
