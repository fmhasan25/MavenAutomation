package Day14_05312020;

import Reusable_classes.Abstract_Class;
import Reusable_classes.Reusable_Library;
import Reusable_classes.Reusable_Library_Loggers;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.List;


public class List_Boolean_Abstract extends Abstract_Class {





    @Test
    public void yahoo_verification() throws InterruptedException {

        //open the browser
        logger.log(LogStatus.INFO, "Navigating to yahoo home page");
        driver.navigate().to("https://www.yahoo.com");

        //delay for 3.5 sec
        Thread.sleep(3500);
        logger.log(LogStatus.INFO, "Getting the list count for all links");
        //count the number of links available on page
        System.out.println(driver.findElements(By.tagName("a")).size());

        //count all the links in yahoo homepage and print it
        List<WebElement> linkCount = driver.findElements(By.xpath("//*[contains(@class,'D(ib) Mstart(21px) Mend(17px)')]"));
        System.out.println("Total number of links is " + linkCount.size());


        //verify if linkCount returns you 12 links
        if (linkCount.size() == 12) {
            System.out.println("My yahoo home page link count matches and it is " + linkCount.size());
            logger.log(LogStatus.PASS, "My yahoo home page link count matches and it is " + linkCount.size());
        } else {
            System.out.println("My yahoo home page link count doesn't match and actual is " + linkCount.size());
            logger.log(LogStatus.FAIL, "My yahoo home page link count doesn't match and it is " + linkCount.size());
        }//end of the if-else condition


        //click on sign in link
        Reusable_Library_Loggers.click(driver, "//*[@id='header-profile-menu']", "Sign in",logger);

        //wait few seconds
        Thread.sleep(3000);

        //verify the state of the checkbox is checked for stay signed in section
        boolean checkboxState = driver.findElement(By.xpath("//*[@id='persistent']")).isSelected();
        if (checkboxState == false) {
            System.out.println("Checkbox is not selected by default");
            logger.log(LogStatus.FAIL, "Checkbox is not selected by default");
        } else {
            System.out.println("Checkbox is selected by default");
            logger.log(LogStatus.PASS, "Checkbox is selected by default");
        }//end of the if else condition

    }//end of test suit
}//end of the java class
