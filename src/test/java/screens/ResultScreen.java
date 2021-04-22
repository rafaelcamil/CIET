package screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class ResultScreen extends BaseScreen{
    public ResultScreen(WebDriver driver){
        super(driver);
    }

    public void viewResult(String message){
        WebElement messageResult = driver.findElement(By.cssSelector("#page-top > div:nth-child(3) > div"));
        assertEquals(message, messageResult.getText());
    }
}
