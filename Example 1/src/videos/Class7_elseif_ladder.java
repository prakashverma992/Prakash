package videos;

import java.util.Scanner;

public class Class7_elseif_ladder 
{
	public static void main(String[] args) 
	{
		System.out.println("Please enter Marks");
		Scanner s = new Scanner(System.in);
		int marks = s.nextInt();
		
		if ((marks>=0) &&(marks<=33))
		{
			System.out.println("Failed");
		}
		else if ((marks>=34) &&(marks<=60))
		{
			System.out.println("Passed");
		}
		else if ((marks>=61) &&(marks<=75))
		{
			System.out.println("First Division");
		}
		else if ((marks>=76) &&(marks<=100))
		{
			System.out.println("Distinction with Merit");
		}
		else
		{
			System.out.println("Please enter correct value");
		}
	}
}
