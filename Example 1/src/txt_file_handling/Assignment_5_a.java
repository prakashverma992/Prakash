package txt_file_handling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Assignment_5_a 							//without using method
{
	public static void main(String[] args) throws IOException 
	{
		File f1 = new File("../Example 1/Input1.txt");
		FileReader fr1 = new FileReader(f1);
		BufferedReader br1 = new BufferedReader(fr1);
		
		File f2 = new File("../Example 1/Assignment_5_a.txt");
		FileWriter fr2 = new FileWriter(f2);
		BufferedWriter bw2 = new BufferedWriter(fr2);
		System.out.println("Execution done: \nCopy-paste of File1 to File2 \n");
		System.out.println("Data of ReadFile:\n");
		String s;
		while ((s = br1.readLine()) != null)
		{
			System.out.println(s);
			bw2.write(s);
			bw2.newLine();
		}
		br1.close();
		bw2.close();
	}
}
