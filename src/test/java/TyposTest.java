import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class TyposTest extends BaseTest {
//    Проверить соотвествие параграфа орфографии.
//    Локатор BY.tagName ("p").

    @Test
    public void spellingCheckTest() {
        driver.get("https://the-internet.herokuapp.com/typos");
        WebElement textToBeSpellingCheck =
                driver.findElement(By.xpath("//div[@class='example']/p[2]"));
        assertEquals(textToBeSpellingCheck.getText(),
                "Sometimes you'll see a typo, other times you won't.",
                "there is a mistake in this text");
    }
}
