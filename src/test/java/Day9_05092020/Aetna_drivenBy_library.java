package Day9_05092020;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Aetna_drivenBy_library {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/Resource/chromedriver 2");
        //Defining the ChromeOption
        ChromeOptions options = new ChromeOptions();
        //Defining the Incognito command
        options.addArguments("incognito");
        //Defining the WebDriver and ChromeDriver
        WebDriver driver = new ChromeDriver(options);
        String zipcode= "11218";

        driver.navigate().to("http://www.aetna.com/");
        Thread.sleep(3000);
        Libraries_aetna.realTitle(driver, "Aetna");
        Libraries_aetna.ShopForAplan(driver, "(//*[@class='megamenu__primary--item']) [1]", "Shop for a plan");
        Libraries_aetna.clickMedicare(driver, "//*[contains(text(),'Medicare')]", "Medicare");
        Libraries_aetna.findADoctor(driver, "//*[contains(text(),'Find a doctor')]", "Find a doctor");
        Libraries_aetna.medicare4yourself(driver, "(//*[@class='primaryPurple BtnWidth mgbutton w400']) [1]", "2020 Medicare for yourself");
        Libraries_aetna.locationBar(driver, "//input[@id='medZip']","11218","zipcode");
        Libraries_aetna.sliderControl(driver, "//*[@class='rz-pointer rz-pointer-min']",-150);


    }//end of the main method
}//end of the java class
