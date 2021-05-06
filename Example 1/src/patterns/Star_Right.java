package patterns;

import java.util.Scanner;

public class Star_Right 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the Rows: ");
		Scanner s = new Scanner(System.in);
		int row = s.nextInt();
		
		for(int i=1; i<=row; i++)
		{
			for(int j=row-1; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int k= 1; k<=i; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
