package Assignment_BOA.Pages;

import Reusable_classes.Abstract_Class;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BOA_Base extends Abstract_Class {
    public BOA_Base (WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public static BOA_HomePage boa_homePage(){
        BOA_HomePage boa_homePage= new BOA_HomePage(driver);
        return boa_homePage;

    }
}
