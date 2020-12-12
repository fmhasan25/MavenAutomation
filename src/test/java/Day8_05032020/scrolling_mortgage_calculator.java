package Day8_05032020;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class scrolling_mortgage_calculator {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/Resource/chromedriver 2");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");
        WebDriver driver = new ChromeDriver(options);
        //  driver.manage().window().maximize();

        driver.navigate().to("https://mortgagecalculator.org");
        Thread.sleep(2500);
//declare and define javascript
        JavascriptExecutor jsc = (JavascriptExecutor) driver;
        //scroll all the way to the bottom of the page
       /* jsc.executeScript("scroll(0,5000)");
        //wait for 1 second
        Thread.sleep(1000);
        //scroll al the way to the top of the page again
        jsc.executeScript("scroll(0,-5000)");
        //scrolling to an element view*/
        try {
            WebElement loanTerm = driver.findElement(By.xpath("//*[@id='loanterm']"));
            //WebElement homeValue = driver.findElement(By.xpath("//*[@id='homeval']"));

            jsc.executeScript("arguments[0].scrollIntoView(true);", loanTerm);
        } catch (Exception e) {
            System.out.println("Unable to load loan term " + e);
        }
        //the ";" can be used inside the quotation because its javascript command
    }//end of the main method
}//end of the java class
