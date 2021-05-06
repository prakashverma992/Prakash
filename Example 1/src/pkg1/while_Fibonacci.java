package pkg1;

import java.util.Scanner;

public class while_Fibonacci 
{
	public static void main(String[] args) 
	{
		int a=0, b=1, c;
		System.out.println("Enter range for Fibonaacci series: ");
		Scanner x = new Scanner(System.in);
		int count = x.nextInt();
		System.out.println(a);
		System.out.println(b);
		
		int j=2;
		while(j<count)
		{
			c=a+b;
			System.out.println(""+c);
			a=b;
			b=c;
			j++;
		}
	}
}
