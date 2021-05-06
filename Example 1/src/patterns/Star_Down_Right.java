package patterns;

import java.util.Scanner;

public class Star_Down_Right 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the Rows: ");
		Scanner s = new Scanner(System.in);
		int row = s.nextInt();
		int col;
		for(int i=1; i<=row; i++)
		{
			for(int k= 1; k<=i; k++)
			{
				System.out.print(" ");
			}
			for(int j=row; j>=i; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
