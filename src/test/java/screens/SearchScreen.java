package screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SearchScreen extends BaseScreen{
    public SearchScreen(WebDriver driver) {
        super(driver);
    }

    public SearchScreen sendKeys(String key){
        WebElement textToSearch = driver.findElement(By.id("query"));
        textToSearch.sendKeys(key);

        return new SearchScreen(driver);
    }

    public SearchScreen searchText(){
        WebElement search = driver.findElement(By.cssSelector("#page-top > div:nth-child(2) > form > div > button"));
        search.click();

        return new SearchScreen(driver);
    }

    public SearchScreen selectOption(String option){
        WebElement selectOption = driver.findElement(By.id("type"));
        Select realSelect = new Select(selectOption);
        realSelect.selectByValue(option);

        return new SearchScreen(driver);
    }
}
