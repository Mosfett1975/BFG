package stackOverSearch.autoTest.BfgGroup;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.nio.file.Paths;

public abstract class SeleniumWebDriverInit {

   public static ChromeDriver driver;
    public  String mainPage ="http://46.101.59.136";
    public Select select;

    @Before
    public void setUp() {
        String pathToChromeDriver = Paths.get("./chromedriver/chromedriver.exe").toAbsolutePath().toString();
        System.setProperty("webdriver.chrome.driver", pathToChromeDriver);
        if (driver == null) {
            driver = new ChromeDriver();}
        driver.manage().window().maximize();

        //Browser.getInstance();


    }

    public Select getSelect(WebElement element){
        select = new Select(element);
        return select;
    }


   @AfterClass
    public static void closeBrowser(){
        driver.quit();
    }
}
