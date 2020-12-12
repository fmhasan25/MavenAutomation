package Practice;

import Reusable_classes.Customized_library;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.lang.reflect.Method;

public class customized_abstract {
    public static WebDriver driver;
    public static ExtentTest logger;
    public static ExtentReports reports;
    @BeforeSuite
    public static void defineDriver(){
        driver = Customized_library.setDriver();
        reports= new ExtentReports("src/main/java/HTML_Report/practiceTest.html", true);
    }//end of the before suite

    @BeforeMethod
    public static void defineDataDriven(Method TestAnnotation){
        logger=reports.startTest(TestAnnotation.getName());

    }//end of the before method

    @AfterMethod
    public static void endReport(){
        reports.endTest(logger);
    }//end of the after method

    @AfterSuite
    public void endDriver(){

        reports.flush();
        driver.quit();
    }//end of the after suite


}//end of the java class
