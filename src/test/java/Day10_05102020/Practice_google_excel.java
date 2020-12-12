package Day10_05102020;


import Reusable_classes.Reusable_Library;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class Practice_google_excel {
    public static void main(String[] args) throws IOException, BiffException {
        Workbook sourceFile = Workbook.getWorkbook(new File("src/Resource/Google_Search.xls"));
        Sheet sourceSheet = sourceFile.getSheet(0);
        WritableWorkbook resultFile = Workbook.createWorkbook(new File("src/Resource/Google_Search_Result.xls"),sourceFile);
        WritableSheet resultSheet = resultFile.getSheet(0);
        int rows = resultSheet.getRows();
        WebDriver driver = Reusable_Library.setDriver();
        driver.navigate().to("https://www.google.com");
        String cars = resultSheet.getCell(0,2).getContents();
        Reusable_Library.verifyTitle(driver,"Google");
        Reusable_Library.userKeys(driver,"//*[@name='q']",cars,"Searchbox");
        Reusable_Library.submit(driver,"//*[@name='q']","Submit");
        String searchResults= Reusable_Library.captureText(driver,"//*[@id='result-stats']","SearchResults");
        String[]fraction=searchResults.split(" ");
        System.out.println();



    }//end of the main method
}//end of the java class
