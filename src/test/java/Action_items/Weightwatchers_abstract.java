package Action_items;

import Reusable_classes.Abstract_Class;
import Reusable_classes.Reusable_Library_Loggers;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Weightwatchers_abstract extends Abstract_Class {

    @Test
    public void weightWatchers() throws InterruptedException {
        //define the String array variable
        String[] zipcode = new String[3];
        zipcode[0] = "11218";
        zipcode[1] = "11219";
        zipcode[2] = "11220";
        logger.log(LogStatus.INFO, "Navigate to weght watchers website");
        //Navigate to weight watchers website
        driver.navigate().to("https://www.weightwatchers.com");
        Thread.sleep(2000);

        //verify the title
        Reusable_Library_Loggers.verifyTitle(driver, "WW (Weight Watchers): Weight Loss & Wellness Help | WW USA", logger);

        for (int i = 0; i < zipcode.length; i++) {
            //Clicking find a workshop
            Reusable_Library_Loggers.click(driver, "(//*[contains(text(),'Find a Workshop')]) [1]", "Find a workshop", logger);


            //Clicking the searchBox
            Reusable_Library_Loggers.click(driver, "//*[@id='meetingSearch']", "Search box", logger);

            //enter the zip code inside the box
            Reusable_Library_Loggers.userTypeAndHitEnter(driver, "//*[@id='meetingSearch']", zipcode[i], "inserting zipcode", logger);

            //Clicking the search button
            Reusable_Library_Loggers.click(driver, "//button[@class='btn spice-translated']", "search button", logger);

            //Clicking the desired studio link
            Reusable_Library_Loggers.ClickByIndex(driver, "//*[@class='location__top']", 4 - i, "clicking the link", logger);
            Thread.sleep(3000);

            System.out.println(driver.getTitle());

            //Capturing the Studio Name and Address
            Reusable_Library_Loggers.captureText(driver, "//*[@class='location']", "Studio name and Address", logger);

            //Capturing the Schedule of the Selected Studio
            //Reusable_Library_Loggers.captureText(driver,"//*[@class='meeting-schedule meeting-detail-bottom-section']","Schedule",logger);
            Reusable_Library_Loggers.captureText(driver,"//*[contains(@class,'meeting-schedule ')]","Schedule",logger);


        }//end of the for loop

    }//end of the test suite

}//end of the java class

