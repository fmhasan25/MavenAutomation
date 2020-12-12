package Day7_05022020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class Google_Test_TryCatch {
    public static void main(String[] args) throws InterruptedException {

        //webdriver.chrome.driver needs to be in lower case string followed by your driver path
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver 2");

        WebDriver driver = new ChromeDriver();
        //you declare and define the web driver
        //set the ArrayList for the cars
        //don't need to define the size/lendth and also don't need to define the index numbers
        //it's a resizable array
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Lexus");
        cars.add("Toyota");
        cars.add("BMW");
        for (int i = 0; i < cars.size(); i++) {

            driver.navigate().to("https://www.google.com");
            Thread.sleep(2000);
            driver.manage().window().maximize();

            try {
                driver.findElement(By.xpath("//*[@name='q']")).sendKeys(cars.get(i));
            } catch (Exception e) {
                System.out.println("Unable to ienter data on Search field " + e);
            }//end of search field exception

            try {
                driver.findElement(By.xpath("//*[@name='btnK']")).submit();
            } catch (Exception e) {
                System.out.println("Unable to submit on search icon " + e);

            }//end of search field exception
            Thread.sleep(3000);

            try {
                //to capture a text from web site you need to
                String message = driver.findElement(By.xpath("//*[@id='result-stats']")).getText();
                String[] arrayResult = message.split(" ");
                System.out.println("My search number is " + arrayResult[1]);
            } catch (Exception e) {
                System.out.println("Unable to capture on Search Result " + e);
            }//end of search field exception
            //when you inspect an element and most of the time it takes you to the lowest tag and property withing it
            //but i can still use the tags before and the properties of it as long as it highlights the same element in the page
            Thread.sleep(3000);
        }
        //quit the drive
        driver.quit();

    }//end of main method
}//end of java class
