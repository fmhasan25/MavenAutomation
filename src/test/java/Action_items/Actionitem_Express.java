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

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Actionitem_Express {
    public static void main(String[] args) throws IOException, BiffException, InterruptedException, WriteException {
        //locate the readable file path
        Workbook readableFile = Workbook.getWorkbook(new File("src/Resource/Express.xls"));
        //locate the readable worksheet by index
        Sheet readableSheet = readableFile.getSheet(0);
        Desktop.getDesktop().open(new File("src/Resource/Express.xls"));
        //locate the writable workbook
        WritableWorkbook writableFile = Workbook.createWorkbook(new File("src/Resource/Express_result.xls"), readableFile);
        //locate the writable worksheet
        WritableSheet writableSheet = writableFile.getSheet(0);
        //get the total rows that are nto empty
        int rows = writableSheet.getRows();
        //define the web driver using reusable library
        WebDriver driver = Reusable_Library.setDriver();
        for (int i = 1; i < rows; i++) {
            //navigate to express
            driver.navigate().to("https://www.express.com/");
            //delay for 3 sec
            Thread.sleep(3000);
            //Defining the size from the excel file
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

            //Hovering the mouse on women
            Reusable_Library.mouseHover(driver, "(//*[@class='_399XX MegaMenu_primaryNav__label__1s3d1']) [1]", "Hovering Mouse");
            //Delaying for 1sec
            Thread.sleep(1000);
            //clicking the dresses from the dropdown
            Reusable_Library.click(driver, "//*[text()='Dresses']", "Dresses");
            //Clicking the First dress
            Reusable_Library.click(driver, "(//*[@class='_1ddDj _136PD']) [1]", "FirstDress");
            //Delay for 2 sec
            Thread.sleep(2000);
            //Choosing the size
            Reusable_Library.click(driver, "//button[@value='" + size + "']", "Size");
            //clicking Add to bag
            Reusable_Library.click(driver, "//*[text()='Add to Bag']", "AddToBag");
            //hovering over bag
            Reusable_Library.mouseHover(driver, "(//*[@class='_2CsVP svg-icon--shopping-bag']) [2]", "Hovering Bag");
            //Delay for 3sec
            Thread.sleep(3000);
            //clicking the bag
            Reusable_Library.click(driver, "//*[@class='btn _9yfmt _194FD _2tFXQ']", "hoberAndClickBag");
            //select the quantity
            Reusable_Library.dropdownByText(driver, "//*[@id='qdd-0-quantity']", quantity, "Quantity");
            //delay for 2 sec
            Thread.sleep(2000);
            Reusable_Library.click(driver, "//button[@id='continue-to-checkout']", "Checkout");
            //clicking guest button
            Reusable_Library.click(driver, "//button[@class='btn _9yfmt _194FD _2tFXQ']", "Guest");
            //Entering the first name
            Reusable_Library.userKeys(driver, "//input[@id='contact-information-firstname']", firstName, "First Name");
            //Entering the last name
            Reusable_Library.userKeys(driver, "//input[@name='lastname']", lastName, "Last Name");
            //Entering the email address
            Reusable_Library.userKeys(driver, "//div[@class='tABsB']//input[@name='email']", emailAddress, "Email");
            //Entering the email address again to confirm
            Reusable_Library.userKeys(driver, "//input[@name='confirmEmail']", confirmEmail, "Confirm Email");
            //Entering the phone number
            Reusable_Library.userKeys(driver, "//input[@name='phone']", phoneNumber, "Phone Number");
            //Delay for 2 sec
            Thread.sleep(2000);
            //clicking continue
            Reusable_Library.click(driver, "//span[contains(text(),'Continue')]", "Continue");
            //entering the street address
            Reusable_Library.userKeys(driver, "//input[@name='shipping.line1']", streetNumber, "Street Number");
            //entering the apartment number
            Reusable_Library.userKeys(driver, "//input[@name='shipping.line2']", aptNumber, "Apt Number");
            //Entering the postal code
            Reusable_Library.userKeys(driver, "//input[@name='shipping.postalCode']", postalNumber, "Postal Number");
            //Entering the city
            Reusable_Library.userKeys(driver, "//input[@name='shipping.city']", city, "City");
            //Selecting the state
            Reusable_Library.dropdownByText(driver, "//select[@name='shipping.state']", state, "State");
            //clicking the continue
            Reusable_Library.click(driver, "//span[contains(text(),'Continue')]", "Continue");
            //Delay for the 2sec
            Thread.sleep(2000);
            //clicking the continue again
            Reusable_Library.click(driver, "(//button[@class='btn _9yfmt _194FD _2tFXQ _2SogC']) [1]", "Continue Again");
            //entering the credit card number
            Reusable_Library.userKeys(driver, "//input[@id='creditCardNumberInput']", ccNumber, "Credit Card Number");
            //selecting the expired month from drop down
            Reusable_Library.dropdownByText(driver, "//*[@name='expMonth']", ccExpireMonth, "Expired Month");
            //selecting the expired year from drop down
            Reusable_Library.dropdownByText(driver, "//*[@name='expYear']", ccExpireYear, "Expired Year");
            //entering the cvv
            Reusable_Library.userKeys(driver, "//*[@name='cvv']", cVV, "CVV");
            //clicking place order
            Reusable_Library.click(driver, "//span[contains(text(),'Place Order')]", "Place Order");
            //capturing the error message in a variable
            String errorMessage = Reusable_Library.captureText(driver, "//div[@id='rvn-note-NaN']", "Error message");
            //Creating a label cell in the excel workbook
            Label newCell = new Label(15, 0, "errorMessage1");
            //Additional:  we can add a new cell in the excel file
            writableSheet.addCell(newCell);
            //Additional:  Label for the new cell
            Label errorCell = new Label(15, i, errorMessage);
            //adding back to writable cell
            //adding the cell to direct the error message
            writableSheet.addCell(errorCell);
            Label error = new Label(16,i,"a");
            writableSheet.addCell(error);
            //Clearing the cookies
            driver.manage().deleteAllCookies();
        }//end of the for loop


        //writing command to write on writable work sheet
        writableFile.write();
        //closing the writable work sheet
        writableFile.close();
        //closing the readable work sheet
        readableFile.close();
        //quitting the browser
        Thread.sleep(2000);
        Desktop.getDesktop().open(new File("src/Resource/Express_result.xls"));
        driver.quit();
    }//end of the main method
}//end of the java class
