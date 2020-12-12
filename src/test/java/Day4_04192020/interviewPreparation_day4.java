package Day4_04192020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class interviewPreparation_day4 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver86");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://google.com");
        System.out.println(driver.getTitle());

        ArrayList<String > sports=new ArrayList<>();
        sports.add("Soccer");
        sports.add("Cricket");

        for (int i=0; i<sports.size();i++){

            try{
                WebElement searchBox= driver.findElement(By.xpath("//*[@name='q']"));
                searchBox.sendKeys(sports.get(i));
                searchBox.submit();
                System.out.println("inserting the input and submit");
            }catch (Exception e){
                System.out.println("Unable to put the input "+ e);
            }

            String result= driver.findElement(By.xpath("//*[@id='result-stats']")).getText();
            String [] resultSpit= result.split(" ");
            System.out.println(resultSpit[1]);


        }//end of the for loop

        driver.quit();
    }//end of the main method
}//end of the java class
