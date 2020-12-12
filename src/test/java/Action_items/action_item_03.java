package Action_items;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class action_item_03 {
    public static void main(String[] args) throws InterruptedException {
        //define the String array variable
        String[] zipcode = new String[3];
        zipcode[0] = "11218";
        zipcode[1] = "11219";
        zipcode[2] = "11220";
        //Define the WebDriver and ChromeDriver
        System.setProperty("webdriver.chrome.driver", "src/Resource/chromedriver 2");
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
        //Printing the title of the website
        String Title = driver.getTitle();
        if (Title.equals("WW (Weight Watchers): Weight Loss & Wellness Help")) {
            System.out.println("Title matches with expected");
        } else {
            System.out.println("The title doesn't match");
        }
        System.out.println("Title name is "+driver.getTitle());
        //for loop starts
        for (int i = 0; i < zipcode.length; i++) {
            //Creating String variable for workshop
            String workshop = "//*[@id='ela-menu-visitor-desktop-supplementa_find-a-workshop']";
            String searchBox = "//input[@id='meetingSearch']";
            String searchButton = "//button[@class='btn spice-translated']";

            //clicking on find a workshop
            driver.findElement(By.xpath(workshop)).click();
            //Delay for 2sec
            Thread.sleep(2000);
            //putting the zipcode into the search box
            driver.findElement(By.xpath(searchBox)).sendKeys(zipcode[i]);
            //clicking the search button
            driver.findElement(By.xpath(searchButton)).click();
            //conditional statement for desired studio along with it's address
            if (i == 0) {
                driver.findElements(By.xpath("//div[@class='location__top']")).get(3).click();
                //String studio3 = driver.findElement(By.xpath("//div[contains(text(),'7516 5TH AVE')]")).getText();
                //String Name3 = driver.findElement(By.xpath("//span[contains(text(),'WW Studio Bay Ridge')]")).getText();
                //System.out.println("I searched for Studio 3.The name of studio 3 is " + Name3 + " and the address is " + studio3 + "Brooklyn,NY " + zipcode[i]);
            }//end of if condition
            if (i == 1) {
                driver.findElements(By.xpath("//div[@class='location__top']")).get(1).click();
                //String studio1 = driver.findElement(By.xpath("//div[contains(text(),'352 Flatbush Ave')]")).getText();
                //String Name1 = driver.findElement(By.xpath("//span[contains(text(),'WW Studio Park Slope')]")).getText();
                //System.out.println("I searched for Studio 1.The name of studio 1 is " + Name1 + " and the address is " + studio1 + "Brooklyn,NY " + zipcode[i]);
            }//end of else if condition

            if(i==2) {
                driver.findElements(By.xpath("//div[@class='location__top']")).get(2).click();
                //String studio2 = driver.findElement(By.xpath("//div[contains(text(),'938 Kings Highway')]")).getText();
                //String Name2 = driver.findElement(By.xpath("//span[contains(text(),'WW Studio Kings Highway')]")).getText();
                //System.out.println("I searched for Studio 2.The name of studio 2 is " + Name2 + " and the address is " + studio2 + "Brooklyn,NY " + zipcode[i]);
            }//end of else condition*/

            String address= driver.findElement(By.xpath("//*[@class='location']")).getText();
            String schedule= driver.findElement(By.xpath("//*[@class='meeting-schedule meeting-detail-bottom-section']")).getText();
            System.out.println("The name and address of the studio workshop is "+ "\n"+ address);
            System.out.println("The schedule for the selected studio is "+"\n"+schedule);




        }//end of for loop
        // WebElement message = driver.findElement(By.xpath("//div[@class='meeting-schedule meeting-detail-bottom-section']"));
        //System.out.println("The Virtual Workshop Schedule is " + message.getText());
        driver.quit();
    }//end of the main method
}//end of the java class
