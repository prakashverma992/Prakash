package txt_file_handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write_data_singleLine 
{
	public static void main(String[] args) throws IOException 
	{
		File f = new File("../Example 1/Output1.txt");
		FileWriter fw = new FileWriter(f);
		fw.write("First Line of the file");
		fw.close();	
	}
}
