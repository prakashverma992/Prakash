package txt_file_handling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Assignment_3 
{
	public void WriteData(int row) throws IOException
	{
		File f = new File("../Example 1/Assignment_3.txt");
		FileWriter fr = new FileWriter(f);
		BufferedWriter b = new BufferedWriter(fr);
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the data till row number= "+row+": \n");
		String x;
		for (int j=1; j<=row; j++)
		{
			x = s.nextLine();
			b.write(x);
			b.newLine();
		}
		b.close();
	}
	
	public static void main(String[] args) throws IOException 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the row count: \n");
		int row_count = s.nextInt();
		Assignment_3 np = new Assignment_3();
		np.WriteData(row_count);
	}
}
