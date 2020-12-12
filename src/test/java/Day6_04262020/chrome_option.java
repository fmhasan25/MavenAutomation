package Day6_04262020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class chrome_option {
    public static void main(String[] args) throws InterruptedException {
        //set the chrome path
        System.setProperty("webdriver.chrome.driver", "src/Resource/chromedriver 2");
       //Set some pre conditions using ChromeOption
        ChromeOptions options = new ChromeOptions();
        //set the arguments you want for the driver
        options.addArguments("incognito");
       //now simply define your chrome driver
        WebDriver driver = new ChromeDriver(options);
        driver.navigate().to("https://www.mlcalc.com");
        Thread.sleep(4000);
       //I want to capture the title of the page
        //System.out.println("my title is "+driver.getTitle());
        //store your actual title on a variable and then compare wht your expected
        String actualTitle = driver.getTitle();
        if(actualTitle.equals("MORTGAGE CALCULATOR & LOAN CALCULATOR")){
            System.out.println("Title matches with expected");
        }else{
            System.out.println("Title doesn't match "+ actualTitle);
        }
        //now simply use fullscreen
       // driver.manage().window().fullscreen();
      //if same locator used more than once then store it as a WebElement variable to reuse it
        WebElement pPrice=driver.findElement(By.xpath("//input[@id='ma']"));
        //clear the field first
        pPrice.clear();
        //enter your new data

        pPrice.sendKeys("4000000");
        //store your start month in WEbElement variable and call it on your select command

        WebElement sMonth =driver.findElement(By.xpath("//select[@name='sm']"));
        //call my select command and it only works when your dropdown locator is under select tag name
        Select sMonthList = new Select(sMonth);
        //select the drop down value by visible text
        //sMonthList.selectByValue("0");
        //sMonthList.selectByIndex(0);
        sMonthList.selectByVisibleText("Aug");
//whenever drop down is not under select tag then we must click ont he dropdown and then
        //click on the value of the dropdown

        //let's verify soem of the start year to make sure it's matching on the drop down
        String[] yearArray= new String[]{"2005","2015","2035"};
        for(int i = 0; i <yearArray.length; i++){
            driver.findElement(By.xpath("//*[@name='sy']")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[text()='"+yearArray[i]+"']")).click();

        }
       /* driver.findElement(By.xpath("//*[@name='sy']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='2025']")).click();*/
    }//end of the main method
}//end of the java class
