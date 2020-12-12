package Action_items;

import Reusable_classes.Reusable_Library;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class Express_Actionitem {
    public static void main(String[] args) throws IOException, BiffException, InterruptedException, WriteException {
        Workbook readableFile = Workbook.getWorkbook(new File("src/Resource/Express@online.xls"));
        Sheet readableSheet = readableFile.getSheet(0);
        WritableWorkbook writableFile = Workbook.createWorkbook(new File("src/Resource/Express@onlineResult.xls"), readableFile);
        WritableSheet writableSheet = writableFile.getSheet(0);
        int Rows = writableSheet.getRows();
        WebDriver driver = Reusable_Library.setDriver();
        for (int i = 1; i < Rows; i++) {

            driver.navigate().to("https://www.express.com");
            Thread.sleep(3000);
            String size = writableSheet.getCell(0, i).getContents();
            //Defining the quantity from the excel file
            String quantity = writableSheet.getCell(1, i).getContents();
            //Defining the first name from the excel file
            String firstName = writableSheet.getCell(2, i).getContents();
            //Defining the last name from the excel file
            String lastName = writableSheet.getCell(3, i).getContents();
            //Defining the email address from the excel file
            String emailAddress = writableSheet.getCell(4, i).getContents();
            //Defining the confirm email from the excel file
            String confirmEmail = writableSheet.getCell(4, i).getContents();
            //Defining the phone number from the excel file
            String phoneNumber = writableSheet.getCell(5, i).getContents();
            //Defining the street number from the excel file
            String streetNumber = writableSheet.getCell(6, i).getContents();
            //Defining the apt number from the excel file
            String aptNumber = writableSheet.getCell(7, i).getContents();
            //Defining the postal number from the excel file
            String postalNumber = writableSheet.getCell(8, i).getContents();
            //Defining the city from from the excel file
            String city = writableSheet.getCell(9, i).getContents();
            //Defining the state from the excel file
            String state = writableSheet.getCell(10, i).getContents();
            //Defining the credit card number from the excel file
            String ccNumber = writableSheet.getCell(11, i).getContents();
            //Defining the credit card expired month from the excel file
            String ccExpireMonth = writableSheet.getCell(12, i).getContents();
            //Defining the credit card expired year from the excel file
            String ccExpireYear = writableSheet.getCell(13, i).getContents();
            //Defining the credit card cvv from the excel file
            String cVV = writableSheet.getCell(14, i).getContents();
            //Hovering the mouse over Women button
            Reusable_Library.mouseHover(driver, "(//*[@class='_399XX MegaMenu_primaryNav__label__1s3d1']) [1]", "Hovering");
            Reusable_Library.click(driver, "//*[text()='Dresses']", "clicking Dress");
            Thread.sleep(3000);
            Reusable_Library.click(driver, "(//*[@class='_1ddDj _136PD']) [1]", "First Dress");
            Thread.sleep(3000);
            Reusable_Library.click(driver, "//*[@value='" + size + "']", "First Dress");
            Reusable_Library.click(driver, "//*[text()='Add to Bag']", "Clicking Add to Bag");
            Reusable_Library.mouseHover(driver, "(//*[@class='_2CsVP svg-icon--shopping-bag']) [2]", "Hovering the bag");
            Thread.sleep(2000);
            Reusable_Library.click(driver, "//*[text()='View Bag & Check Out']", "View Bag & checkout");
            Thread.sleep(2000);
            Reusable_Library.dropdownByText(driver, "//*[@id='qdd-0-quantity']", quantity, "Quantity");
            Reusable_Library.click(driver, "//*[text()='Checkout']", "Clicking Checkout");
            Reusable_Library.click(driver, "//*[text()='Continue as Guest']", "Clicking guest");
            Reusable_Library.userKeys(driver, "//*[@name='firstname']", firstName, "First Name");
            Reusable_Library.userKeys(driver, "//*[@name='lastname']", lastName, "Last Name");
            Reusable_Library.userKeys(driver, "//*[@name='email']", emailAddress, "email");
            Reusable_Library.userKeys(driver, "//*[@name='confirmEmail']", confirmEmail, "Confirm email");
            Reusable_Library.userKeys(driver, "//*[@name='phone']", phoneNumber, "Phone Number");
            Reusable_Library.click(driver, "//*[text()='Continue']", "continue");
            Thread.sleep(2000);
            //Reusable_Library.dropdownByValue(driver, "//*[@name='shipping.countryCode']", "US", "Selecting country");
            Reusable_Library.userKeys(driver, "//*[@name='shipping.line1']", streetNumber, "Street Number");
            Reusable_Library.userKeys(driver, "//*[@name='shipping.line2']", aptNumber, "Apartment");
            Reusable_Library.userKeys(driver, "//*[@name='shipping.postalCode']", postalNumber, "Postal Code");
            Reusable_Library.userKeys(driver, "//*[@name='shipping.city']", city, "City");
            Reusable_Library.dropdownByText(driver, "//*[@name='shipping.state']", state, "State");
            Thread.sleep(1000);
            Reusable_Library.click(driver, "//*[text()='Continue']", "Continue");
            Thread.sleep(2000);
            Reusable_Library.click(driver, "//*[text()='Continue']", "Continue");
            Reusable_Library.userKeys(driver, "//*[@name='creditCardNumber']", ccNumber, "Credit card number");
            Reusable_Library.dropdownByText(driver, "//*[@name='expMonth']", ccExpireMonth, "Expired Month");
            Reusable_Library.dropdownByText(driver, "//*[@name='expYear']", ccExpireYear, "Expired Year");
            Reusable_Library.userKeys(driver, "//*[@name='cvv']", cVV, "CVV");
            Thread.sleep(2000);
            Reusable_Library.click(driver, "//*[text()='Place Order']", "Place Order");
            String errorMessage = Reusable_Library.captureText(driver, "//div[@id='rvn-note-NaN']", "Error message");
            Label label = new Label(15, i, errorMessage);
            writableSheet.addCell(label);
            driver.manage().deleteAllCookies();

        }//end of for loop
        writableFile.write();
        writableFile.close();
        readableFile.close();
        driver.quit();

    }//end of the main method

}//end of the java class
