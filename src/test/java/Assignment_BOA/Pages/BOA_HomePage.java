package Assignment_BOA.Pages;

import Reusable_classes.Abstract_Class;
import Reusable_classes.Reusable_Library;
import Reusable_classes.Reusable_Library_Loggers;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BOA_HomePage extends Abstract_Class {
    ExtentTest logger;

    public BOA_HomePage(WebDriver driver) {
        super();
        PageFactory.initElements(driver, this);
        this.logger = super.logger;
    }//end of the constructor

    public BOA_HomePage click_checking(){
        Reusable_Library_Loggers.click(driver,"//*[@id='navChecking']","clicking checking option",logger);
        return new BOA_HomePage(driver);
    }

    public BOA_HomePage click_openAccount(){

        Reusable_Library_Loggers.click(driver,"(//*[text()='Get started']) [1]","clicking open account",logger);

        return new BOA_HomePage(driver);
    }


}
