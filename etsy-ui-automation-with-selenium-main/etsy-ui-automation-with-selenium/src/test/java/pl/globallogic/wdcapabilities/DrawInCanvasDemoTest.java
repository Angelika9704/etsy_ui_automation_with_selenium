package pl.globallogic.wdcapabilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DrawInCanvasDemoTest extends BaseCapabilitiesDemoTest{

    @Test
    public void shouldDrawACircleInCanvas() {
        driver.get(DRAW_IN_CANVAS);
        Actions actions = new Actions(driver);
        WebElement canvas = driver.findElement(By.tagName("canvas"));
        sleep();
        actions.moveToElement(canvas).clickAndHold();
        drawCircle(actions);
        actions.release(canvas).build().perform();

    }

    private void drawCircle(Actions actions) {
        int numPoints = 30;
        int radius = 10;
        for (int i = 0; i <= numPoints; i++) {
            double angle = Math.toRadians(360 * i / numPoints);
            double x = Math.sin(angle) * radius;
            double y = Math.cos(angle) * radius;
            actions.moveByOffset((int)x, (int)y);
        }
    }
}
