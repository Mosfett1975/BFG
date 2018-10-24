package stackOverSearch.autoTest.BfgGroup;

import org.junit.Assert;
import org.junit.Test;


import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;



import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;






public class CheckTitle extends SeleniumWebDriverInit {


    @Test
    public void blockSize() throws IOException {

        driver.manage().window().maximize();
        driver.get("http://46.101.59.136");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("StackOverSearch - новый запрос"));
        //new WebDriverWait(driver, 3).until(ExpectedConditions.titleContains("StackOverSearch - новый запрос"));
       // Screenshot myScreenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(10)).takeScreenshot(driver);
       // ImageIO.write(myScreenshot.getImage(),"PNG",new File("c:/temp/elementScreenshot.png"));
        BufferedImage expectedImage = ImageIO.read(new File("c:/temp/elementScreenshot.png"));
        Screenshot logoImageScreenshot = new AShot().takeScreenshot(driver);
        BufferedImage actualImage = logoImageScreenshot.getImage();

        ImageDiffer imgDiff = new ImageDiffer();
        ImageDiff diff = imgDiff.makeDiff(actualImage, expectedImage);


        if(diff.hasDiff()) {
            System.out.println("Main page is different to reference standard");}
        else {
            System.out.println("Design of mine page is equal to reference standard");
        }

    }

}
