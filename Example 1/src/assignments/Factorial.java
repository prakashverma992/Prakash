package assignments;

import java.util.Scanner;

public class Factorial 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number to find its factorial: ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(n+"!\n");
		int a =1;
		for(int i=1; i<=n; i++)
		{
			System.out.print(" "+i);
			a = a*i;
			System.out.println("		result: "+a);
		}
		System.out.println("\nFactorial of "+n+" is: "+a);
	}
}
