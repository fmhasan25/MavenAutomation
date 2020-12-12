package Day4_04192020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Test {
    public static void main(String[] args) throws InterruptedException {

        //webdriver.chrome.driver needs to be in lower case string followed by your driver path
        System.setProperty("webdriver.chrome.driver", "src/Resource/chromedriver 2");

        //you declare and define the Webdriver
        WebDriver driver = new ChromeDriver();
        //opening the browser automatically
        //driver.get("https://google.com");
        driver.navigate().to("https://www.google.com");
        //make the delay
        Thread.sleep(2000);//wait few seconds after navigating to a page so browser can load property
        //maximize screen
        driver.manage().window().maximize();//maximize your browser
        //put car in the search box

        driver.findElement(By.name("q")).sendKeys("cars");
        //driver.findElement(By.className("btnK")).click();
      //press enter
        driver.findElement(By.name("btnK")).submit();
        //make the delay
        Thread.sleep(3000);
        //puttting it into a String array
        String message = driver.findElement(By.id("result-stats")).getText();
        //print the results of search
        // System.out.println(driver.findElement(By.id("result-stats")).getText());
        //close vs quite the session
        //quit will kill the driver from your task memory
        //close will only close the driver but not from your memory
        //I prefer to use quit

        String[] arrayResult = message.split(" ");
        //print the index of the array
        System.out.println("My search number is " + arrayResult[1]);
        Thread.sleep(3000);

        //quit the drive
        driver.quit();

//set the system chrome driver path at least once in one of your main method

    }//end of main method
}//end of java class
