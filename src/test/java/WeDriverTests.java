/**
 * Created by macbook on 10.07.17.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WeDriverTests {

    @Test
    void FirstTest () throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/macbook/Desktop/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.random.org/integers/");

        Thread.sleep(500);

        WebElement numInput = driver.findElement(By.cssSelector("input[name='num']"));

        numInput.clear();
        numInput.sendKeys("1");

        WebElement button = driver.findElement(By.cssSelector("input[value='Get Numbers']"));
        button.click();

        Thread.sleep(1000);

        WebElement getNumb = driver.findElement(By.cssSelector("pre[class='data']"));
        System.out.println(getNumb.getText());

        Thread.sleep(2000);



        driver.quit();
    }
}
