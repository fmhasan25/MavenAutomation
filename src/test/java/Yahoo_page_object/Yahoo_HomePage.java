package Yahoo_page_object;

import Reusable_classes.Abstract_Class;
import Reusable_classes.Reusable_Library_Loggers;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class Yahoo_HomePage extends Abstract_Class {

    ExtentTest logger;
    public Yahoo_HomePage (WebDriver driver){
        super();
        PageFactory.initElements(driver,this);
       this.logger=super.logger;
    }//end of the constructor

    public Yahoo_HomePage searchField(String userKey){
        Reusable_Library_Loggers.userKeys(driver,"//*[@id='header-search-input']",userKey,"searchField",Abstract_Class.logger);
        return new Yahoo_HomePage(driver);
    }
    public Yahoo_HomePage searchIcon(){

        Reusable_Library_Loggers.click(driver,"//*[@type='submit']","click go",logger);
        return new Yahoo_HomePage(driver);
    }//end of the searchIcon method


}//end of the java class
