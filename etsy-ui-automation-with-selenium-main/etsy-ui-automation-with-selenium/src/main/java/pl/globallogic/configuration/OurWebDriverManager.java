package pl.globallogic.configuration;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OurWebDriverManager {

    private final static Logger logger = LoggerFactory.getLogger(OurWebDriverManager.class);
    public static WebDriver getConfiguredWebDriver() {
        logger.info("Configuring web driver instance");
        String browserType = System.getProperty("browser", "chrome").toLowerCase();
        var wdInstance = switch (browserType){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                ChromeOptions opt = new ChromeOptions();
                opt.addArguments("--headless=new");
                yield new ChromeDriver(opt);
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                yield new FirefoxDriver();
            default:
                yield new ChromeDriver();
        };
        return null;
    }
}
