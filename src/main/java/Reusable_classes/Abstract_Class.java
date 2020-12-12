package Reusable_classes;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.lang.reflect.Method;

public class Abstract_Class {

    //You need set the global variables as public static in order
    //to be used on your @test classes
    public static WebDriver driver;
    public static ExtentReports reports;
    public static ExtentTest logger;

    //define before suite to set a static driver
    @BeforeSuite
    public void defineDriver() {
        driver= Reusable_Library_Loggers.setDriver();
        //define the report path as usual
        reports = new ExtentReports("src/main/java/HTML_Report/TestReport.html", true);
    }//end of before suite


    //before method will be used to capture a unique @test name that you gave
    //on your test class
    @BeforeMethod
    public void getMethodName(Method methodName) {
       //start the logger here to capture specific @Test method name
        logger = reports.startTest(methodName.getName());
    }//end of the before method



    //After method will end each test
    @AfterMethod
    public void endTest() {

        reports.endTest(logger);
    }//end of after method


    //after suite will quit and flush
    @AfterSuite
    public void closeInfo() {
        //quite the driver
        driver.quit();
        reports.flush();
    }//end of after suite


}//end of the java class
