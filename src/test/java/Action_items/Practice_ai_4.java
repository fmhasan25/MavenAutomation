package Action_items;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;


public class Practice_ai_4 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/Resource/chromedriver 2");
        //Defining the ChromeOption
        ChromeOptions options = new ChromeOptions();
        //Defining the Incognito command
        options.addArguments("incognito");
        //Defining the WebDriver and ChromeDriver
        WebDriver driver = new ChromeDriver(options);
        //defining the ArrayList for zipCodes
        ArrayList<String> zipCodes = new ArrayList<>();
        zipCodes.add("11218");
        zipCodes.add("11230");
        zipCodes.add("11208");
        //defining the ArrayList for dentalProgram
        ArrayList<String> dentalProgram = new ArrayList<>();
        dentalProgram.add("PPO-LOW");
        dentalProgram.add("PPO-MEDIUM");
        dentalProgram.add("PPO-HIGH");
        //defining the ArrayList for referralCode
        ArrayList<String> referralCode = new ArrayList<>();
        referralCode.add("1121");
        referralCode.add("1122");
        referralCode.add("1123");

        //Opening the metLife browser
        driver.navigate().to("https://www.metlife.com/");
        //Delay for 3 sec
        Thread.sleep(3000);
        //try-catch statement for title of the website

            String Title1 = driver.getTitle();
            if (Title1.equals("Insurance and Employee Benefits | MetLife")) {
                System.out.println("I clicked SOLUTIONS and Title of the new page matches with expected.\nThe name of the title is " + Title1);
            } else {
                System.out.println("I clicked SOLUTIONS and Title of the new page doesn't match.\nThe name of the title is " + Title1);
            }

        //Delay for 3 sec
        Thread.sleep(3000);

        //debugging the clicking Solution command
        try {
            //clicking the SOLUTIONS button
            driver.findElement(By.xpath("//*[contains(text(),'SOLUTIONS')]")).click();
        } catch (Exception e) {
            System.out.println("Unable to click SOLUTIONS " + e);
        }//end of the try-catch statement
        Thread.sleep(3000);
        //try-catch statement for title of the website

            String Title2 = driver.getTitle();
            if (Title2.equals("Insurance and Employee Benefits | MetLife")) {
                System.out.println("I clicked Metlife TakeAlong Dental and the Title of the new page matches with expected.\nThe name of the title is " + Title2);

            } else {
                System.out.println("I clicked Metlife TakeAlong Dental and the Title of the new page doesn't match with expected.\nThe name of the title is " + Title2);
            }


        //Clicking command to MetLife TakeAlong Dental
        try {
            driver.findElement(By.xpath("//*[contains(text(),'MetLife TakeAlong Dental')]")).click();
        } catch (Exception e) {
            System.out.println("Unable to click MetLife TakeAlong Dental " + e);
        }//end of the try-catch statement

        Thread.sleep(2000);
        for (int i = 0; i < zipCodes.size(); i++) {
            try {
                //clicking Enroll Now button
                driver.findElement(By.xpath("//*[contains(text(),'Enroll Now')]")).click();
            } catch (Exception e) {
                System.out.println("Unable to click Enroll Now " + e);
            }////end of the try-catch statement

            //Switching the window command
            ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
            driver.switchTo().window(tabs.get(1));
            //Delay for 5 sec
            Thread.sleep(5000);
            //Clearing the previous input from the box
            try {
                driver.findElement(By.xpath("//*[@class='form-control']")).clear();
            } catch (Exception e) {
                System.out.println("Failed to clear the search box " + e);
            }
            //Putting zipCode into the box
            try {
                driver.findElement(By.xpath("//*[@class='form-control']")).sendKeys(zipCodes.get(i));
            } catch (Exception e) {
                System.out.println("Unable to type zipcode " + e);
            }////end of the try-catch statement
            //clicking the go button
            try {
                driver.findElement(By.xpath("//*[@id='txtZipCodetxt']")).click();
            } catch (Exception e) {
                System.out.println("Unable to click go button " + e);
            }//end of the try-catch statement
            //Delaying for 3sec
            Thread.sleep(3000);
           //--------------------
            //scrolling down to ppo option
            JavascriptExecutor jsc = (JavascriptExecutor) driver;
            try {
                WebElement PPO = driver.findElement(By.xpath("//td[contains(text(),'Coverage Type - PPO')]"));
                jsc.executeScript("arguments[0].scrollIntoView(true);", PPO);
            } catch (Exception e) {
                System.out.println("Unable to load PPO " + e);
            }////end of the try-catch statement
            //------------------
            //clicking the dental Program checkbox
            try {
                driver.findElement(By.xpath("//input[@class='" + dentalProgram.get(i) + "']")).click();

            } catch (Exception e) {
                System.out.println("Unable to choose program " + e);
            }////end of the try-catch statement*/
            //clicking Enroll In program now
            try {
                driver.findElement(By.xpath("//a[@id='topenrolltab']")).click();
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println("Unable to open the program now" + e);
            }////end of the try-catch statement
            //Entering the referral code
            try {
                driver.findElement(By.xpath("//input[@id='txtBxPromocode']")).sendKeys(referralCode.get(i));
            } catch (Exception e) {
                System.out.println("Unable to put the referral code " + e);
            }////end of the try-catch statement
            //clicking the go button
            try {
                driver.findElement(By.xpath("//button[@id='enrollgobtn']")).click();
            } catch (Exception e) {
                System.out.println("Unable to click the go button " + e);
            }////end of the try-catch statement
            //Delay for 2sec
            Thread.sleep(2000);
            //printing error message
            try {
                String errorMessage = "//span[contains(text(),'Referral Code was not recognized')]";
                System.out.println(driver.findElement(By.xpath(errorMessage)).getText());
            } catch (Exception e) {
                System.out.println("Unable to print the error text " + e);
            }////end of the try-catch statement
            Thread.sleep(2000);
            //proceeding without referral code
            try {
                driver.findElement(By.xpath("//a[@class='btn btn-primaryborder']")).click();
            } catch (Exception e) {
                System.out.println("Unable to click enroll without the referral code " + e);
            }////end of the try-catch statement
            Thread.sleep(2000);
            //Matching the searched program with desired dental program

                String message = driver.findElement(By.xpath("//div[@class='col-sm-8']")).getText();
                String[] fraction = message.split(" ");
                if (dentalProgram.get(i).equals(fraction[3])) {
                    System.out.println("The search result is: " +message);
                    System.out.println("Dental program matches.\nThe name of searched program is " + fraction[3]);
                } else {
                    System.out.println("Dental program does't matches.\nThe name of searched program is " + fraction[3]);
                }

            //Delaying for 2sec
            Thread.sleep(2000);
            //closing the current tab
            driver.close();
            driver.switchTo().window(tabs.get(0));
        }//enf of the for loop
        //permanently closing the browser
        driver.quit();
    }//end of the main method
}//end of the java class