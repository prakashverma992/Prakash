package patterns;

import java.util.Scanner;

public class Number_Pattern_3 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the Rows: ");
		Scanner s = new Scanner(System.in);
		int row = s.nextInt();
		
		int count =0;
		for(int i=1; i<=row; i++)							//Row print
		{
			for(int j=1; j<=i; j++)							//Column print
			{
				count = count + 1;
				System.out.print(" "+count);
			}
			System.out.println();
		}
	}
}
