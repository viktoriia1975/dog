package dog;

import org.junit.Assert;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FirstTest {

    @Test
    public void testFirst() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Администратор\\Desktop\\driver_new\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.get("https://wagwalking.com/");

        String expectedTitle = "WagWalking.com | Trusted Local Dog Walkers, Pet Sitters, Trainers and More";

        String  actualTitle = driver.getTitle();

        Assert.assertEquals(expectedTitle,actualTitle);

        driver.quit();




    }
}
