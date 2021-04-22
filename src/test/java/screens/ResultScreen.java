package screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ResultScreen extends BaseScreen{
    public ResultScreen(WebDriver driver){
        super(driver);
    }

    public void messageVerify(String message){
        WebElement messageResult = driver.findElement(By.cssSelector("#page-top > div:nth-child(3) > div"));
        assertEquals(message, messageResult.getText());

    }

    public void viewResult(){
        WebElement table = driver.findElement(By.cssSelector("#page-top > div:nth-child(3) > table > tbody"));
        assertTrue(table.isDisplayed());

    }

    public void listCount(int itens){
        List<WebElement> table = driver.findElements(By.cssSelector("#page-top > div:nth-child(3) > table > tbody > tr"));
        assertEquals(itens,table.size());

    }

    public void viewPageControl(){
        WebElement pageControl = driver.findElement(By.cssSelector("#page-top > div:nth-child(3) > center > ul"));
        assertTrue(pageControl.isDisplayed());

    }
}
