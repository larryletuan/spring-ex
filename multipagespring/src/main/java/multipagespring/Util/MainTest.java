package multipagespring.Util;
import java.io.*;


public class MainTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	  int k = getInt();
	  System.out.println("chuoi sang so = "+k);
		
	}

	
	  public static int getInt() throws IOException
	  
	  { 
		 
		  String s = getString();
		  return Integer.parseInt(s);
	  
	  }	
	 
	public static String getString() throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader 	br = new BufferedReader(isr);
		String s=null;
		System.out.println("nhap so=");
		s = br.readLine();
		return s; 
			
	}

}
