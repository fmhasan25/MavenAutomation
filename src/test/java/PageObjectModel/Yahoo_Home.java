package PageObjectModel;

import Reusable_classes.Abstract_Class;
import Reusable_classes.Reusable_Library_Loggers;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Yahoo_Home extends Abstract_Class {
    ExtentTest logger;

    public Yahoo_Home(WebDriver driver) {
        super();
        PageFactory.initElements(driver, this);
        this.logger = super.logger;
    }//end of the constructor

    public Yahoo_Home searchBox(String userKeys){
        Reusable_Library_Loggers.userKeys(driver,"//*[@id='ybar-sbq']",userKeys,"Cars",logger);
        return new Yahoo_Home(driver);
    }//end of the searchBox constructor
}//end of the class
