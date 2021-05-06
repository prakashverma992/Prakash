package assignments;

import java.util.Scanner;

//Swapping of two numbers using third variable

public class Swap_1 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter two numbers to swap: ");
		Scanner np = new Scanner(System.in);
		int a = np.nextInt();
		int b = np.nextInt();
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println("After Swapping: ");
		int c=a;
		a=b;
		b=c;
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}
}
