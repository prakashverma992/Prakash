package assignments;

import java.util.Scanner;

public class Armstrong_Number 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter any 3 digit value to check Armstrong: ");
		Scanner s = new Scanner(System.in);
		int original_num = s.nextInt();
		int num = original_num;
		int sum=0;
		
		while(num>0)
		{
			int rem = num%10;	
			num = num/10; 
			sum = sum+(rem*rem*rem);
		}
		
		if(original_num==sum)
		{
			System.out.println("The number "+original_num+" is an Armstrong number.");
		}
		else
		{
			System.out.println("The number "+original_num+" is not an Armstrong number.");
		}
	}
}
