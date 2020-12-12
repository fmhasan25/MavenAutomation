package PageObjectModel;

import Reusable_classes.Abstract_Class;
import org.testng.annotations.Test;

public class Yahoo_exucation extends Abstract_Class {
    @Test
    public void Yahoo_Execution() throws InterruptedException {
        driver.navigate().to("http://yahoo.com");
        Thread.sleep(5000);
        Yahoo_Base.yahoo_home().searchBox("Car");
    }
}
