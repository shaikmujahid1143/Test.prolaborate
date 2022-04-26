/**
 * 
 */
package Base.Prolaborate;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @author IdeapadG3-03
 *
 */
public class XLdata 

{
	public static FileInputStream fi;
	public static Workbook wb;
	public static Sheet ws;
	public static Row row;
	public static Cell cell;
	public static CellStyle style;
	
	
	public static int getRowCount(String xlfile,String xlsheet) throws IOException
	{
		 fi=new FileInputStream(xlfile);
		 wb=new XSSFWorkbook(fi);
		 ws=wb.getSheet(xlsheet);
		 int rowcount=ws.getLastRowNum();
		 wb.close();
		 fi.close();
		 return rowcount;
		
	}
	
	public static double getColCount(String xlfile, String xlsheet, int rowNum) throws IOException
	
	{
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheet);
		row=ws.getRow(rowNum);
		double colCount=row.getLastCellNum();
		wb.close();
		fi.close();
		return colCount;
	}
	
	public static String getStringCellData(String xlfile, String xlsheet,int rowNum, int colNum) throws IOException
	{
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheet);
		row=ws.getRow(rowNum);
		String data;
		try{
			cell=row.getCell(colNum);
			data=cell.getStringCellValue();
		}
		catch(Exception e)
		{
			data=" ";
			System.out.println("Data not Found");
	
		}
		return data;
		
	}
	public static double getNumericCellData(String xlfile,String xlsheet, int rowNum, int colNum) throws IOException
	{
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheet);
		row=ws.getRow(rowNum);
		double data;
		try{
			cell=row.getCell(colNum);
			data=cell.getNumericCellValue();
		}
		catch(Exception e)
		{
			data=0.0;
			System.out.println("Data not Found");
	
		}
		return data;
	}

	public static boolean getBooleanCellData(String xlfile,String xlsheet, int rowNum, int colNum) throws IOException
	{
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheet);
		row=ws.getRow(rowNum);
		boolean data;
		try{
			cell=row.getCell(colNum);
			data=cell.getBooleanCellValue();
		}
		catch(Exception e)
		{
			data=false;
			System.out.println("Data not Found");
	
		}
		return data;
	}
	
	public static void getSetCellData(String xlfile,String xlsheet, int rowNum, int colNum, String data) throws IOException
	{
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheet);
		row=ws.getRow(rowNum);
		cell=row.createCell(colNum);
		cell.setCellValue(data);
		FileOutputStream fo=new FileOutputStream("Prolaborate_UserTestData (1).xlsx");
		wb.write(fo);
		fo.close();
		wb.close();
		fi.close();
	}


	public static void getfillGreenColor(String xlfile, String xlsheet, int rowNum, int colNum) throws IOException
	
	{
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheet);
		row=ws.getRow(rowNum);
		cell=row.getCell(colNum);
		style=wb.createCellStyle();
		style.setFillBackgroundColor(IndexedColors.BRIGHT_GREEN.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		cell.setCellStyle(style);
		FileOutputStream fo=new FileOutputStream("Prolaborate_UserTestData (1).xlsx");
		wb.write(fo);
		fo.close();
		fi.close();
	}
	
public static void getfillRedColor(String xlfile, String xlsheet, int rowNum, int colNum) throws IOException
	
	{
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheet);
		row=ws.getRow(rowNum);
		cell=row.getCell(colNum);
		style=wb.createCellStyle();
		style.setFillBackgroundColor(IndexedColors.RED.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		cell.setCellStyle(style);
		FileOutputStream fo=new FileOutputStream("Prolaborate_UserTestData (1).xlsx");
		wb.write(fo);
		fo.close();
		fi.close();
	}

}









