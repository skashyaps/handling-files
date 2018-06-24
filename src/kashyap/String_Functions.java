package kashyap;

public class String_Functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "The rains have started here";
		String str1 = "The rains have not started here";
		
		System.out.println("Length is " + str.length());
        System.out.println(str.charAt(5));
        System.out.println("First occurence of s "+ str.indexOf('s'));
        System.out.println("Second occurence of s "+ str.indexOf("s", 9));
        System.out.println(str.indexOf("Hello"));
        System.out.println(str.equals (str1));
        System.out.println(str.substring(0,10));
        
        System.out.println("................................");
        
        String temp[]= str.split(" " );
        
        for (int i=0;i<temp.length;i++)
          System.out.println(temp[i]);
        
        // Convert Datatypes
        
        // String to integer 
        String x ="100";
        int i= Integer.parseInt(x);
        
        // integer to string
        String z = String.valueOf(i);
        
        boolean b = Boolean.valueOf("true");
        
        
	}

}
