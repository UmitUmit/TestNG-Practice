package paralleltesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ParrallelTest2 {

    WebDriver driver;

    @Test
    void LoginTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Drivers/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://opensource-demo-orangehrmlive.com/");

        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Admin123");
        driver.findElement(By.id("txtLogin")).click();

        Assert.assertEquals(driver.getTitle(), "OrangeHRM");
        Thread.sleep(5000);


    }

    @AfterMethod
    void tearDown()
    {
        driver.quit();
    }
}
