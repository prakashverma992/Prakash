package patterns;

import java.util.Scanner;

public class Star_Tree 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the Rows: ");
		Scanner s = new Scanner(System.in);
		int row = s.nextInt();
		
		for(int i=1; i<=row; i++)
		{
			for(int j=row; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int k= 1; k<=(2*i)-1; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
