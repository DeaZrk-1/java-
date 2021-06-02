package week12;

import java.io.File;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class ExcelDriver {
	public static void main(String[] args) {
		try{
			File file=new File("D:/student.xls");
			Workbook workbook =Workbook.getWorkbook(file);
			Sheet sheet=workbook.getSheet(0);
			int columns=sheet.getColumns();
			int rows=sheet.getRows();
			System.out.println("列="+columns+"行="+rows);
			for(int i=0;i<rows;i++)
			{
				Cell cell1=sheet.getCell(0,i);
				String id=cell1.getContents();
				Cell cell2=sheet.getCell(1,i);
				String name=cell2.getContents();
				Cell cell3=sheet.getCell(2,i);
				String gender=cell3.getContents();
				System.out.println("学号="+id+"\t名字="+name+"\t性别="+gender);
			}
			workbook.close();
	}
	catch(Exception e)
		{
		e.printStackTrace();
		}
	}

}
