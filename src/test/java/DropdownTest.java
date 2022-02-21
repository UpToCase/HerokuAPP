import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DropdownTest extends BaseTest {
    @Test
    public void dropdownElementsExistAndCanBeChosen() {
        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement dropdown = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropdown);

        assertEquals(select.getAllSelectedOptions().size(), 1,
                "not all elements are available");

        select.selectByIndex(1);
        assertEquals(select.getFirstSelectedOption().getText(), "Option 1",
                "first select in dropdown is not been chosen");

        select.selectByIndex(2);
        assertEquals(select.getFirstSelectedOption().getText(), "Option 2",
                "second select in dropdown is not been chosen");
    }
}
