package Day9_05092020;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Libraries_practice {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/Resource/chromedriver 2");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("Incognito");
        WebDriver driver = new ChromeDriver(options);
        driver.navigate().to("https://www.google.com");
        Thread.sleep(3000);

//--------------------------------
        String actualTitle = driver.getTitle();
        if (actualTitle.equals("Google")) {
            System.out.println("expected title matches with actual. The actual title is " + actualTitle);
        } else {
            System.out.println("expected title doesn't match with actual. The actual title is " + actualTitle);
        }//end of the if-else condition
//---------------------------------
//        try {
//            System.out.println("typing in the search box ");
//            String searchBox = "//input[@name='q']";
//            driver.findElement(By.xpath(searchBox)).clear();
//            driver.findElement(By.xpath(searchBox)).sendKeys("11218");
//            driver.findElement(By.xpath(searchBox)).submit();
//
//        } catch (Exception e) {
//            System.out.println("unable to type in the search box");
//        }//end of the try-catch condition
//-----------------------------------
        Cutomized_libraries.actualTitle(driver,"google");
Cutomized_libraries.searchbox(driver,"//input[@name='q']","Searchbox","11218");
Cutomized_libraries.result(driver,"//div[@id='result-stats']","Results");
        //        String searchedResults = "//div[@id='result-stats']";
//        String results = driver.findElement(By.xpath(searchedResults)).getText();
//        try {
//            System.out.println("Printing the search results. The result is " + results);
//        } catch (Exception e) {
//            System.out.println("Unable to print the search results. The result is " + results);
//        }//end of the try-catch condition
    }//end of the main method
}//end of the java class
