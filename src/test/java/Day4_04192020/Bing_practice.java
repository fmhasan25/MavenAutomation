package Day4_04192020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bing_practice {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/Resource/chromedriver 2");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com");
String [] sport= new String[3];

        sport[0] = "Soccer";
        sport[1] = "Cricket";
        sport[2] = "Tennis";


        for (int i=0; i<sport.length;i++) {
            driver.findElement(By.xpath("//input[@name='q']")).sendKeys(sport[i]);
            driver.findElement(By.xpath("//input[@name='q']")).submit();
            String message = driver.findElement(By.xpath("//div[@id='result-stats']")).getText();
            String[] print = message.split(" ");

            System.out.println("I typed " + sport [i] + " and number of results is " + print[1]);
        }//end of loop
        driver.quit();
    }// end of main method
}//end of the java class
