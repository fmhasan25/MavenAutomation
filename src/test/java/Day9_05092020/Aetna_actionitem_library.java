package Day9_05092020;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;

public class Aetna_actionitem_library {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/Resource/chromedriver 2");
        //Defining the ChromeOption
        ChromeOptions options = new ChromeOptions();
        //Defining the Incognito command
        options.addArguments("incognito");
        //Defining the WebDriver and ChromeDriver
        WebDriver driver = new ChromeDriver(options);

        ArrayList<String> zipCodes = new ArrayList<>();
        zipCodes.add("11218");
        zipCodes.add("11230");
        zipCodes.add("11208");
        ArrayList<Integer> mileArrayList = new ArrayList<>();
        mileArrayList.add(15);
        mileArrayList.add(30);
        mileArrayList.add(90);

        for (int i = 0; i < zipCodes.size(); i++) {

        driver.navigate().to("http://www.aetna.com/");
        Thread.sleep(3000);

        //Making the string variable for title
        String Title = driver.getTitle();
        //matching the printed title with actual title
        if (Title.equals("Health Insurance Plans | Aetna")) {
            System.out.println("Title matches and the name of the title is " + Title);
        }//end of the if condition
        else {
            System.out.println("Title doesn't match and the name of the title is " + Title);
        }//end of the else condition
//clicking the shop for a plan

        try {
            driver.findElement(By.xpath("(//*[@class='megamenu__primary--item']) [1]")).click();
        } catch (Exception e) {
            System.out.println("Unable to click the Shop for a plan " + e);
        }//end of the try-catch condition
        //clicking medicare
        try {
            driver.findElement(By.xpath("//*[contains(text(),'Medicare')]")).click();
        } catch (Exception e) {
            System.out.println("Unable to click Medicare " + e);
        }//end of the try-catch condition
        //Clicking find a doctor
        try {
            driver.findElement(By.xpath("//*[contains(text(),'Find a doctor')]")).click();
        } catch (Exception e) {
            System.out.println("unable to click find the doctor " + e);
        }//end of the try-catch condition
        Thread.sleep(3000);


            //clicking 2020 Medicare plans you purchase yourself
            try {
                driver.findElement(By.xpath("(//*[@class='primaryPurple BtnWidth mgbutton w400']) [1]")).click();
            } catch (Exception e) {
                System.out.println("Unable to click 2020 Medicare plans you purchase yourself " + e);
            }//end of the try-catch condition
//Clearing the box and putting zipCode
            //---------------------------------------------


            try {
                String searchBox = "//input[@id='medZip']";
                driver.findElement(By.xpath(searchBox)).clear();
                driver.findElement(By.xpath(searchBox)).sendKeys(zipCodes.get(i));
                Thread.sleep(2000);
                driver.findElement(By.xpath(searchBox)).sendKeys(Keys.ARROW_DOWN);
                driver.findElement(By.xpath(searchBox)).sendKeys(Keys.ENTER);
            } catch (Exception e) {
                System.out.println("Unable to put and select the zipCode " + e);
            }//end of the try-catch condition
            //Delay for 3 sec
            Thread.sleep(3000);
            //selecting the range

            try {

                Actions actions = new Actions(driver);
                WebElement SourceElement = driver.findElement(By.xpath("//*[@class='rz-pointer rz-pointer-min']"));
                actions.dragAndDropBy(SourceElement, (int) -150, 0).perform();

                actions.dragAndDropBy(SourceElement, (int) (mileArrayList.get(i)*(4.67)), 0).perform();
                Thread.sleep(2000);


            } catch (Exception e) {
                System.out.println("Unable to control the slider " + e);
            }//end of the try-catch condition
Thread.sleep(3000);
            //clicking skip plan selection
            try {
                driver.findElement(By.xpath("//button[@class='primaryPurple BtnWidth col-md-6 col-xs-12']")).click();
            } catch (Exception e) {
                System.out.println("Unable to click the button " + e);
            }//end of the try-catch condition
            //Delaying for 2 sec
            Thread.sleep(2000);
            //Clicking Medical Doctors and specialists

            try {
                driver.findElement(By.xpath("//div[@id='linkblock_434']//p[@class='dummyAnchor']")).click();
            } catch (Exception e) {
                System.out.println("Unable to click the button " + e);
            }//end of the try-catch condition
            //Delaying for 2 sec
            Thread.sleep(2000);
            //Clicking Doctors(Primary care)
            try {
                driver.findElement(By.xpath("(//div[@class='search-block image-block-purple']) [1]")).click();
            } catch (Exception e) {
                System.out.println("Unable to click the button " + e);
            }//end of the try-catch condition
//Clicking All primary cares physicians
            Thread.sleep(2000);
            try {
                driver.findElement(By.xpath("//h3[contains(text(),'All Primary Care Physicians')]")).click();
            } catch (Exception e) {
                System.out.println("Unable to click list of the physicians " + e);
            }//end of the try-catch condition
            //Delaying for 6sec
            Thread.sleep(6000);
            //printing the selected doctor name and address
            try {
                String message = driver.findElement(By.xpath("(//*[@class='col-xs-12 col-md-4 dataGridContentCol']) [1]")).getText();
                System.out.println(message);
            } catch (Exception e) {
                System.out.println("Unable to print the text " + e);
            }//end of the try-catch condition

            Thread.sleep(3000);

        }//end of for loop
        driver.quit();
    }//end of the main method
}//end of the java class
