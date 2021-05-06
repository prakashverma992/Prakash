package videos;

import java.util.Scanner;

public class Class7_ifelse 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a Number: ");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		
		if (a%2==0)
		{
			System.out.println("It is an Even Number");
		}
		else
			System.out.println("It is an Odd Number");
	}
}
