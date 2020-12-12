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

public class test {
    public static void main(String[] args) throws IOException, WriteException, InterruptedException, BiffException {
        //Step 1
        //locate the readable file path
        //for the getWorkbook add exception
        Workbook readableFile = Workbook.getWorkbook(new File("src/Resource/Express_shop.xls"));

        //Step 2
        //locate the readable worksheet by index
        Sheet readableSheet = readableFile.getSheet(0);
        //step 3
        //we need create a writable workbook to mimic readable because we should't be writing on readable file
        WritableWorkbook writableFile = Workbook.createWorkbook(new File("src/Resource/Express_shop_result.xls"),readableFile);
        ////create writable sheet at the end as you above the name its going to be different name for result
        //create writable sheet
        WritableSheet writableSheet= writableFile.getSheet(0);
        //get the total rows that are not empty
        int rows = writableSheet.getRows();

        //define the web driver using reusable library
        WebDriver driver = Reusable_Library.setDriver();

        //define the for loop
        for(int i=1; i< rows; i++){
            //step 4:
            //store the cars column values as a String variable
            //columns are always hard coded whereas the rows are dynamic based on your i
            String cars = writableSheet.getCell(0,i).getContents();

            //navigate to google page
            driver.navigate().to("https://www.google.com");
            Thread.sleep(2500);
            //reusable library to enter car values on search field
            Reusable_Library.userKeys(driver,"//*[@name='q']",cars,"Search Field");
            //reusable library to click on google search
            Reusable_Library.submit(driver,"//*[@name='btnK']","Google Search");
            //timeout
            Thread.sleep(2500);
            String result = Reusable_Library.captureText(driver,"//*[@id='result-stats']","Search Result");
            String[] resultArray = result.split(" ");
            System.out.println("My search number is "+ resultArray[1]);

            //Step 5
            //write the search number result back to writable sheet
            Label label = new Label(2,i,resultArray[1]+" "+resultArray[3]+ " "+ resultArray[4]);
            //adding back to writable cell
            writableSheet.addCell(label);
        }//end of the for loop
        //outside of the loop we need to write and close the excel
        writableFile.write();
        writableFile.close();
        readableFile.close();

        //quit session
        driver.quit();
    }//end of the main method
}//end of the java class
