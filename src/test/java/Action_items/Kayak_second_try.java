package Action_items;

import Reusable_classes.Reusable_Library;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Kayak_second_try {
    WebDriver driver;

    String locatorInfo2;

    @BeforeSuite
    public void defineDriver() {
        driver = Reusable_Library.setDriver();

    }//end of the java method

    @Test
    public void operation() throws InterruptedException {

    driver.navigate().to("https://www.google.com");
    Thread.sleep(2000);


    }//end of the test method

    @AfterSuite
    public void quitDriver() {
        driver.quit();
    }//end of the after suite


}//end of the java class
