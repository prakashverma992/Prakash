package assignments;

import java.util.Scanner;

public class Prime_number 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number to check prime number: ");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		boolean isPrime=true;
		
		for(int i =2; i<=num/2; i++)
			{
				if (num%i==0)
				{
					System.out.println("The number "+num+" is not a prime number");
					isPrime=false;
					break;
				}
			}
		if (isPrime)
		{
			System.out.println("The number "+num+" is a prime number");
		}
	}
}
