import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SortableDataTables extends BaseTest {

    //Проверить содержимое нескольких (3-5) ячеек, использовать
    // XPATH типа //table//tr[1]//td[1]-получение первой ячейки
    //из первого ряда первой таблицы и так далее

    @Test
    public void checkTablesContent() {
        driver.get("https://the-internet.herokuapp.com/tables");

        assertEquals(driver.findElement(By.xpath("//table[@id='table1']//tr[1]//td[1]")).
                getText(), "Smith", "wrong Last name");
        assertEquals(driver.findElement(By.xpath("//table[@id='table1']//tr[3]//td[4]")).
                getText(), "$100.00", "wrong due");
        assertEquals(driver.findElement(By.xpath("//table[@id='table1']//tr[4]//td[5]")).
                        getText(), "http://www.timconway.com",
                "wrong web site");

        assertEquals(driver.findElement(By.xpath("//*[@id='table2']//tr[1]/td[1]")).
                getText(), "Smith", "wrong Last name");
        assertEquals(driver.findElement(By.xpath("//table[@id='table2']//tr[3]//td[4]")).
                getText(), "$100.00", "wrong due");
        assertEquals(driver.findElement(By.xpath("//table[@id='table2']//tr[4]//td[5]")).
                        getText(), "http://www.timconway.com",
                "wrong web site");
    }
}
