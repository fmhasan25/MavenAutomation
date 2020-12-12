package Action_items;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class express_draft {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/Resource/chromedriver 2");
        ChromeOptions options = new ChromeOptions();
       options.addArguments("incognito");
        WebDriver driver = new ChromeDriver(options);
        //driver.manage().window().maximize();
        //navigate to USPS
        driver.navigate().to("https://www.express.com");
        Thread.sleep(3000);
        //call your Mouse Actions
        Actions mouse = new Actions(driver);
        WebElement WomenButton = driver.findElement(By.xpath("(//*[@class='_399XX MegaMenu_primaryNav__label__1s3d1']) [1]"));
        mouse.moveToElement(WomenButton).perform();
Thread.sleep(2000);
        WebElement dresses = driver.findElement(By.xpath("//*[text()='Dresses']"));
        dresses.click();
        Thread.sleep(4000);
        WebElement firstDress = driver.findElement(By.xpath("(//*[@class='_1ddDj _136PD']) [1]"));
        firstDress.click();
        Thread.sleep(3000);
        WebElement size = driver.findElement(By.xpath("(//*[@class='_3OQxl']) [4]"));
        size.click();
        WebElement addToBag = driver.findElement(By.xpath("//*[text()='Add to Bag']"));
        addToBag.click();
        Thread.sleep(7000);
        WebElement hoverAddToBag = driver.findElement(By.xpath("(//*[@class='_2CsVP svg-icon--shopping-bag']) [2]"));
        mouse.moveToElement(hoverAddToBag).perform();
        Thread.sleep(2000);
        WebElement hoverAndClickBag = driver.findElement(By.xpath("//*[@class='btn _9yfmt _194FD _2tFXQ']"));
        hoverAndClickBag.click();
        Thread.sleep(2000);
        WebElement checkout = driver.findElement(By.xpath("//button[@id='continue-to-checkout']"));
        checkout.click();
        Thread.sleep(3000);
        WebElement guest = driver.findElement(By.xpath("//button[@class='btn _9yfmt _194FD _2tFXQ']"));
        guest.click();
        Thread.sleep(3000);
        WebElement firstName = driver.findElement(By.xpath("//input[@id='contact-information-firstname']"));
        firstName.sendKeys("sheikh");
        WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
        lastName.sendKeys("hasina");
        WebElement email = driver.findElement(By.xpath("//div[@class='tABsB']//input[@name='email']"));
        email.sendKeys("sheikh@gmail.com");
        WebElement confirmEmail = driver.findElement(By.xpath("//input[@name='confirmEmail']"));
        confirmEmail.sendKeys("sheikh@gmail.com");
        WebElement phoneNumber = driver.findElement(By.xpath("//input[@name='phone']"));
        phoneNumber.sendKeys("3471112222");
        WebElement continueButton = driver.findElement(By.xpath("//span[contains(text(),'Continue')]"));
        continueButton.click();
        Thread.sleep(3000);
        WebElement street = driver.findElement(By.xpath("//input[@name='shipping.line1']"));
        street.sendKeys("8");
        WebElement apt = driver.findElement(By.xpath("//input[@name='shipping.line2']"));
        apt.sendKeys("14");
        WebElement aptNumber = driver.findElement(By.xpath("//input[@name='shipping.postalCode']"));
        aptNumber.sendKeys("14");
        WebElement postalNumber = driver.findElement(By.xpath("//input[@name='shipping.postalCode']"));
        postalNumber.sendKeys("11218");
        WebElement city = driver.findElement(By.xpath("//input[@name='shipping.city']"));
        city.sendKeys("Brooklyn");
        Thread.sleep(2000);
        Select dDown= new Select(driver.findElement(By.xpath("//*[@id='rvndd--shipping.state--3']")));
        dDown.selectByVisibleText("New York");
        Thread.sleep(2000);
        WebElement continue1 = driver.findElement(By.xpath("//span[contains(text(),'Continue')]"));
        continue1.click();
        WebElement continue2 = driver.findElement(By.xpath("(//button[@class='btn _9yfmt _194FD _2tFXQ _2SogC']) [1]"));
        continue2.click();



    }//end of the main method
}//end of the java class


//    WebElement hoverAndClickBag = driver.findElement(By.xpath("//*[@class='btn _9yfmt _194FD _2tFXQ']"));
//        hoverAndClickBag.click();

//    Reusable_Library.click(driver,"//*[@class='btn _9yfmt _194FD _2tFXQ']","hoberAndClickBag");
//            Reusable_Library.dropdownByText(driver,"//*[@id='qdd-0-quantity']",quantity,"Quantity");
//            Thread.sleep(2000);
//            Reusable_Library.click(driver,"//button[@id='continue-to-checkout']","Checkout");
//            Reusable_Library.click(driver,"//button[@class='btn _9yfmt _194FD _2tFXQ']","Guest");
//            Reusable_Library.userKeys(driver,"//input[@id='contact-information-firstname']",firstName,"First Name");
//            Reusable_Library.userKeys(driver,"//input[@name='lastname']",lastName,"Last Name");
//            Reusable_Library.userKeys(driver,"//div[@class='tABsB']//input[@name='email']",emailAddress,"Email");
//            Reusable_Library.userKeys(driver,"//input[@name='confirmEmail']",confirmEmail,"Confirm Email");
//            Reusable_Library.userKeys(driver,"//input[@name='phone']",phoneNumber,"Phone Number");
//            Thread.sleep(2000);
//            Reusable_Library.click(driver,"//span[contains(text(),'Continue')]","Continue");
//            Reusable_Library.userKeys(driver,"//input[@name='shipping.line1']",streetNumber,"Street Number");
//            Reusable_Library.userKeys(driver,"//input[@name='shipping.line2']",aptNumber,"Apt Number");
//            Reusable_Library.userKeys(driver,"//input[@name='shipping.postalCode']",postalNumber,"Postal Number");
//            Reusable_Library.userKeys(driver,"//input[@name='shipping.city']",city,"City");
//            Thread.sleep(2000);
//            Reusable_Library.dropdownByText(driver,"//*[@class='dropdown__select _2dMWs inputInactive _2mM0O _1BPrU']",state,"State");
//
//

