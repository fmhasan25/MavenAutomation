package Action_items;

import Reusable_classes.Abstract_Class;
import Reusable_classes.Reusable_Library_Loggers;
import com.relevantcodes.extentreports.LogStatus;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.testng.annotations.Test;

import javax.print.DocFlavor;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class MetLife_Abstract extends Abstract_Class {
    Workbook readableFile;
    Sheet readableSheet;

    @Test
    public void MitLife() throws InterruptedException, IOException, BiffException {
        //Defining the excel path
        readableFile = Workbook.getWorkbook(new File("src/main/java/Excel/MetLife.xls"));
        //Defining the Excel sheet
        readableSheet = readableFile.getSheet(0);

        //printing the extent report message
        logger.log(LogStatus.INFO, "Navigating to MetLife");

        //navigating the MetLife website
        driver.navigate().to("https://www.metlife.com/");
        //Delaying for 2.5 sec
        Thread.sleep(2500);

        //Verifying the title
        Reusable_Library_Loggers.verifyTitle(driver, "Insurance and Employee Benefits | MetLife", logger);

        //Clicking Solution button
        Reusable_Library_Loggers.mouseHover(driver, "//*[contains(text(),'SOLUTIONS')]", "Solution", logger);
        //Delaying for 2.5 sec
        Thread.sleep(2500);

        //Clicking the MetLife takeAlong Dental from drop down
        Reusable_Library_Loggers.click(driver, "//*[contains(text(),'MetLife TakeAlong Dental')]", "Dental", logger);
        //Delaying for 2.5 sec
        Thread.sleep(2500);

        //Verifying the title
        Reusable_Library_Loggers.verifyTitle(driver, "MetLife TakeAlong Dental | MetLife", logger);
        for (int i = 1; i < 4; i++) {
            //Clicking the Enroll now button
            Reusable_Library_Loggers.click(driver, "//*[contains(text(),'Enroll Now')]", "Enroll Now", logger);
            //Delaying for 2.5 sec
            Thread.sleep(2500);

            //Creating Array for the parent-child tab
            ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
            //Switching to the new tab
            driver.switchTo().window(tabs.get(1));

            //Delaying for 3 sec
            Thread.sleep(3000);

            System.out.println(driver.getTitle());
            //Verifying the title of the new page
            Reusable_Library_Loggers.verifyTitle(driver, "MetLife TakeAlong Dental – Dental Insurance", logger);

            //Creating variable for zipCodes from data driven source
            String zipCodes = readableSheet.getCell(0, i).getContents();

            //Entering the zipCode into the search box and hit enter
            Reusable_Library_Loggers.userTypeAndHitEnter(driver, "//*[@class='form-control']", zipCodes, "enter zipcodes and submit", logger);
            //Delaying for 5 sec
            Thread.sleep(5000);

            //Creating variable for dental program from data driven source
            String dentalProgram = readableSheet.getCell(1, i).getContents();

            //Scrolling up to ppo
            Reusable_Library_Loggers.scroll(driver, "//td[contains(text(),'Coverage Type - PPO')]", "Scroll up", logger);
            //Delaying for 5 sec
            Thread.sleep(5000);

            //Selecting the dental program by checkbox
            Reusable_Library_Loggers.click(driver, "//*[@class='" + dentalProgram + "']", "Dental program", logger);

            //Clicking the enroll in program now
            Reusable_Library_Loggers.click(driver, "//a[@id='topenrolltab']", "Enroll in program", logger);

            //Delaying for 2.5 sec
            Thread.sleep(2500);

            //Creating variable for referral Code from data driven source
            String referralCode = readableSheet.getCell(2, i).getContents();
            //Entering the referral code in the insert box
            Reusable_Library_Loggers.userKeys(driver, "//input[@id='txtBxPromocode']", referralCode, "Referral Code", logger);

            //Clicking the go button
            Reusable_Library_Loggers.click(driver, "//button[@id='enrollgobtn']", "Clicking Go", logger);

            //Capturing the error message
            Reusable_Library_Loggers.captureText(driver, "//span[contains(text(),'Referral Code was not recognized')]", "error message", logger);


            //Clicking enroll without promo code
            Reusable_Library_Loggers.click(driver, "//a[@class='btn btn-primaryborder']", "Enroll without referral code", logger);


            //Capturing the text from new page
            String dentalResult = Reusable_Library_Loggers.captureText(driver, "//div[@class='col-sm-8']", "Capturing the search Result", logger);

            //Splitting the dental result
            String[] dProgram = dentalResult.split(" ");

            //Printing the desired dental program
            System.out.println("The search result is " + dProgram[3]);

            //Capturing screen shot of the page
            Reusable_Library_Loggers.getScreenShot(driver,logger,"Desired dental program"+dProgram[3]);

            //Closing the current windows
            driver.close();

            //Switching to the parent window
            driver.switchTo().window(tabs.get(0));

        }//end of the for loop

    }//end of the test method

}//end of the java class
