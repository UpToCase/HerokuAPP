import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class AddRemoveElementTest extends BaseTest {

    @Test
    public void elementCanBeAddedAndRemoved() {
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        WebElement addButton = driver.findElement
                (By.cssSelector("[onclick='addElement()']"));
        addButton.click();
        addButton.click();
        List<WebElement> deleteButtons = driver.
                findElements(By.cssSelector("[onclick='deleteElement()']"));
        assertEquals(deleteButtons.size(), 2,
                "there are no 2 buttons on the page");
        deleteButtons.get(0).click();
        deleteButtons = driver.
                findElements(By.cssSelector("[onclick='deleteElement()']"));
        assertEquals(deleteButtons.size(), 1,
                "there is no one buttons on the page");
    }
}

