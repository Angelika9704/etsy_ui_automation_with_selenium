package pl.globallogic.wdcapabilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TimeoutDemoTest extends BaseCapabilitiesDemoTest {

    @Test
    public void shouldWaitForLandscapeImageToBeVisible() {
        driver.get(LOADING_IMAGES);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement landscapeImage = driver.findElement(By.id("landscape"));
        Assert.assertTrue(landscapeImage.getAttribute("src").contains("landscape"));
    }

    @Test
    public void shouldWaitUntilCalculationResultWillBePresent() {
        driver.get(SLOW_CALCULATOR);
        WebElement calculatorScreen = driver.findElement(By.className("screen"));
        String expectedResult = "9";
        // 7 + 2 = 9
        driver.findElement(By.xpath("//span[text()='7']")).click();
        driver.findElement(By.xpath("//span[text()='+']")).click();
        driver.findElement(By.xpath("//span[text()='2']")).click();
        driver.findElement(By.xpath("//span[text()='=']")).click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(
                ExpectedConditions.textToBe(By.className("screen"), expectedResult)
        );
        sleep();
        Assert.assertEquals(calculatorScreen.getText(), expectedResult);
    }
}
