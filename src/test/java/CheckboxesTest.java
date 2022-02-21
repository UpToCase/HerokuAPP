import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

public class CheckboxesTest extends BaseTest {
    @Test
    public void checkBoxCanBeCheckedAndUnchecked() {
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        List<WebElement> checkboxList =
                driver.findElements(By.cssSelector("[type='checkbox']"));
        assertFalse(checkboxList.get(0).isSelected(),
                "the first checkbox is checked");
        checkboxList.get(0).click();
        assertTrue(checkboxList.get(0).isSelected(),
                "the first checkbox is unchecked");
        assertTrue(checkboxList.get(1).isSelected(),
                "the second checkbox is unchecked");
        checkboxList.get(1).click();
        assertFalse(checkboxList.get(1).isSelected(),
                "the second checkbox is checked");
    }
}
