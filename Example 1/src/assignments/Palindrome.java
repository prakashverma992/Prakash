package assignments;

import java.util.Scanner;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter any value to check Palindrome: ");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int original_num = num;
		int reverse_num = 0;
		
		while(num>0)
		{
			int rem = num%10;										//gives rem ie. last digit eg.: 3 for num 123
			reverse_num = (reverse_num*10)+rem; 			//rev_num= (0*10)+3= 3
			num = num/10; 												// shorten the number 123 to 12
											//last value of reverse_number is the reverse of the original number
		}
		
		if(original_num==reverse_num)
		{
			System.out.println("\nReverse of number "+""+original_num+" is: "+reverse_num);
			System.out.println("\nTherefore "+original_num+" is a Palindrome. ");	
		}
		else
		{
			System.out.println("\nReverse of number "+""+original_num+" is: "+reverse_num);
			System.out.println("\nTherefore "+original_num+" is not a Palindrome. ");	
		}
	}
}
