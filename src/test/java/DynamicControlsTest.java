import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DynamicControlsTest extends BaseTest {

    @Test
    public void dynamicCheckBoxControlsTest() {
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        driver.findElement(By.xpath("//*[@id='checkbox-example']/button")).click();
        wait.until(ExpectedConditions.attributeContains(By.xpath("//*[@id='checkbox-example']//*[@id='loading']"),
                "style", "display: none;"));
        assertEquals(driver.findElement(By.xpath("//*[@id='checkbox-example']//*[@id='message']")).getText(),
                "It's gone!", "checkbox is present");
    }

    @Test
    public void dynamicInputBoxControlsTest() {
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        assertFalse(driver.findElement(By.xpath("//*[@id='input-example']")).isEnabled(),
                "input is enabled");
        driver.findElement(By.xpath("//*[@id='input-example']/button")).click();
        wait.until(ExpectedConditions.textToBePresentInElementLocated
                (By.xpath("//*[@id='input-example']/*[@id='message']"),
                        "It's enabled!"));
        assertTrue(driver.findElement(By.xpath("//*[@id='input-example']")).isEnabled(),
                "input is disabled");
    }
}
