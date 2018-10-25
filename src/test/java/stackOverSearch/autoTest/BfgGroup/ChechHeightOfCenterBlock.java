package stackOverSearch.autoTest.BfgGroup;

import org.junit.Test;
import org.openqa.selenium.By;

import java.io.IOException;

public class ChechHeightOfCenterBlock extends SeleniumWebDriverInit {

    @Test
    public void CentralBlockHeight() throws IOException {

        driver.manage().window().maximize();
        driver.get(mainPage);
        if (driver.findElement(By.xpath("/html/body/center/div/div/div")).getCssValue("height").equalsIgnoreCase( "337.969px" )) {
            System.out.println("Width of picture is correct");

        }

    }
}
