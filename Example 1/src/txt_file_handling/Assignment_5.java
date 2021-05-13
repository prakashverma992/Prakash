package txt_file_handling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Assignment_5 			//using method
{
	static String s1 = "";
	static int i;
	static int j = i;
	public static void ReadData() throws IOException
	{
		File f1 = new File("../Example 1/Input1.txt");
		FileReader fr1 = new FileReader(f1);
		System.out.println("\t File 1 Data: ");
		while ((i = fr1.read()) != -1)
		{
			s1 = s1 + (char) i;
		}
		System.out.println(s1);
		fr1.close();
	}
	
	public static void WriteData() throws IOException
	{
		File f2 = new File("../Example 1/Assignment_5.txt");
		FileWriter fr2 = new FileWriter(f2);
		BufferedWriter b2 = new BufferedWriter(fr2);
		System.out.println("\n\t Copy Paste from File1 to File 2 \n \t File 2 Data:");
		for (j=i; j >= i; j--)
		{
			System.out.println(s1);
			b2.write(s1);
			b2.newLine();
		}
		b2.close();
	}
	
	public static void main(String[] args) throws IOException 
	{
		Assignment_5 np = new Assignment_5();
		np.ReadData();
		np.WriteData();
	}
}
