package screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class BaseScreen {
    protected WebDriver driver;

    public BaseScreen(WebDriver driver){
        this.driver = driver;
    }

    public void goHome() {
        driver.navigate().to("https://opentdb.com/");
        assertEquals("Open Trivia DB: Free to use, user-contributed trivia question database.", driver.getTitle());
    }

    public void navigateToSearch(){
        WebElement element = driver.findElement(By.cssSelector("#page-top > section > div > div > div > a:nth-child(4)"));
        element.click();
    }
}
