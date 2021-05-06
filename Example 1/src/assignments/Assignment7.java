package assignments;

import java.util.Scanner;

public class Assignment7 extends Assignment2				//using Inheritance
{
	public static void main(String[] args) 
	{
		System.out.println("Solve the expression 2: \n\t(((((x1-x2)+x3)-x4)/x5)*x6)");
		Scanner np = new Scanner(System.in);
		Assignment7 np2 = new Assignment7();
		System.out.println("Enter 6 integers: ");
		float x1=np.nextFloat();
		float x2=np.nextFloat();
		float x3=np.nextFloat();
		float x4=np.nextFloat();
		float x5=np.nextFloat();
		float x6=np.nextFloat();
																		//using all methods from Assignment2 Class
		float subR = np2.sub(x1, x2);										//using methods of Parent Class
		float addR = np2.add(subR, x3);							//but using the object of this child class
		float subR1= np2.sub(addR, x4);
		float divR = np2.div(subR1, x5);
		float mulR = np2.mul(divR, x6);
		System.out.println("\nTotal: "+mulR);
	}
}
