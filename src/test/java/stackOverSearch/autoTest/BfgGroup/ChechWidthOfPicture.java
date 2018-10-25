package stackOverSearch.autoTest.BfgGroup;

import org.junit.Test;
import org.openqa.selenium.By;

import java.io.IOException;

public class ChechWidthOfPicture extends SeleniumWebDriverInit{

    @Test
    public void WidthOfPicture() throws IOException {

        driver.manage().window().maximize();
        driver.get(mainPage);
        if ( driver.findElement(By.xpath("/html/body/center/div/div/div/img")).getCssValue("width").equalsIgnoreCase( "100px" )) {
            System.out.println("Width of picture is correct");
            ///html/body/center/div/div/div

        }
        System.out.println(driver.findElement(By.xpath("/html/body/center/div/div/div")).getCssValue("height"));
    }


}
