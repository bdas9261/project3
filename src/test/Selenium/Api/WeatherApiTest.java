package Api;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.http.client.ClientProtocolException;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

@SuppressWarnings("deprecation")
public class WeatherApiTest {
    private WebDriver driver;
    private String baseUrl;
    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\biswanath.a.das\\Desktop\\SeleniumExpertFramework\\Selenium_Framework_V1.0\\chromedriver.exe");
          driver = new ChromeDriver();
            baseUrl = "http://openweathermap.org/current";
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
          }


    @After
    public void tearDown() throws Exception {
         driver.close();
         driver.quit();
    }

    @Test
    public void test() throws ClientProtocolException, IOException {
     driver.get(baseUrl);
     driver.navigate().to("http://api.openweathermap.org/data/2.5/weather?q=London");
     WebElement webElement=driver.findElement(By.tagName("pre"));
     WetherApiResponse weatherApiResponse=new WetherApiResponse();
     String ExpectedString=weatherApiResponse.GetResponse();
     Assert.assertTrue(webElement.getText().equals(ExpectedString));
    }
}
