import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
//        String filePath = "TestMenu.xlsx";
//        FileInputStream fileInput = new FileInputStream(new File(filePath));
//        Workbook workbook = WorkbookFactory.create(fileInput);
//
//        Sheet sheet = workbook.getSheetAt(0);
//
//        int lastRow = sheet.getLastRowNum();
//
//        //Updating Cells
//        int column = 2;
//        String month = "Jan";
//        int day = 6;
//
//        Cell updatedCell = sheet.getRow(4).getCell(2);
//        updatedCell.setCellValue("Date: " + month + "/" + 6);
//
//        updatedCell = sheet.getRow(4).getCell(3);
//        updatedCell.setCellValue("Date: " + month + "/" + 7);
//
//        updatedCell = sheet.getRow(4).getCell(4);
//        updatedCell.setCellValue("Date: " + month + "/" + 8);
//
//        updatedCell = sheet.getRow(4).getCell(5);
//        updatedCell.setCellValue("Date: " + month + "/" + 9);
//
//        updatedCell = sheet.getRow(4).getCell(6);
//        updatedCell.setCellValue("Date: " + month + "/" + 10);
//
//
//        fileInput.close();
//
//        FileOutputStream fileOutput = new FileOutputStream(filePath);
//        workbook.write(fileOutput);
//        workbook.close();
//        System.out.println("Updated Created Successfully.");







        //Big Idea:
            // 1. Create Workbook
            // 2. Create a sheet (tab) within a workbook
            // 3. Create an entire row
            // 4. Create individual cells within the row
            // 5. Add stuff to cell w/ "setCellValue()"

            // 6. Create new FileOutputStream
            // 7. workbook.write(fileName);
            // 8. workbook.close();
            // 9. Done.


//        //Creates Workbook
//        XSSFWorkbook workbook = new XSSFWorkbook();
//        //Creates Spreadsheet
//        XSSFSheet sheet = workbook.createSheet("Test WorkSheet");
//
//        //Creates "Row" Object
//        XSSFRow row;
//        //Creates Cells + Set Values
//        row = sheet.createRow(0);
//        Cell cell0 = row.createCell(0);
//        Cell cell1 = row.createCell(1);
//        Cell cell2 = row.createCell(2);
//
//        cell0.setCellValue("Serial Num");
//        cell1.setCellValue("Names");
//        cell2.setCellValue("Results");
//
//        //Writing to Excel File
//        try{
//            FileOutputStream file = new FileOutputStream(new File("JavaMenuCreation.xlsx"));
//            workbook.write(file);
//            file.close();
//            System.out.println("File Modified Successfully.");
//
//        } catch (Exception e){
//            System.out.println("Couldn't Write to file.");
//        }
    }
}
