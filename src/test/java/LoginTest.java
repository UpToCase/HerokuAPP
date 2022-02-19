import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoginTest extends BaseTest {

    @Test
    public void login() {
        driver.get("https://the-internet.herokuapp.com/login");
        WebElement userName = driver.findElement(By.name("username"));
        userName.sendKeys("tomsmith");
        assertEquals(userName.getAttribute("value"), "tomsmith",
                "Invalid user name entered");
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
        userName.submit();
    }
}
