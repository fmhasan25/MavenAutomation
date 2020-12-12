package Practice;

import Reusable_classes.Customized_library;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;

public class practice_02 extends customized_abstract {


    @Test
    public void MetLifeVerification() throws IOException, InterruptedException {
        ArrayList<String >zipCode=new ArrayList<>();
        zipCode.add("11217");
        zipCode.add("11218");
        zipCode.add("11219");

        ArrayList<String >dentalProgram=new ArrayList<>();
        dentalProgram.add("PPO-LOW");
        dentalProgram.add("PPO-MEDIUM");
        dentalProgram.add("PPO-HIGH");

        ArrayList<String > referralCode= new ArrayList<>();
        referralCode.add("123");
        referralCode.add("456");
        referralCode.add("789");


        driver.navigate().to("https://www.metlife.com");
        Thread.sleep(3000);
       // Customized_library.click(driver, "(//*[contains(text(),'SOLUTIONS')]) [1]", "clicking to the", logger);
        System.out.println(driver.getTitle());
        Customized_library.verifyTitle(driver, "Insurance and Employee Benefits | MetLife", logger);
        Customized_library.mouseHover(driver,"(//*[contains(text(),'SOLUTIONS')]) [1]","Solutions",logger);
        Customized_library.click(driver,"//*[contains(text(),'MetLife TakeAlong Dental')]","DentalProgram",logger);
        for (int i=0; i<zipCode.size();i++){

            Customized_library.click(driver,"//*[contains(text(),'Enroll Now')]","enroll now",logger);
ArrayList<String >Tabs=new ArrayList<>(driver.getWindowHandles());
driver.switchTo().window(Tabs.get(1));
            System.out.println(driver.getTitle());

Customized_library.userInput(driver,"//*[@id='txtZipCode']",zipCode.get(i),"zipCode",logger);
Customized_library.click(driver,"//*[@id='txtZipCodetx']","Go",logger);


            driver.close();
            driver.switchTo().window(Tabs.get(0));
        }//end of the for loop



    }//end of the test annotation


}//end of the java class
