import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FramesTest extends BaseTest {

    @Test
    public void framesTest() {
        driver.get("https://the-internet.herokuapp.com/frames");
        driver.findElement(By.partialLinkText("iFrame")).click();
        driver.switchTo().frame("mce_0_ifr");
        assertEquals(driver.findElement(By.id("tinymce")).getText(),
                "Your content goes here.", "there is no necessary text");
    }
}
