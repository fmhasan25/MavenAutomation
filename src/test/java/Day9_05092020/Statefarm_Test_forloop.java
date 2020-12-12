package Day9_05092020;


import Reusable_classes.Reusable_Library;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class Statefarm_Test_forloop {

    public static void main(String[] args) throws InterruptedException {
        //set the chrome path
        System.setProperty("webdriver.chrome.driver", "src/Resource/chromedriver 2");
        //set some pre conditions using ChromeOptions
        ChromeOptions options = new ChromeOptions();
        //set the arguments you want for the driver
        options.addArguments("incognito");
        //now simply define your chrome driver
        WebDriver driver = new ChromeDriver(options);
        ArrayList<String> zipCode = new ArrayList<>();
        zipCode.add("11218");
        zipCode.add("11219");
        ArrayList<String>ProductType= new ArrayList<>();
        ProductType.add("homeowner");
        ProductType.add("auto");
        //driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        for (int i = 0; i < zipCode.size(); i++){
            //navigate to mortgage calculator home page
            driver.navigate().to("https://www.statefarm.com");

        Thread.sleep(2500);

        //call my reusable method to compare title
        Reusable_Library.verifyTitle(driver, "Auto, Life Insurance");
        //call my reusable method to select product drop down
        Reusable_Library.dropdownByText(driver, "//*[@id='popDropdown']", ProductType.get(i), "Product Dropdown");
        //call my reusable method to enter a zipcode
        Reusable_Library.userKeys(driver, "//*[@id='quote-main-zip-code-input']", zipCode.get(i), "zipCode");
        //call my reusable method to click on quote
        Reusable_Library.click(driver, "//*[text()='Start Quote']", "Start Quote");

    }//end of the for loop

    }//end of main



}//end of java class
