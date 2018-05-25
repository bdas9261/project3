package scripts;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import BusinessClass.Home;
import driver.EnvironmentVariables;
import driver.GenericMethods2;

public class travels {
GenericMethods2 gm = new GenericMethods2();
  Home h=new Home();
   WebDriver  driver ;
  //public static  WebDriver driver;

    ExtentReports reports ;
    ExtentTest logger;


        @BeforeClass()
            public void Open() throws InterruptedException {
               // System.setProperty(EnvironmentVariables.driverType1, EnvironmentVariables.driverPath1);
            /*    DesiredCapabilities capabilitiesIE = DesiredCapabilities.internetExplorer();
                capabilitiesIE.setCapability("initialBrowserUrl", "https://my-page:9443");
                capabilitiesIE.setCapability(
                    InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
                 //driver = new ChromeDriver();
                driver = new InternetExplorerDriver(capabilitiesIE);
               driver = new ChromeDriver();*/

            driver=new FirefoxDriver();
            driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                driver.get(EnvironmentVariables.URL1);
                String timeStamp =  new SimpleDateFormat("MM-dd-yyyy_HH-ss").format(new GregorianCalendar().getTime()) ;

                reports = new ExtentReports("C:\\Users\\biswanath.a.das\\Desktop\\SeleniumExpertFramework\\Selenium_Framework_V1.0\\extentReports\\Report.html");


                //reports = new ExtentReports(EnvironmentVariables.reportPath);
                logger = reports.startTest("Aetna Automation - METD");

            }


    @Test(dataProvider="AccessManagement")
    public void businessAdvisorValidation(String flag,String action,String url,String userName,String passWord,String firstName,String LastName,String Phone,String Email,String Address,String City,String State,String PostalCode,String Country, String Username,String Password,String ConfirmPassword,String Username1,String pasword1,String passengerno,String Departingfrom,String DepartingfromDate_month,String DepartingfromDate_date,String Arrivingin,String Returning_month,String Returning_date,String Airlines)
    {
        if (flag.equalsIgnoreCase("y"))
        {

             if (action.equalsIgnoreCase("Register")) {
                System.out.println("driver :" + driver);

                gm.logInfo(logger, "Entered into Register Method", driver);
                gm.logInfo(logger, "***********************************************************************************************************");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                h.Register(driver, firstName, LastName, Phone, Email, Address, City, State, PostalCode, Country, Username, Password, ConfirmPassword, logger);
                gm.logInfo(logger, "***********************************************************************************************************");
            }
            // Navigate to Application
            else if (action.equalsIgnoreCase("Signin")) {
                gm.logInfo(logger, "Entered into Signin Method", driver);
                gm.logInfo(logger, "***********************************************************************************************************");
                h.Signin(driver, Username1, pasword1, logger);
                gm.logInfo(logger, "***********************************************************************************************************");
            }
            else if (action.equalsIgnoreCase("TraveDetails")) {
                gm.logInfo(logger, "Entered into TraveDetails Method", driver);
                gm.logInfo(logger, "***********************************************************************************************************");
                h.TraveDetails(driver, passengerno, Departingfrom, DepartingfromDate_month, DepartingfromDate_date, Arrivingin, Returning_month, Returning_date, Airlines, logger);
                gm.logInfo(logger, "***********************************************************************************************************");
            }
        }
    }

    @DataProvider(name="AccessManagement")
    public Object[][] getData()
    {
        Object[][] c1 = gm.getExcelData(EnvironmentVariables.dataPoolPath, "AccessManagement");
        return c1;
    }

    @AfterClass
    public void tearDown()
    {
        reports.endTest(logger);
        reports.flush();
    }
}
