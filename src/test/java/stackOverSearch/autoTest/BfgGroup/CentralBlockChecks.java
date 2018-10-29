package stackOverSearch.autoTest.BfgGroup;



import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CentralBlockChecks extends SeleniumWebDriverInit {


        @Test
    public void CentralBlockHeight()  {

       driver.get(mainPage);
       new WebDriverWait(driver, 10).until(ExpectedConditions.titleContains("StackOverSearch - новый запрос"));
       assertTrue(driver.findElement(By.xpath("/html/body/center/div/div/div")).getCssValue("height").equalsIgnoreCase( "337.969px" ));

   }

   @Test
   public void CentralBlockLayout() throws Exception {
       driver.get(mainPage);
       BufferedImage expectedImage = ImageIO.read(new File("./screens/mainScreen.png"));
       Screenshot logoImageScreenshot = new AShot().takeScreenshot(driver);
       BufferedImage actualImage = logoImageScreenshot.getImage();
       ImageDiffer imgDiff = new ImageDiffer();
       ImageDiff diff = imgDiff.makeDiff(actualImage, expectedImage);
       assertFalse(diff.hasDiff());
   }


   @Test
  public void SizeOfPicture() {
  driver.get(mainPage);
   assertTrue(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='StackOverSearch'])[1]/preceding::img[1]")).getCssValue("width").equalsIgnoreCase( "100px" ));
       assertTrue(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='StackOverSearch'])[1]/preceding::img[1]")).getCssValue("height").equalsIgnoreCase( "89.9688px" ));
   }

   @Test
    public  void CentralBlockBorderColor() {
       driver.get(mainPage);
       assertTrue(driver.findElement(By.xpath("/html/body/center/div/div")).getCssValue("border-color").equalsIgnoreCase( "rgb(36, 206, 234)" ));
       //System.out.println(driver.findElement(By.xpath("/html/body/center/div/div")).getCssValue("border-color"));
   }

   @Test
      public  void CardTitleColor() {
       driver.get(mainPage);
       assertTrue(driver.findElement(By.xpath("/html/body/center/div/div/div/strong/h4")).getCssValue("color").equalsIgnoreCase( "rgba(41, 43, 44, 1)" ));

   }

   @Test
   public  void CardTitleFontSize() {
       driver.get(mainPage);
       assertTrue(driver.findElement(By.xpath("/html/body/center/div/div/div/strong/h4")).getCssValue("font-size").equalsIgnoreCase( "24px" ));

   }

    @Test
    public  void CardTitleMargin() {
        driver.get(mainPage);
        assertTrue(driver.findElement(By.xpath("/html/body/center/div/div/div/strong/h4")).getCssValue("margin-bottom").equalsIgnoreCase( "12px" ));

    }

    @Test
    public  void CardTextMutedColor() {
        driver.get(mainPage);
       assertTrue(driver.findElement(By.xpath("/html/body/center/div/div/div/h5/small")).getCssValue("color").equalsIgnoreCase( "rgba(99, 108, 114, 1)" ));

    }

    @Test
    public  void CardTextMutedFontSize() {
        driver.get(mainPage);
        assertTrue(driver.findElement(By.xpath("/html/body/center/div/div/div/h5/small")).getCssValue("font-size").equalsIgnoreCase( "16px" ));

    }

    @Test
    public  void BntInfoBlockHeight() {
        driver.get(mainPage);
        assertTrue(driver.findElement(By.xpath("/html/body/center/div/div/div/p/a/button")).getCssValue("height").equalsIgnoreCase( "27px" ));
    }

    @Test
    public  void BntInfoBlockBackgroundColor() {
        driver.get(mainPage);
        assertTrue(driver.findElement(By.xpath("/html/body/center/div/div/div/p/a/button")).getCssValue("background-color").equalsIgnoreCase( "rgba(91, 192, 222, 1)" ));

    }

    @Test
    public  void BntInfoBlockFontColor() {
        driver.get(mainPage);
        assertTrue(driver.findElement(By.xpath("/html/body/center/div/div/div/p/a/button")).getCssValue("color").equalsIgnoreCase( "rgba(255, 255, 255, 1)" ));

    }

    @Test
    public  void BntInfoBlockFontSize() {
        driver.get(mainPage);
        assertTrue(driver.findElement(By.xpath("/html/body/center/div/div/div/p/a/button")).getCssValue("font-size").equalsIgnoreCase( "14px" ));
        //System.out.println(driver.findElement(By.xpath("/html/body/center/div/div/div/p/a/button")).getCssValue("background-color"));
    }

    @Test
    public  void CustomSelectOptionAvalable() {
        driver.get(mainPage);
        WebElement listValue = driver.findElement(By.xpath("//*[@id=\"page_number\"]"));
        getSelect(listValue);
        select.selectByVisibleText("Кол-во...");
        select.selectByVisibleText("25");
        select.selectByVisibleText("50");
        select.selectByVisibleText("100");
    }

    @Test
    public  void CustomSelectOptionHeight() {
        driver.get(mainPage);
        assertTrue(driver.findElement(By.xpath("//*[@id=\"page_number\"]")).getCssValue("height").equalsIgnoreCase( "38px" ));

    }

    @Test
    public  void CustomSelectOptionBorderColor() {
        driver.get(mainPage);
        assertTrue(driver.findElement(By.xpath("//*[@id=\"page_number\"]")).getCssValue("border-bottom-color").equalsIgnoreCase( "rgba(0, 0, 0, 0.15)" ));

    }

    @Test
    public  void CustomSelectOptionBorderRadius() {
        driver.get(mainPage);
        assertTrue(driver.findElement(By.xpath("//*[@id=\"page_number\"]")).getCssValue("border-bottom-left-radius").equalsIgnoreCase( "4px" ));
        assertTrue(driver.findElement(By.xpath("//*[@id=\"page_number\"]")).getCssValue("border-bottom-right-radius").equalsIgnoreCase( "4px" ));

    }

    @Test
    public  void CustomSelectOptionBorderWidth() {
        driver.get(mainPage);
        assertTrue(driver.findElement(By.xpath("//*[@id=\"page_number\"]")).getCssValue("border-bottom-width").equalsIgnoreCase( "1px" ));

    }

    @Test
    public  void CustomSelectOptionFontColor() {
        driver.get(mainPage);
        assertTrue(driver.findElement(By.xpath("//*[@id=\"page_number\"]")).getCssValue("color").equalsIgnoreCase( "rgba(70, 74, 76, 1)" ));

    }

    @Test
    public  void CustomSelectOptionFontSize() {
        driver.get(mainPage);
        assertTrue(driver.findElement(By.xpath("//*[@id=\"page_number\"]")).getCssValue("font-size").equalsIgnoreCase( "16px" ));

    }

    @Test
    public  void FormControlHeight() {
        driver.get(mainPage);
        assertTrue(driver.findElement(By.xpath("//*[@id=\"intitle\"]")).getCssValue("height").equalsIgnoreCase( "38px" ));

    }

    @Test
    public  void FormControlBackgroundColor() {
       driver.get(mainPage);
       assertTrue(driver.findElement(By.xpath("//*[@id=\"intitle\"]")).getCssValue("background-color").equalsIgnoreCase( "rgba(247, 247, 247, 1)"));

    }

    @Test
    public  void FormControlBorderColor() {
        driver.get(mainPage);
        assertTrue(driver.findElement(By.xpath("//*[@id=\"intitle\"]")).getCssValue("border-bottom-color").equalsIgnoreCase( "rgba(36, 206, 234, 1)"));
        //System.out.println(driver.findElement(By.xpath("//*[@id=\"intitle\"]")).getCssValue("border-bottom-color"));
    }

    @Test
    public  void FormControlBorderWidth() {
        driver.get(mainPage);
        assertTrue(driver.findElement(By.xpath("//*[@id=\"intitle\"]")).getCssValue("border-bottom-width").equalsIgnoreCase( "1px" ));

    }

    @Test
    public  void FormControlFontColor() {
        driver.get(mainPage);
        assertTrue(driver.findElement(By.xpath("//*[@id=\"intitle\"]")).getCssValue("color").equalsIgnoreCase( "rgba(70, 74, 76, 1)" ));

    }

    @Test
    public  void FormControlFontSize() {
        driver.get(mainPage);
        assertTrue(driver.findElement(By.xpath("//*[@id=\"intitle\"]")).getCssValue("font-size").equalsIgnoreCase( "16px" ));

    }

    @Test
    public  void BtnInfoHeight() {
        driver.get(mainPage);
        assertTrue(driver.findElement(By.xpath("/html/body/center/div/div/div/center/form/div/div[3]/input")).getCssValue("height").equalsIgnoreCase( "38px" ));

    }

    @Test
    public  void BtnInfoColor() {
        driver.get(mainPage);
        assertTrue(driver.findElement(By.xpath("/html/body/center/div/div/div/center/form/div/div[3]/input")).getCssValue("background-color").equalsIgnoreCase( "rgba(91, 192, 222, 1)" ));

    }

    @Test
    public  void BtnInfoFontColor() {
        driver.get(mainPage);
        assertTrue(driver.findElement(By.xpath("/html/body/center/div/div/div/center/form/div/div[3]/input")).getCssValue("color").equalsIgnoreCase( "rgba(255, 255, 255, 1)" ));

    }

    @Test
    public void Search25() throws Exception{
        driver.get(mainPage);
        WebElement listValue = driver.findElement(By.xpath("//*[@id=\"page_number\"]"));
        getSelect(listValue);
        select.selectByVisibleText("25");//25 string on page
        driver.findElement(By.xpath("//*[@id=\"intitle\"]")).sendKeys("intent");//key word "intitle"
        driver.findElement(By.xpath("/html/body/center/div/div/div/center/form/div/div[3]/input")).click();

        //Check number of results and compare layout with picture
        BufferedImage expectedImage = ImageIO.read(new File("./screens/search25intitle.png"));
        Screenshot ResultOfSearch = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(10)).takeScreenshot(driver);
        BufferedImage actualImage = ResultOfSearch.getImage();
        ImageDiffer imgDiff = new ImageDiffer().withIgnoredColor(Color.RED);
        ImageDiff diff = imgDiff.makeDiff(expectedImage, actualImage);
        assertFalse(diff.hasDiff());


    }


}
