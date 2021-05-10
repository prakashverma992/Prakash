package txt_file_handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Assignment_1 
{
	public void ReadData(int row_num) throws IOException
	{
		File f = new File("../Example 1/Assignment_1&2.txt");
		FileReader fr = new FileReader(f);
		BufferedReader b = new BufferedReader(fr);
		int i = 0;
		String s;
		while((s = b.readLine()) != null)
			{
				i++;
				if (i == row_num)
					{
						System.out.println(s);
					}
			}
	}
	
	public static void main(String[] args) throws IOException 
	{
		System.out.println("Please Enter the Row number to read it: ");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		Assignment_1 a = new Assignment_1();
		a.ReadData(num);
	}
}
