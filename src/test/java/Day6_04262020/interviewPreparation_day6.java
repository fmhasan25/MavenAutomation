package Day6_04262020;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class interviewPreparation_day6 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver86");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");
        WebDriver driver= new ChromeDriver(options);
        driver.navigate().to("https://www.yahoo.com/");
//        Actions mouse = new Actions(driver);
//        mouse.moveToElement(driver.findElement(By.xpath("//*[@class='HPVvwb']"))).click().perform();
        JavascriptExecutor jsc= (JavascriptExecutor)driver;
        jsc.executeScript("scroll(0,5000)");
        WebElement google = driver.findElement(By.xpath("(//*[@class='StretchedBox']) [1]"));
        jsc.executeScript("arguments[0].scrollIntoView(true);",google);


    }//end of the main method
}//end of the java class
