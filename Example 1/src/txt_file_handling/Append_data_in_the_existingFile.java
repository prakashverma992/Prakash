package txt_file_handling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Append_data_in_the_existingFile 
{
	public static void main(String[] args) throws IOException 
	{
		File f = new File("../Example 1/Input1.txt");
		FileWriter fw = new FileWriter(f, true);				//append command in FileWriter Class
		BufferedWriter b = new BufferedWriter(fw);
		b.newLine();
		b.write("Automation is very easy");
		b.newLine();
		b.write("Selenium is easy");
		b.close();
	}
}
