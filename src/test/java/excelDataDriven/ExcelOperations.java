package excelDataDriven;

public class ExcelOperations 
{

	public static void main(String[] args) throws Exception 
	{
		ExcelAPI e = new ExcelAPI("C:\\Users\\DELL\\Desktop\\testdata2.xlsx");
		
		System.out.println(e.getCellData("login", 1, 1));
		System.out.println(e.getCellData("login", "UserName", 2));
		e.setCellData("login", 4, 2, "Skipped");
	}

}
