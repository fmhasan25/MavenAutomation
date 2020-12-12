package Day7_05022020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class met_life_tabs {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/Resource/chromedriver 2");
        //Define the ChromeOptions variable
        ChromeOptions options = new ChromeOptions();
        //set the arguments for incognito
        options.addArguments("incognito");
        //Defining  chrome driver
        WebDriver driver = new ChromeDriver(options);
        //opening the browser
        driver.navigate().to("https://www.metlife.com");
        Thread.sleep(2500);
        try {
            driver.findElement(By.xpath("//*[contains(text(),'SOLUTIONS')]")).click();
        } catch (Exception e) {
            System.out.println("Unable to click on SOLUTIONS " + e);
        }//end of SOLUTION tab exception
        try {
            driver.findElement(By.xpath("//*[contains(text(),'MetLife TakeAlong Dental')]")).click();
        } catch (Exception e) {
            System.out.println("Unable to click on MetLife TakeAlong Dental " + e);
        }//end of SOLUTION tab exception
        Thread.sleep(3500);
        try {
            driver.findElement(By.xpath("//*[contains(text(),'Enroll Now')]")).click();
        } catch (Exception e) {
            System.out.println("Unable to click on Enroll Now " + e);
        }//end of SOLUTION tab exception
        //now define the ArrayList to all current tabs that are open
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        //enter your zop code
        try {
            driver.findElement(By.xpath("//*[@class='form-control']")).sendKeys("11218");

        } catch (Exception e) {
            System.out.println("Unable to click on Enroll Now " + e);
        }//end of zip code exception
        Thread.sleep(2000);
        driver.close();
        //i want to close this tabtxtZipCode
        driver.switchTo().window(tabs.get(0));

    }//end of main method
}//end of the java class
