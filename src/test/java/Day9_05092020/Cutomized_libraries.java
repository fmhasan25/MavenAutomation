package Day9_05092020;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cutomized_libraries {
    public static void actualTitle(WebDriver driver, String expectedTitle) {
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("expected title matches with actual. The actual title is " + actualTitle);
        } else {
            System.out.println("expected title doesn't match with actual. The actual title is " + actualTitle);
        }//end of the if-else condition
    }//end of the actual title method

    public static void searchbox(WebDriver driver, String locator, String Element, String input) {
        WebDriverWait wait = new WebDriverWait(driver,15);
        try {
            WebElement box= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
            box.clear();
            box.sendKeys(input);
            box.submit();
            System.out.println("clear,inputting,submitting ");
        }catch (Exception e){
            System.out.println("Unable to clear,input and submit");
        }

    }


    public static void result(WebDriver driver, String locator, String searchResult) {
        WebDriverWait wait = new WebDriverWait(driver,15);
        String searchresult= driver.findElement(By.xpath(locator)).getText();
        try {
            WebElement box= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));

            System.out.println("printing the search result. Result is "+ searchresult);
        }catch (Exception e){
            System.out.println("Unable to print the search result. Result is "+ searchresult);
        }

    }


}//end of the java class
