package Action_items;

import Reusable_classes.Reusable_Library;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;

public class Draft_kayak {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = Reusable_Library.setDriver();
        Actions mouse = new Actions(driver);
        driver.navigate().to("https://www.kayak.com");

        Thread.sleep(3000);

        Actions actions = new Actions(driver);
        Reusable_Library.click(driver, "//div[@data-placeholder='Enter an airport or city']", "click the box");
        Thread.sleep(3000);
        Reusable_Library.userKeys(driver, "//*[@name='pickup']", "jfk", "airport");
        Reusable_Library.KeyDownAndEnter(driver, "//*[@name='pickup']", "Keyboard control");


        Thread.sleep(2000);


        Reusable_Library.click(driver, "(//div[@class='_iQh']) [2]", "click end date");
        Thread.sleep(3000);
        Reusable_Library.userKeys(driver, "(//div[@aria-label='Drop-off date']) [2]", "06/25/2020", "end date");
        Thread.sleep(1500);
        Reusable_Library.KeyEnter(driver, "(//div[@aria-label='Drop-off date']) [2]", "hit Enter");

        Thread.sleep(2500);

        Reusable_Library.click(driver, "(//div[@aria-haspopup='listbox']) [3]", "End time");
        Thread.sleep(3000);

        Reusable_Library.scrollDown(driver, "//*[@class='handle']", 0, -70, "Scroll down");
        Thread.sleep(3000);
        Reusable_Library.click(driver, "(//li[contains(text(),'11:00 pm')]) [2]", "end time");
        Reusable_Library.click(driver, "(//*[@class='_iQh']) [1]", "click");
        Thread.sleep(3000);
        Reusable_Library.userKeys(driver, "(//div[@aria-label='Pick-up date']) [2]", "06/16/2020", "start date");
        Reusable_Library.KeyEnter(driver, "(//div[@aria-label='Pick-up date']) [2]", "Enter");


//Reusable_Library.click(driver, "(//div[@data-title='Noon']) [2]", "Noon");
        Reusable_Library.click(driver, "//h2[contains(text(),'Explore now. Travel later.')]", "click outside");
        Reusable_Library.click(driver, "//h2[contains(text(),'Explore now. Travel later.')]", "click outside");
        // mouse.doubleClick(driver.findElement(By.xpath("//h2[contains(text(),'Explore now. Travel later.')]")));
        Thread.sleep(5000);


        Reusable_Library.click(driver, "(//div[@aria-haspopup='listbox']) [2]", "start time");
        Thread.sleep(3000);
//        WebElement SourceElement = driver.findElement(By.xpath("//*[@class='handle']"));
//        actions.dragAndDropBy(SourceElement, 0, 50).perform();
        Reusable_Library.scrollDown(driver, "//*[@class='handle']", 0, 50, "Scroll down");

        Reusable_Library.click(driver, "//li[contains(text(),'5:00 pm')]", "start time");
        Thread.sleep(1500);
        Reusable_Library.click(driver, "//*[@class='_h-2 _ivP _iv1']", "search");
        Thread.sleep(3000);
        Reusable_Library.click(driver, "//div[@id='cars-topFilter-SMALL-checkbox_icon']", "checkbox");
        Thread.sleep(2000);
//Reusable_Library.click(driver,"(//*[text()='View Deal']) [1]","view deal");
        Reusable_Library.click(driver, "(//*[contains(text(),'View Deal')]) [2]", "view deal");
        Thread.sleep(3500);
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        Thread.sleep(4000);
        System.out.println(driver.getTitle());
        System.out.println(Reusable_Library.captureText(driver, "//*[@class='col-md-12 rates_r2_sub_title']", "car info"));
        System.out.println(driver.findElement(By.xpath("//td[@class='bold_bs_value']")).getText());
//driver.quit();


    }//end of the main method
}//end of the java class


