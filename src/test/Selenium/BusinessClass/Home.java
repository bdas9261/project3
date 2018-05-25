package BusinessClass;

import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import driver.EnvironmentVariables;
import driver.GenericMethods2;
import pageObjects.Phptravels;

public class Home {

    ExtentReports reports ;
    ExtentTest logger;
    GenericMethods2 gm=new GenericMethods2();
    DesiredCapabilities capabilitiesIE = DesiredCapabilities.internetExplorer();

       public void Register(WebDriver driver,String firstName,String LastName,String Phone,String Email,String Address,String City,String State,String PostalCode,String Country,String Username,String Password,String ConfirmPassword,ExtentTest logger){
         try {

         gm.clickLink(driver, Phptravels.Register, "Register", logger);
         gm.logInfo(logger, "Click on the Register Link", driver);

         gm.enterText(driver, Phptravels.firstName, firstName, "firstName", logger);
         gm.logInfo(logger, "Enter the FirstName in to the FirstNmae TextBox", driver);

         gm.enterText(driver, Phptravels.LastName, LastName, "LastName", logger);
         gm.logInfo(logger, "Enter the LastName in to the FirstNmae TextBox", driver);

         gm.enterText(driver, Phptravels.Phone, Phone, "Phone", logger);
         gm.logInfo(logger, "Enter the Phone No. in to the Phone TextBox", driver);

         gm.enterText(driver, Phptravels.Email, Email, "Email", logger);
         gm.logInfo(logger, "Enter the Email in to the Email TextBox", driver);
         ;
         gm.enterText(driver, Phptravels.Address, Address, "Address", logger);
         gm.logInfo(logger, "Enter the Address in to the Address TextBox", driver);

         gm.enterText(driver, Phptravels.City, City, "City", logger);
         gm.logInfo(logger, "Enter the City in to the City TextBox", driver);

         gm.enterText(driver, Phptravels.State, State, "State", logger);
         gm.logInfo(logger, "Enter the State in to the State TextBox", driver);

         gm.enterText(driver, Phptravels.PostalCode, PostalCode, "PostalCode", logger);
         gm.logInfo(logger, "Enter the PostalCode in to the PostalCode TextBox", driver);

          Thread.sleep(4000);

          gm.selectValueFromListByText(driver, Phptravels.Country, Country, "Country", logger);
          gm.logInfo(logger, "Select the Country As in Country DropDown", driver);
          gm.enterText(driver, Phptravels.Username, Username, "Username", logger);
          gm.logInfo(logger, "Enter the Username in Username Field", driver);
          gm.enterText(driver, Phptravels.Password, Password, "Password", logger);
          gm.logInfo(logger, "Enter the ConfirmPassword in ConfirmPassword Field", driver);
          gm.enterText(driver, Phptravels.ConfirmPassword, "ConfirmPassword", "ConfirmPassword", logger);
          gm.logInfo(logger, "Enter the ConfirmPassword in ConfirmPassword Field", driver);
           gm.clickLink(driver, Phptravels.SubmitBtn, "SubmitBtn", logger);
           gm.logInfo(logger, "Click on the Submit button", driver);

         } catch (Exception e) {
             // TODO Auto-generated catch block
             e.printStackTrace();
         }
       }

  public void Signin(WebDriver driver,String Username1,String pasword1,ExtentTest logger){
        gm.clickLink(driver, Phptravels.SignIn, "SignIn", logger);
        gm.logInfo(logger, "Click on the SignIn button", driver);

        gm.enterText(driver, Phptravels.username1, Username1, "username1", logger);
        gm.logInfo(logger, "Enter username in username field", driver);

        gm.enterText(driver, Phptravels.password1, pasword1, "password1", logger);
        gm.logInfo(logger, "Enter password in password field", driver);

        gm.clickLink(driver, Phptravels.submitbtn1, "submitbtn", logger);
        gm.logInfo(logger, "Click on the submitbtn button", driver);

          }
  public void TraveDetails(WebDriver driver,String passengerno,String Departingfrom,String DepartingfromDate_month,String DepartingfromDate_date,String Arrivingin,String Returning_month,String Returning_date,String Airlines,ExtentTest logger){
      gm.clickLink(driver, Phptravels.traveltype, "traveltype", logger);
      gm.logInfo(logger, "Select the Travel Type", driver);

      gm.selectValueFromListByText(driver, Phptravels.Passenger, passengerno, "Passenger", logger);
      gm.logInfo(logger, "Select the no of passengers", driver);

      gm.selectValueFromListByText(driver, Phptravels.Departingfrom, passengerno, "Departingfrom", logger);
      gm.logInfo(logger, "Select the Deparature Place", driver);

      gm.selectValueFromListByText(driver, Phptravels.DepartingfromDate_month, DepartingfromDate_month, "DepartingfromDate", logger);
      gm.logInfo(logger, "Select the Deparature Month", driver);

      gm.selectValueFromListByText(driver, Phptravels.DepartingfromDate_date, DepartingfromDate_month, "DepartingfromDate", logger);
      gm.logInfo(logger, "Select the Deparature Date", driver);

      gm.selectValueFromListByText(driver, Phptravels.Arrivingin, Arrivingin, "Arrivingin", logger);
      gm.logInfo(logger, "Select the Arrival Place", driver);

      gm.selectValueFromListByText(driver, Phptravels.Returning_month, Returning_month, "Returning_month", logger);
      gm.logInfo(logger, "Select the REturning Month", driver);

      gm.selectValueFromListByText(driver, Phptravels.Returning_date, Returning_date, "Returning_date", logger);
      gm.logInfo(logger, "Select the REturning Date", driver);

      gm.clickLink(driver, Phptravels.ServiceClass, "ServiceClass", logger);
      gm.logInfo(logger, "Select the Serviveclass", driver);

      gm.selectValueFromListByText(driver, Phptravels.Airlines, Airlines, "Airlines", logger);
      gm.logInfo(logger, "Select the Airlines", driver);

      gm.clickLink(driver, Phptravels.Continue, "Continue", logger);
      gm.logInfo(logger, "Click on Continue Button to0 book the Ticket", driver);



  }

     public WebDriver open(){
         WebDriver driver;
         System.setProperty(EnvironmentVariables.driverType, EnvironmentVariables.driverPath);
         capabilitiesIE.setCapability(
             InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
         driver = new InternetExplorerDriver(capabilitiesIE);

         /*driver = new ChromeDriver();*/
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         driver.get(EnvironmentVariables.URL1);
        return driver;

         // Extend Reports
        /* reports = new ExtentReports(EnvironmentVariables.reportPath);
         logger = reports.startTest("DEI Automation - Business Advisor");*/
     }

}
