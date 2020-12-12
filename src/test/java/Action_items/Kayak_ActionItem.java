package Action_items;

import Reusable_classes.Reusable_Library;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class Kayak_ActionItem {
    WebDriver driver;
    Workbook readableFile;
    Sheet readableSheet;
    WritableWorkbook writableFile;
    WritableSheet writableSheet;
 @BeforeSuite
    public void defineDriver() throws IOException, BiffException {
     readableFile=Workbook.getWorkbook(new File("src/main/java/Excel/Kayak.xls"));
     readableSheet= readableFile.getSheet(0);
     writableFile= Workbook.createWorkbook(new File("src/main/java/Excel/KayakResults.xls"),readableFile);
     writableSheet= writableFile.getSheet(0);
     //Define the driver
     driver = Reusable_Library.setDriver();
 }//end of the before suite

    @Test
    public void kayakBooking() throws IOException, WriteException {
        int row = writableSheet.getRows();
        for(int i=1;i<row;i++) {

            //opening the browser
            driver.navigate().to("https://www.kayak.com");
        }//end of the for loop
    }//end of the test suite


    @AfterSuite
    public void driverQuit() throws IOException, WriteException {
     writableFile.write();
     writableFile.close();
     readableFile.close();
     driver.quit();
    }//end of the after suite


}//end of the java class
