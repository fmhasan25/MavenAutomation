package Day4_04192020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bing_Test {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/Resource/chromedriver 2");
        WebDriver driver = new ChromeDriver();
        String[] value = new String[5];
        value[0] = "country";
        value[1] = "state";
        value[2] = "location";
        value[3] = "sports";
        value[4] = "places";


        for (int i = 0; i < value.length; i++){
            driver.get("https://www.bing.com");
            Thread.sleep(2000);

            Thread.sleep(1000);
            driver.findElement(By.id("sb_form_q")).sendKeys(value[i]);
            driver.findElement(By.id("sb_form_q")).submit();
            String message =new String();
            message = driver.findElement(By.className("sb_count")).getText();
            Thread.sleep(2000);
            String[] fraction = message.split(" ");
            System.out.println("The search number for " + value[i] + " is " + fraction[0]);
        }//end of the loop
driver.quit();
    }//end of the main method
}//end of the java class
