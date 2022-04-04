import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class AssertionsExamples {

    WebDriver driver;


    @BeforeTest
    void beforeTest()
    {
        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();

    }

    @Test
    void setUp()
    {


        System.setProperty("Webdriver.chromedriver","/Users/umutbagzade/Drivers/chromedriver.exe");
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    @Test(priority = 1)
    void logoTest(){
        WebElement logo = driver.findElement(By.xpath("//*[@id='divLogo']/img"));
        Assert.assertTrue(logo.isDisplayed(), "Logo is not displayed on the page");
       // Assert.assertFalse(logo.isDisplayed(), "Logo not displayed on the page");
    }

    @Test(priority = 2)
    void homePageTitle()
    {
       String title = driver.getTitle();
       Assert.assertEquals(title,"OrangeHRM", "Title is not matched");
      // Assert.assertEquals(title ,"OrangeHRM123",  " Title is not matched");
    }

    @AfterClass
    void tearDown()
    {
        driver.quit();
    }

}
