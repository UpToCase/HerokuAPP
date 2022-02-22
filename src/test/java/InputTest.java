import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class InputTest extends BaseTest {
//    Проверить на возможность ввести различные цифровые
//    и нецифровые значения, используя Keys.ARROW_UP и
//    Keys.ARROW_DOWN. Локатор BY.tagName("input").

    @Test
    public void possibilityInputNumericAndNonNumericValues() {

        driver.get("https://the-internet.herokuapp.com/inputs");
        WebElement inputElement = driver.
                findElement(By.xpath("//input[@type='number']"));

        inputElement.sendKeys(Keys.ARROW_UP);
        assertEquals(inputElement.getAttribute("value"),
                "1", "invalid input digits result");
        inputElement.clear();

        inputElement.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN);
        assertEquals(inputElement.getAttribute("value"),
                "-2", "invalid input digits result");
        inputElement.clear();

        inputElement.sendKeys(Keys.NUMPAD1, Keys.NUMPAD3);
        assertEquals(inputElement.getAttribute("value"),
                "13", "invalid input digits result");
        inputElement.clear();

        inputElement.sendKeys("abc");
        assertEquals(inputElement.getAttribute("value"), "",
                "some letters have been input");
        inputElement.clear();

        inputElement.sendKeys("!@#$%^&*()_+");
        assertEquals(inputElement.getAttribute("value"),
                "", "some characters have been input");
        inputElement.clear();
    }
}
