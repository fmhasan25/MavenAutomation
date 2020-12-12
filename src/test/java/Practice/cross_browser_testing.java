package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class cross_browser_testing {
    WebDriver driver= null;
    String projectPath= System.getProperty("user.dir");


    @Parameters("browserName")
    @BeforeTest
    public void setup(String browserName){
        System.out.println("Browser name is : "+ browserName);
    if(browserName.equalsIgnoreCase("chrome")){
       WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
    }else if(browserName.equalsIgnoreCase("firefox")){
        WebDriverManager.firefoxdriver().setup();
         driver= new FirefoxDriver();
    }else if(browserName.equalsIgnoreCase("ie")){
        WebDriverManager.edgedriver().setup();
         driver = new EdgeDriver();

    }

    }//end of the before test annotation
    @Test
    public void test(){
        driver.navigate().to("https://google.com");
        System.out.println(driver.getTitle());

    }

    @AfterTest
    public void exit(){
        driver.quit();
    }
}
