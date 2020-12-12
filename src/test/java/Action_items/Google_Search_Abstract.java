package Action_items;

import Reusable_classes.Abstract_Class;
import Reusable_classes.Reusable_Library_Loggers;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Google_Search_Abstract extends Abstract_Class {

    @Test
    public void googleSearch() throws InterruptedException {
        ArrayList<String> sports = new ArrayList<>();
        sports.add("Football");
        sports.add("Cricket");
        sports.add("Hockey");

        logger.log(LogStatus.INFO, "Navigating to google browser");
        //Navigate to google browser
        driver.navigate().to("https://www.google.com");
        //Delay for 2.5 sec
        Thread.sleep(2500);
        for (int i = 0; i < sports.size(); i++) {

            // entering the value inside the search box and hit submit
            Reusable_Library_Loggers.userTypeAndHitEnter(driver, "//*[@name='q']", sports.get(i), "input and submit", logger);

            //Delaying for 2.5 sec
            Thread.sleep(2500);

            //Defining a variable for capturing the search results and
            String searchResult = Reusable_Library_Loggers.captureTextWithoutPrinting(driver, "//*[@id='result-stats']", "Search Result", logger);

            //Splitting the search result
            String[] fractionOfResult = searchResult.split(" ");

            //Printing the desired search result
            System.out.println("The search result of " + sports.get(i) + "is " + fractionOfResult[1]);

        }//end of for loop
    }//end of the test method
}//end of the java class
