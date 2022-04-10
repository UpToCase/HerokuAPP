import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HoversTest extends BaseTest {

//    Сделать цепочку из действий: наведение на профиль, проверка имени,
//    клик по ссылке, проверка 404 ошибки. Повторить для каждого из профилей,
//    использовать класс ACTIONS и http://stackoverflow.com/questions/17293914/
//    how-to-perform-mouseover-function-in-selenium-webdriver-using-java

    public void moveToPreviousPage() {
        driver.navigate().to("https://the-internet.herokuapp.com/hovers");
    }

    @Test
    public void hoverPossibilityTest() {

        driver.get("https://the-internet.herokuapp.com/hovers");
        Actions actions = new Actions(driver);

        actions
                .moveToElement(driver.findElement(By.xpath("//*[@id='content']//div[1]/img")))
                .build()
                .perform();
        assertEquals(driver.findElement(By.xpath("//*[@id='content']//div[1]/div/h5")).
                getText(), "name: user1", "Wrong username displayed");
        driver.findElement(By.cssSelector("[href='/users/1']")).click();
        assertEquals(driver.findElement(By.xpath("/html/body/h1")).getText(),
                "Not Found", "error massages is not displayed");
        moveToPreviousPage();

        actions
                .moveToElement(driver.findElement(By.xpath("//*[@id='content']//div[2]/img")))
                .build()
                .perform();
        assertEquals(driver.findElement(By.xpath("//*[@id='content']//div[2]/div/h5")).
                getText(), "name: user2", "Wrong username displayed");
        driver.findElement(By.cssSelector("[href='/users/2']")).click();
        assertEquals(driver.findElement(By.xpath("/html/body/h1")).getText(),
                "Not Found", "error massages is not displayed");
        moveToPreviousPage();

        actions
                .moveToElement(driver.findElement(By.xpath("//*[@id='content']//div[3]/img")))
                .build()
                .perform();
        assertEquals(driver.findElement(By.xpath("//*[@id='content']//div[3]/div/h5")).
                getText(), "name: user3", "Wrong username displayed");
        driver.findElement(By.cssSelector("[href='/users/3']")).click();
        assertEquals(driver.findElement(By.xpath("/html/body/h1")).getText(),
                "Not Found", "error massages is not displayed");
    }
}
