package stackOverSearch.autoTest.BfgGroup;

import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class MainPageTakeScreenShot extends SeleniumWebDriverInit{


    @Test
    public void takeScreenOfMainPage() throws IOException {

        driver.manage().window().maximize();
        driver.get(mainPage);
        new WebDriverWait(driver, 10).until(ExpectedConditions.titleContains("StackOverSearch - новый запрос"));
        Screenshot myScreenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(10)).takeScreenshot(driver);
        ImageIO.write(myScreenshot.getImage(),"PNG",new File("./target/screenshots/reference/mainScreen.png"));

    }
}
