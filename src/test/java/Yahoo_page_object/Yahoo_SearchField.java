package Yahoo_page_object;

import Reusable_classes.Abstract_Class;
import Reusable_classes.Reusable_Library_Loggers;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Yahoo_SearchField extends Abstract_Class {
    ExtentTest logger;
    public Yahoo_SearchField(WebDriver driver){
        super();
        PageFactory.initElements(driver,this);
        this.logger=super.logger;
    }//end of the constructor

    public Yahoo_SearchField scrollToBottom(){
        JavascriptExecutor jsc = (JavascriptExecutor) driver;
        jsc.executeScript("scroll(0,1000)");
        return new Yahoo_SearchField(driver);
    }

    public Yahoo_SearchField captureText(){
        String text=Reusable_Library_Loggers.captureText(driver,"//*[contains(text(),'177,000,000 results')]","captured text",logger);

        return new Yahoo_SearchField(driver);
    }


}//end of the java class
