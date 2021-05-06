package videos;

import java.util.Scanner;

public class Class7_switchcase 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a value of operator: ");
		Scanner s = new Scanner(System.in);
		int operator = s.nextInt();
		System.out.println("Enter value of a and b: ");
		int a = s.nextInt();
		int b = s.nextInt();
		int result;
		
		switch (operator) 
		{
		case 1:
			result = a+b;
			System.out.println("Result is "+result);
			break;
		case 2:
			result = a-b;
			System.out.println("Result is "+result);
			break;
		case 3:
			result = a*b;
			System.out.println("Result is "+result);
			break;
		case 4:
			result = a/b;
			System.out.println("Result is "+result);
			break;

		default:
			System.out.println("Please enter a correct operator");
			break;
		}
	}
}
