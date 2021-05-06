package patterns;

import java.util.Scanner;

public class Star_Left 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the Rows: ");
		Scanner s = new Scanner(System.in);
		int row = s.nextInt();
		
		for(int i=1; i<=row; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
