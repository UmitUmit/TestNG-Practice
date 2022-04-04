import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ParametersExample {

    WebDriver driver;


    @BeforeClass
    @Parameters({"browser", "url"})
    void setUp(String browser, String app)
    {
        if (browser.equalsIgnoreCase("chrome"))
        {
           WebDriverManager.chromedriver().setup();
            //System.setProperty("Webdriver.chrome.driver","/Users/umutbagzade/Drivers/chromedriver.exe");
            driver = new ChromeDriver();

        }
        else if(browser.equalsIgnoreCase("firefox"))
        {
            WebDriverManager.firefoxdriver().setup();
           //System.setProperty("Webdriver.gecko.driver","/Users/umutbagzade/Drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        }

        driver.get(app);


    }


    @Test(priority = 1)
    void logoTest(){
        WebElement logo = driver.findElement(By.xpath("//*[@id='divLogo']/img"));
        Assert.assertTrue(logo.isDisplayed(), "Logo is not displayed on the page");

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
