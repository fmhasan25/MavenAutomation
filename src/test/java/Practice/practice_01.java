package Practice;

import Reusable_classes.Reusable_Library_Loggers;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.List;

public class practice_01 {
WebDriver driver;
ExtentTest logger;
ExtentReports reports;
    @BeforeSuite
    public void defineDriver(){
      driver= Reusable_Library_Loggers.setDriver();
      reports= new ExtentReports("src/main/java/HTML_Report/booleanReport.html",true);

    }//end of the before suit

    @Test
    public void yahooVerification(){
        logger = reports.startTest("Yahoo verification");
        logger.log(LogStatus.INFO,"Navigating to the browser");
        driver.navigate().to("https://www.yahoo.com");

List<WebElement> links = driver.findElements(By.xpath("//*[contains(@class,'D(ib) Mstart(21px) Mend(17px)')]"));

System.out.println(links.size());
        if(links.size()==12){
            System.out.println("Number of link is 12");
        }else{
            System.out.println("Number of link isn't 12");
        }
        logger.log(LogStatus.PASS,"clicking the signin");
driver.findElement(By.xpath("//*[@id='header-profile-menu']")).click();
        Boolean CheckboxState = driver.findElement(By.xpath("//*[@type='checkbox']")).isSelected();
        if(CheckboxState==true){
            System.out.println("checkbox is selected by default");
            logger.log(LogStatus.PASS,"checkbox is selected");
        }else{
            System.out.println("Checkbox is not selected by default");
            logger.log(LogStatus.FAIL,"checkbox isn't selected");
        }
        reports.endTest(logger);

    }//end of the test

    @AfterSuite
    public void endTest(){
        logger.log(LogStatus.INFO,"quitting the driver");
        reports.flush();
        driver.quit();


    }//end of the after suit


}//end of the java class
