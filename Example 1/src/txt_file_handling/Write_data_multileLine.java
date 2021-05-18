package txt_file_handling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write_data_multileLine 
{
	public static void main(String[] args) throws IOException 
	{
		File f = new File("../Example 1/Output.txt");     //connection established with the file
		FileWriter fw = new FileWriter(f);
		BufferedWriter b = new BufferedWriter(fw);
		
		b.write("First Line");
		b.newLine();
		b.write("Second Line of the file");
		b.newLine();
		b.write("Automation is very easy");
		b.close();
	}
}
