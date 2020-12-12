package Assignment_BOA.Pages;

import Reusable_classes.Abstract_Class;
import org.testng.annotations.Test;

public class BOA_Execution extends Abstract_Class {
    @Test
    public void BOAExecution() throws InterruptedException {
        driver.navigate().to("https://www.bankofamerica.com");
        Thread.sleep(2500);
        BOA_Base.boa_homePage().click_checking();
        Thread.sleep(2500);
        BOA_Base.boa_homePage().click_openAccount();
        Thread.sleep(15000);

    }
}
