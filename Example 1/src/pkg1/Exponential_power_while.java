package pkg1;

import java.util.Scanner;

public class Exponential_power_while 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the base value : ");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int base = num;
		System.out.println("Enter the value of exponential: ");
		int exponent = s.nextInt();
		int exp = exponent;
		int result=1;

	    while (exp > 0)
	    {
	        result *= base;
	        --exp;
	    }
	    
	    System.out.println("Result of "+num+" to the power "+exponent+" is : "+result);
	}
}
