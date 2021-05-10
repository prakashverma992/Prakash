package txt_file_handling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Assignment_4 
{
	public void WriteDataInaRange (int initialRowCount, int endRowCount) throws IOException
	{
		File f = new File("../Example 1/Assignment_4.txt");
		FileWriter fr = new FileWriter(f);
		BufferedWriter b =new BufferedWriter(fr);
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the data: \n");
		String x;
			for(int i = 1; i<initialRowCount; i++)
			{
				b.newLine();
				b.write("");
			}
			for (int i = initialRowCount; i <= endRowCount; i++)
			{
				if (i>=initialRowCount && i<=endRowCount)
				{
					System.out.println("Line "+i);
					x = s.nextLine();
					b.write(x);
					b.newLine();
				}
			}
		b.close();
	}
	
	public static void main(String[] args) throws IOException 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the initial row:");
		int a = s.nextInt();
		System.out.println("Please enter the end row:");
		int b= s.nextInt();
		Assignment_4 np = new Assignment_4();
		np.WriteDataInaRange(a, b);
	}
}
