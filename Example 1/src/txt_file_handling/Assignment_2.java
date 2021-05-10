package txt_file_handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Assignment_2 
{
	public void ReadDataofRange (int initial_row, int end_row) throws IOException
	{
		File f = new File("../Example 1/Assignment_1&2.txt");
		FileReader fr = new FileReader(f);
		BufferedReader b = new BufferedReader(fr);
		int i = 0;
		String s;
		while ((s=b.readLine()) != null)
		{
			i++;
			if ((i>=initial_row) && (i<= end_row))
			{
				System.out.println("Line "+initial_row+": "+s);
				initial_row++;
			}
		}
	}
	public static void main(String[] args) throws IOException
	{
		Scanner S = new Scanner(System.in);
		System.out.println("Please enter the initial row:");
		int a = S.nextInt();
		System.out.println("Please enter the end row:");
		int b= S.nextInt();
		Assignment_2 np = new Assignment_2();
		np.ReadDataofRange(a, b);
	}
}
