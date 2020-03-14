package org.example.google;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertAll;

public class ExampleSearchTest {

    @Test
    void displayGoogleResultTest() {
        String googleText = "what to type in input google";

        System.setProperty("webdriver.gecko.driver", "geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get("http://google.com");

        driver.findElement(By.name("q")).sendKeys(googleText);

        WebElement element = driver.findElement(By.name("btnK"));
//        driver.switchTo().frame(element);

        element.submit();

        // wait until element exist
        WebDriverWait wait = new WebDriverWait(driver, 30);
        By addItem = By.xpath("//div[@class='rc']");
        wait.until(ExpectedConditions.presenceOfElementLocated(addItem));

        // what to find
        By descriptionTextXPath = By.xpath("//*[@class='r']//a//h3");
        List<WebElement> elements = driver.findElements(descriptionTextXPath);

        // display result as aLink or h3 text
        for (WebElement webElement : elements) {
            // for //a
            // System.out.println("Google elements: " + webElement.getAttribute("href"));
            // for //a//h3
            System.out.println("Google elements: " + webElement.getText());
        }
        driver.close();
    }
}
