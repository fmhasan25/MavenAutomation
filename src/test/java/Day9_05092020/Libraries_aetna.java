package Day9_05092020;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Libraries_aetna {
    public static void realTitle(WebDriver driver, String expectedTitle) {
        String title = driver.getTitle();
        if (title.equals(expectedTitle)) {
            System.out.println("Title matches with the actual. The actual title is " + title);
        } else {
            System.out.println("Title doesn't match with the actual. The actual title is " + title);
        }//end of the if-else condition
    }//end of the real title method
//----------------------------

    public static void ShopForAplan(WebDriver driver, String locator, String name) {
        WebDriverWait wait = new WebDriverWait(driver, 10);

        try {
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
            element.click();
            System.out.println("clicking the Shop for a plan ");
        } catch (Exception e) {
            System.out.println("Unable to click the Shop for a plan ");
        }//end of try-catch condition
    }//end of the custom method

    public static void clickMedicare(WebDriver driver, String locator, String name) {
        WebDriverWait wait = new WebDriverWait(driver, 10);

        try {
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
            element.click();
            System.out.println("clicking the medicare ");
        } catch (Exception e) {
            System.out.println("Unable to click the medicare ");
        }//end of try-catch condition
    }//end of the custom method


    public static void findADoctor(WebDriver driver, String locator, String name) {
        WebDriverWait wait = new WebDriverWait(driver, 10);

        try {
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
            element.click();
            System.out.println("clicking the find a doctor ");
        } catch (Exception e) {
            System.out.println("Unable to click find a doctor ");
        }//end of try-catch condition
    }//end of the custom method

    public static void medicare4yourself(WebDriver driver, String locator, String name) {
        WebDriverWait wait = new WebDriverWait(driver, 10);

        try {
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
            element.click();
            System.out.println("clicking the 2020 medicare for yourself ");
        } catch (Exception e) {
            System.out.println("Unable to click the 2020 medicare for yourself ");
        }//end of try-catch condition
    }//end of the custom method


    public static void locationBar(WebDriver driver, String locator, String userInput, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);

        try {
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
            element.click();
            element.clear();
            element.sendKeys(userInput);
            element.sendKeys(Keys.ARROW_DOWN);
            Thread.sleep(3000);
            element.sendKeys(Keys.ENTER);
            System.out.println("clear,input & command ");
        } catch (Exception e) {
            System.out.println("Unable to clear,input & command ");
        }//end of try-catch condition
    }//end of the custom method

    public static void sliderControl(WebDriver driver, String locator, int value) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        Actions actions = new Actions(driver);
        try {
            //WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
            WebElement element = driver.findElement(By.xpath(locator));
Thread.sleep(3000);
            actions.dragAndDropBy(element, (int) value, 0).perform();
            System.out.println("Controlling the slider ");
        } catch (Exception e) {
            System.out.println("unable to control slider");
        }//end of try-catch condition
    }//end of the custom method
}//end of the java class
