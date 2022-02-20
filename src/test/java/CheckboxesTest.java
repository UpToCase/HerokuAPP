import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNull;

public class CheckboxesTest extends BaseTest {
    @Test
    public void checkBoxCanBeCheckedAndUnchecked() {
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        List<WebElement> checkboxList =
                driver.findElements(By.cssSelector("[type='checkbox']"));
        assertNull(checkboxList.get(0).getAttribute("checked"),
                "the first checkbox is checked");
        checkboxList.get(0).click();
        assertEquals(checkboxList.get(0).getAttribute("checked"),
                "true", "the first checkbox is unchecked");
        assertEquals(checkboxList.get(1).getAttribute("checked"),
                "true", "the second checkbox is unchecked");
        checkboxList.get(1).click();
        assertNull(checkboxList.get(1).getAttribute("checked"),
                "the second checkbox is checked");
    }
}
