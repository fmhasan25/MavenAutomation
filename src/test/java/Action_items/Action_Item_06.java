package Action_items;
import Reusable_classes.Reusable_For_Kayak;
import Reusable_classes.Reusable_Library;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
public class Action_Item_06 {
    //declaration of WebDriver
    WebDriver driver;
    //Declaring the ReadAble File
    Workbook readableFile;
    //Declaring the Readable Sheet
    Sheet readableSheet;
    //Declaring the Writable File
    WritableWorkbook writableFile;
    //Declaring the Writable Sheet
    WritableSheet writableSheet;


    @BeforeSuite
    public void callDriver() throws IOException, BiffException {
        driver= Reusable_For_Kayak.setDriver();
        //Define path for Readable File
        readableFile = Workbook.getWorkbook(new File("src/main/java/Excel/Excel_Kayak.xls"));
        //Define Readable sheet
        readableSheet=readableFile.getSheet(0);
        //Define Writable File
        writableFile = Workbook.createWorkbook(new File("src/main/java/Excel/Excel_Kayak_Result.xls"),readableFile);
        writableSheet = writableFile.getSheet(0);

    }//end of Call Driver Before Suite

    @Test
    public  void kayakTest() throws InterruptedException, WriteException, IOException {
        int rows = writableSheet.getRows();
        for (int i=1; i<rows; i++) {

            //Navigating to Kayak webSite
            driver.navigate().to("https://www.kayak.com");
            //Click on the search box
            Reusable_Library.click(driver,"","");
        }//end of for loop

    }//end of Kayak test Method

    @AfterSuite
    public void closeAndQuit() throws InterruptedException, IOException, WriteException {
        Thread.sleep(1000);
        writableFile.write();
        writableFile.close();
        readableFile.close();

        Thread.sleep(3000);
        driver.quit();


    }
    }
