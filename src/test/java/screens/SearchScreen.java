package screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SearchScreen extends BaseScreen {
    public SearchScreen(WebDriver driver) {
        super(driver);
    }

    public void sendKeys(String key) {
        WebElement textToSearch = driver.findElement(By.id("query"));
        textToSearch.sendKeys(key);

    }

    public void searchText() {
        WebElement search = driver.findElement(By.cssSelector("#page-top > div:nth-child(2) > form > div > button"));
        search.click();

    }

    public void selectOption(String option) {
        WebElement selectOption = driver.findElement(By.id("type"));
        Select realSelect = new Select(selectOption);
        realSelect.selectByValue(option);

    }

    public void clickUser() {
        WebElement user = driver.findElement(By.cssSelector("#page-top > div:nth-child(3) > table > tbody > tr:nth-child(1) > td:nth-child(6) > a"));
        user.click();

    }

    public void profileVerify() {
        WebElement profile = driver.findElement(By.cssSelector("#page-top > div:nth-child(3) > h1"));
        assertTrue(profile.getText().contains("Profile"));

    }

    public void nextPage() {
        WebElement profile = driver.findElement(By.cssSelector("#page-top > div:nth-child(3) > center > ul > li:nth-child(5) > a"));
        profile.click();

    }

    public void pageVerify(String page) {
        WebElement active = driver.findElement(By.cssSelector("#page-top > div:nth-child(3) > center > ul > li.active"));
        assertEquals(active.getText(), page);

    }

}
