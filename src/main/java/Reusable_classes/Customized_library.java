package Reusable_classes;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

public class Customized_library {

    public static WebDriver setDriver() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver 2");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");
        WebDriver driver = new ChromeDriver(options);

        return driver;
    }//end of the setDriver method

    public static void click(WebDriver driver, String locator, String elementName, ExtentTest logger) throws IOException {
        WebDriverWait wait = new WebDriverWait(driver, 15);

        try {
            logger.log(LogStatus.INFO, "Clicking " + elementName);
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
            element.click();
            System.out.println("clicking " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to click " + elementName + e);
            getScreenShot(driver, elementName, logger);
        }//end of the try-catch function
    }// end of the click method


    public static void getScreenShot(WebDriver driver,String imageName,ExtentTest logger) {
        try {
            String fileName = imageName + ".png";
            String directory ="src/main/java/HTML_Report/Screenshots/";
            File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(sourceFile, new File(directory + fileName));
            //String imgPath = directory + fileName;
            String image = logger.addScreenCapture("Screenshots//" + fileName);
            logger.log(LogStatus.INFO, "ScreenShot", image);

        } catch (Exception e) {
            logger.log(LogStatus.FAIL, "Error Occured while taking SCREENSHOT!!!");
            e.printStackTrace();
        }//end of if else condition
    }//end of screenshot method

    public static void verifyTitle(WebDriver driver, String expectedTitle, ExtentTest logger) {
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("The title is as expected. The title is " + expectedTitle);
            logger.log(LogStatus.INFO,"Verifying title");
        } else {
            System.out.println("The title isn't as expected. the actual title is " + actualTitle);
            logger.log(LogStatus.FAIL,"title isn't as expected");
        }//end of the if-else statement
    }//end of the verifyTitle


    public static void mouseHover(WebDriver driver,String locator, String elementName, ExtentTest logger) throws IOException {

        WebDriverWait wait = new WebDriverWait(driver,15);
        Actions mouse = new Actions(driver);
        try{
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
            mouse.moveToElement(element).build().perform();
            System.out.println("mouse hovering on "+ elementName);
            logger.log(LogStatus.INFO,"mouse hovering on"+elementName);
        }catch (Exception e){
            System.out.println("Unable to mouse hover on "+elementName+ e);
            getScreenShot(driver,elementName,logger);
            logger.log(LogStatus.FAIL,"unable to mouse hovering");
        }//end of the try-catch function
    }//end of the mouse hover method

    public static void userKeyNHitEnter(WebDriver driver, String locator,String userInput, String elementName, ExtentTest logger){

        WebDriverWait wait = new WebDriverWait(driver,15);
        try{
            WebElement element= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
            element.clear();
            element.sendKeys(userInput);
            element.submit();
            logger.log(LogStatus.INFO,"Entering input and go"+ elementName);
            System.out.println("entering input and hit enter"+ elementName);
        }catch (Exception e){
            System.out.println("unable to enter input and hit enter "+ elementName+ e);
        }
    }//end of the userInputNHitEnter method

    public static void scroll(WebDriver driver, String locator,String elementName, ExtentTest logger) throws IOException {

        WebDriverWait wait = new WebDriverWait(driver,15);
        try{
            logger.log(LogStatus.INFO,"Scrolling to "+ elementName);
            System.out.println("Scrolling to "+elementName);
        }catch (Exception e){
            System.out.println("Unable Scrolling to "+elementName+ e);
            logger.log(LogStatus.FAIL,"Scrolling to "+ elementName);
            getScreenShot(driver,elementName,logger);
        }

    }//end of the scroll method


    public static void userInput(WebDriver driver, String locator,String userInput, String elementName, ExtentTest logger) throws IOException {

        WebDriverWait wait = new WebDriverWait(driver,15);
        try{
            WebElement element= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
            element.clear();
            element.sendKeys(userInput);
            logger.log(LogStatus.INFO,"Entering input and go"+ elementName);
            System.out.println("entering input and hit enter"+ elementName);
        }catch (Exception e){
            System.out.println("unable to enter input and hit enter "+ elementName+ e);
            getScreenShot(driver,elementName,logger);
        }
    }//end of the userInputNHitEnter method

}//end of the java class
