package Day5_04252020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locate_by_xpath {
    public static void main(String[] args) throws InterruptedException {
        //define the driver
        String searchPath= "//*[@name='field-keywords']";
        String searchIconPath= "//*[@type='submit' and @value='Go']";
        String imagePath ="//img[contains(@class,'s-image')]";
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver86");
        WebDriver driver = new ChromeDriver();
        //navigate to amazon home page
        driver.navigate().to("https://www.amazon.com");
        //maximize your driver window
        //driver.manage().window().maximize();
        //wait few seconds
        Thread.sleep(2000);
        //enter a keyword laptop on amazon search field by using xpath
        driver.findElement(By.xpath(searchPath)).sendKeys("Laptop");
//click on search icon
        driver.findElement(By.xpath(searchIconPath)).submit();//and/or operator can be used in between.
//click on second image item of the same elements within that page using index number
        //driver.findElements(By.xpath("//*[@class='s-image']")).get(2).click();
       driver.findElements(By.xpath(imagePath)).get(4).click();
    }//end of the main method
}//end of the java class
