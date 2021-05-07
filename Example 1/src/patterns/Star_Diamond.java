package patterns;

import java.util.Scanner;

public class Star_Diamond 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the Rows: ");
		Scanner s = new Scanner(System.in);
		int row = s.nextInt();
		int i, j, k;
		
		for(i=1; i<=row; i++)
		{
			for(j=row-1; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(k= 1; k<=(2*i)-1; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(i=row-1; i>=1; i--)
		{
			for(j=row-1; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(k= 1; k<=(2*i)-1; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
