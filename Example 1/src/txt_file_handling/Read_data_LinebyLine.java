package txt_file_handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Read_data_LinebyLine 
{
	public static void main(String[] args) throws IOException 
	{
		File f = new File("../Example 1/Input.txt");
		FileReader fr = new FileReader(f);
		BufferedReader b = new BufferedReader(fr);
		
		String a;
		while((a= b.readLine())  != null)
		{
			System.out.println(a);
		}
	}
}
