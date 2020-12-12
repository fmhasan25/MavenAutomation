package Day8_05032020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Actions_USPS {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/Resource/chromedriver 2");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");
        WebDriver driver = new ChromeDriver(options);
        //  driver.manage().window().maximize();
        //navigate to USPS
        driver.navigate().to("https://www.usps.com");
        Thread.sleep(2500);
        //call your Mouse Actions
        Actions mouse = new Actions(driver);
        //hover to mail and ship tab

        try{
            WebElement mailAndShip = driver.findElement(By.xpath("//*[text()='Mail & Ship']"));
            //call your Actions command to move to the element
            mouse.moveToElement(mailAndShip).perform();
        }catch (Exception e){
            System.out.println("unable to locate Mail & Ship "+ e);
        }//end of Mail and Ship exception
        Thread.sleep(2000);
        //click on click-N-Ship using Actions
        try{
            //by using absolute xpath along with the parent
           // WebElement clickAndShip = driver.findElement(By.xpath("//*[@class='tool-cns']/a[text()='Click-N-Ship']"));
            WebElement clickAndShip = driver.findElement(By.xpath("//*[@class='tool-cns']/a"));
            //child to parent is preceding ::
            //call your Actions command to move to the element
            mouse.moveToElement(clickAndShip).click().perform();
        }catch (Exception e){
            System.out.println("unable to locate Click-N-Ship "+ e);
        }//end of Mail and Ship Exception

    }//end of the main method
}//end of the java class
