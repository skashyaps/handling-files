package kashyap;


public class Reading_XLS_Files {

	public static void main(String[] args) {
		
		Xls_Reader datatable = new Xls_Reader ("C:\\Users\\puneet.kashyap\\Desktop\\Sachin\\Selenium\\Data.xlsx");
		  int r =  datatable.getRowCount("Record");
		  System.out.println(r);
		    String data=  datatable.getCellData("Record", "City", 2);
		    System.out.println(data);
		     data=  datatable.getCellData("Record", "Name", 3);
		     System.out.println(data);
		     System.out.println(datatable.getColumnCount("Record"));
		     datatable.setCellData("Record", "Name", 5, "Virat");
		  // We can read data from as many excel sheets 
		     //Xls_Reader datatable1 = new Xls_Reader ("C:\\Users\\puneet.kashyap\\Desktop\\Sachin\\Selenium\\Data1.xlsx");
		
	
	
	}

	}


