package Yahoo_page_object;

import Reusable_classes.Abstract_Class;
import org.testng.annotations.Test;

public class Yahoo_Execution_Page extends Abstract_Class {

    @Test
    public void YahooExecution() throws InterruptedException {
        driver.navigate().to("https://www.yahoo.com");
        Thread.sleep(2500);
        Yahoo_Base_Class.yahoo_homePage().searchField("cars");
        Yahoo_Base_Class.yahoo_homePage().searchIcon();
        Yahoo_Base_Class.yahoo_searchField().scrollToBottom();
Yahoo_Base_Class.yahoo_searchField().captureText();

    }
}//end of the java class
