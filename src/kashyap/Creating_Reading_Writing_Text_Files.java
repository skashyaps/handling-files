package kashyap;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public class Creating_Reading_Writing_Text_Files {

	public static void main(String[] args) throws IOException {
		
		// creating a file 
		
		File f = new File ("C:\\Users\\puneet.kashyap\\Desktop\\Sachin\\temp.txt");
		f.createNewFile();
     
		// writing a file 
		
		FileWriter w = new FileWriter ("C:\\Users\\puneet.kashyap\\Desktop\\Sachin\\temp.txt");
		BufferedWriter out = new BufferedWriter (w);
		out.write("Hello we are writing in a file");
		out.newLine();
		out.write("This is a new line");
		out.flush();
		
		// reading from file 
		
		FileReader r  = new FileReader ("C:\\Users\\puneet.kashyap\\Desktop\\Sachin\\temp.txt"); 
		BufferedReader bfr = new BufferedReader (r);
		String x = "";
		
		//System.out.println(bfr.readLine());
		//System.out.println(bfr.readLine());
		
		while ((x = bfr.readLine()) != null){
			System.out.println(x);
			
		}
			
		}
		
		
	
	
	
	}


