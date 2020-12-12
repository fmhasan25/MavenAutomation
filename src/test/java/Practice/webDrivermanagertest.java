package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webDrivermanagertest {
    public static void main(String[] args) {

        googleSearch();
    }

    public static void googleSearch() {

        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.com");
        driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Cars");
        driver.findElement(By.xpath("//*[@name='q']")).submit();

    }
}
