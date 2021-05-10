package txt_file_handling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Read_data_byCharacter 
{
	public static void main(String[] args) throws IOException 
	{
		File f = new File("../Example 1/Input.txt");
		FileReader fr = new FileReader(f);
		
		int a;
		while ((a = fr.read()) != -1)
		{
			System.out.println((char)a);
		}
	}
}
