import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HerokuAPPTest {

    @Test
    public void anyTest() {
        System.setProperty("webdriver.chrome.driver",
                "src/test/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

//        options.addArguments("--headless");
//        options.addArguments("incognito");
//        WebDriver driver = new ChromeDriver(options);

//        driver.manage().window().maximize();
//        driver.manage().window().setSize(new Dimension(400,800));
//        driver.manage().window().fullscreen();

//        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
//        driver.manage().timeouts().setScriptTimeout(5,TimeUnit.SECONDS);

        driver.get("http:onliner.by");
        driver.quit();
    }
}
