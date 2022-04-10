import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import javax.swing.*;
import java.io.File;

import static org.testng.Assert.assertEquals;

public class FileUploadTest extends BaseTest{

    @Test
    public void fileUploadTest() {
        driver.get("https://the-internet.herokuapp.com/upload");
        File textFileForDownload = new File("src/test/resources/text.html");
        driver.findElement(By.id("file-upload")).sendKeys(textFileForDownload.getAbsolutePath());
        driver.findElement(By.id("file-submit")).click();
        wait.until(ExpectedConditions.attributeContains(By.id("uploaded-files"),
                "class", "panel text-center"));
        assertEquals(driver.findElement(By.cssSelector(".example")).getText(),
                "File Uploaded!\ntext.html",
                "file do not been uploaded");
    }
}

