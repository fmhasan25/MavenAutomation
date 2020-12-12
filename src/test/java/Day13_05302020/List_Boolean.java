package Day13_05302020;

import Reusable_classes.Reusable_Library;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import java.util.List;


public class List_Boolean {

    //declare the driver outside
    WebDriver driver;

    @BeforeSuite
    public void defineDriver() {
        driver = Reusable_Library.setDriver();

    }//end of the before suit

    @Test
    public void yahoo_verification() throws InterruptedException {
       //open the browser
        driver.navigate().to("https://www.yahoo.com");

        //delay for 3.5 sec
        Thread.sleep(3500);
        //count the number of links available on page
        System.out.println(driver.findElements(By.tagName("a")).size());
        //count all the links in yahoo homepage and print it
        List<WebElement> linkCount= driver.findElements(By.xpath("//*[contains(@class,'D(ib) Mstart(21px) Mend(17px)')]"));
        System.out.println("Total number of links is "+linkCount.size());


        //verify if linkCount returns you 12 links
        if(linkCount.size()==12){
            System.out.println("My yahoo home page link count matches and it is "+ linkCount.size());
        }else {
            System.out.println("My yahoo home page link count doesn't match and actual is "+ linkCount.size());
        }//end of the if-else condition


        //click on sign in link
        Reusable_Library.click(driver,"//*[@id='header-profile-menu']","Sign in");


        //wait few seconds
        Thread.sleep(3000);


        //verify the state of the checkbox is checked for stay signed in section
        boolean checkboxState= driver.findElement(By.xpath("//*[@id='persistent']")).isSelected();
        if (checkboxState==true){
            System.out.println("Checkbox is selected by default");
        }else{
            System.out.println("Checkbox is nto selected by default");
        }//end of the if else condition

    }//end of test suit



    @AfterSuite
    public void closeSession() {
        //quit the driver
        driver.quit();
    }//end of the after suite


}//end of the java class
