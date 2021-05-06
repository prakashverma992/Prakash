package assignments;

import java.util.Scanner;

public class Assignment6 		//Using has a relationship between two Classes
{
	public static void main(String[] args) 
	{
		System.out.println("Solve the expression 1: \n\t(((((x1*x2)+x3)+x4)-x5)/x6)");
		Assignment2 np1 = new Assignment2(); 				//using object of different Class
		float a[] = new float[6];
		Scanner np = new Scanner(System.in);
		for(int i=0; i<=5; i++)
		{
			int k =i+1;
			System.out.println("Enter the value of x"+k);
			a[i] = np.nextInt();
		}
		float mulR = np1.mul(a[0], a[1]);						//using methods and object of Parent Class
		float addR = np1.add(mulR, a[2]);					
		float addR1= np1.add(addR, a[3]);
		float subR = np1.sub(addR1, a[4]);
		float divR = np1.div(subR, a[5]);
		System.out.println("\nTotal: "+divR);
	}
}
