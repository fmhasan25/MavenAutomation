package Yahoo_page_object;

import Reusable_classes.Abstract_Class;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Yahoo_Base_Class extends Abstract_Class {

    public Yahoo_Base_Class (WebDriver driver){
        super();
        PageFactory.initElements(driver,this);
    }//end of the java class

    public static Yahoo_HomePage yahoo_homePage(){

        Yahoo_HomePage yahoo_homePage= new Yahoo_HomePage(driver);
        return yahoo_homePage;
    }

    public static Yahoo_SearchField yahoo_searchField(){
        Yahoo_SearchField yahoo_searchField= new Yahoo_SearchField(driver);
        return yahoo_searchField;
    }


}//end of the java class
