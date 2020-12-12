package PageObjectModel;

import Reusable_classes.Abstract_Class;
import org.openqa.selenium.support.PageFactory;

public class Yahoo_Base extends Abstract_Class {

    public Yahoo_Base(){
        super();
        PageFactory.initElements(driver,this);
    }

    public static Yahoo_Home yahoo_home(){
        Yahoo_Home yahoo_home = new Yahoo_Home(driver);
        return yahoo_home;
    }
}//end of the class
