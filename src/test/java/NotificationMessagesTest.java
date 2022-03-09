import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NotificationMessagesTest extends BaseTest {

//    Notification Messages - кликнуть на кнопку, дождаться появления нотификации,
//    проверить соотвествие текста ожиданиям

    @Test
    public void checkNotification() {

        driver.get("https://the-internet.herokuapp.com/notification_message_rendered");
        driver.findElement(By.cssSelector("[href='/notification_message']")).click();

        assertEquals(driver.findElement(By.id("flash")).getText(),
                "Action successful" + "\n×",
                "Action is not successful");
    }

}
