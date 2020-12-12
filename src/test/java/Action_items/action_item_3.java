package Action_items;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class action_item_3 {
    public static void main(String[] args) throws InterruptedException {
        //define the String array variable
        String[] zipcode = new String[3];
        zipcode[0] = "11219";
        zipcode[1] = "11208";
        zipcode[2] = "11220";
        //Define the WebDriver and ChromeDriver
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver 2");
        //Define the ChromeOptions variable
        ChromeOptions options = new ChromeOptions();
        //set the arguments for incognito
        options.addArguments("incognito");
        //Defining  chrome driver
        WebDriver driver = new ChromeDriver(options);
        //opening the browser
        driver.navigate().to("https://www.weightwatchers.com");
        //Delay for 3sec
        Thread.sleep(2000);
        //Maximizing the window
        driver.manage().window().maximize();
        //Verifying and Printing the title of the website
        String Title = driver.getTitle();
        if (Title.equals("WW (Weight Watchers): Weight Loss & Wellness Help")) {
            System.out.println("Title matches with expected");
        } else {
            System.out.println("The title doesn't match");
        }
        System.out.println("The title name is " + driver.getTitle());
        //for loop starts
        for (int i = 0; i < zipcode.length; i++) {
            //Creating String variable for workshop,search box and clicking button
            String workshop = "//*[@id='ela-menu-visitor-desktop-supplementa_find-a-workshop']";
            String searchBox = "//input[@id='meetingSearch']";
            String searchButton = "//button[@class='btn spice-translated']";
            //clicking command to "find a workshop"
            driver.findElement(By.xpath(workshop)).click();
            //Delay for 2sec
            Thread.sleep(2000);
            //putting the zipcode into the search box
            driver.findElement(By.xpath(searchBox)).sendKeys(zipcode[i]);
            //clicking the search button
            driver.findElement(By.xpath(searchButton)).click();
            //conditional statement for desired studio
            if (i == 0) {
                driver.findElements(By.xpath("//*[@class='location__top']")).get(2).click();
            }//end of if condition
            if (i == 1) {
                driver.findElements(By.xpath("//*[@class='location__top']")).get(3).click();
            }//end of else if condition
            if (i == 2) {
                driver.findElements(By.xpath("//*[@class='location__top']")).get(1).click();
            }//end of else condition*/
            //creating String variable for the studio address and schedule
            String address = driver.findElement(By.xpath("//*[@class='location']")).getText();
            String schedule = driver.findElement(By.xpath("//*[@class='meeting-schedule meeting-detail-bottom-section']")).getText();
            //Printing the address and the schedule.
            System.out.println("The name and address of the studio workshop is " + "\n" + address);
            System.out.println("The schedule for the selected studio is " + "\n" + schedule);

        }//end of for loop
        driver.quit();
    }//end of the main method
}//end of the java class


