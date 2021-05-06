package assignments;

import java.util.Scanner;

//Swapping of two numbers without using third variable

public class Swap_2 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter two numbers to swap: ");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println("After Swapping: ");
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		
	}
}
