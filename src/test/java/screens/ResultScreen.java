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

    public ResultScreen viewResult(String message){
        WebElement messageResult = driver.findElement(By.cssSelector("#page-top > div:nth-child(3) > div"));
        assertEquals(message, messageResult.getText());

        return new ResultScreen(driver);
    }

    public ResultScreen listCount(int itens){
        List<WebElement> table = driver.findElements(By.cssSelector("#page-top > div:nth-child(3) > table > tbody > tr"));
        assertEquals(itens,table.size());

        return new ResultScreen(driver);
    }

    public ResultScreen viewPageControl(){
        WebElement pageControl = driver.findElement(By.cssSelector("#page-top > div:nth-child(3) > center > ul"));
        assertTrue(pageControl.isDisplayed());

        return new ResultScreen(driver);
    }
}
