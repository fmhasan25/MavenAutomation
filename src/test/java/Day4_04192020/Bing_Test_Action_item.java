package Day4_04192020;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bing_Test_Action_item {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/Resource/chromedriver 2");
        WebDriver driver = new ChromeDriver();
        //Creating the dynamic the array.
        String[] value = new String[5];
        value[0] = "Soccer";
        value[1] = "Cricket";
        value[2] = "Hockey";
        value[3] = "Tennis";
        value[4] = "Baseball";
        //for loop starts
        for (int i = 0; i<value.length; i++){
           //Opening the browser.
            driver.navigate().to("http://bing.com");
            //Delaying for 2sec.
            Thread.sleep(2000);
            //Maximizing the window screen.
            driver.manage().window().maximize();
            //Delaying for 1sec.
            Thread.sleep(1000);
            //Putting the array variable in the search option.
            WebElement id =  driver.findElement(By.id("sb_form_q"));
         id.sendKeys(value[i]);
            //Hitting enter to execute the search option.
         id.submit();
            //Defining the new array from the browser .
            String message =driver.findElement(By.className("sb_count")).getText();
            //Delaying for 2sec.
            Thread.sleep(2000);
            //Applying split function to the new array.
            String[] fraction = message.split(" ");
            //Output print command.
            System.out.println("The search number for " + value[i] + " is " + fraction[0]);
        }//end of the loop
        //Quit from browser.
        driver.quit();
    }//end of the main method
}//end of the java class
