package assignments;

import java.util.Scanner;

public class Assignment6_1 
{
	public float add(float a, float b)										//method 1 using local variables
	{
		float c=a+b;
		System.out.println("Addition: "+c);
		return c;
	}
	
	public float sub(float a, float b)										//method 2
	{
		float c=a-b;
		System.out.println("Subtraction: "+c);
		return c;
	}
	
	public float mul(float a, float b)								//method 3
	{
		float c=a*b;
		System.out.println("Multiplication: "+c);
		return c;
	}
	
	public float div(float a, float b)									//method 4
	{
		float c=a/b;
		System.out.println("Division:" +c);
		return c;
	}
	public static void main(String[] args) 
	{
		System.out.println("Solve the expression 1: \n\t(((((x1*x2)+x3)+x4)-x5)/x6)");
		Scanner np = new Scanner(System.in);
		Assignment6_1 np1 = new Assignment6_1();
		System.out.println("Enter 6 integers: ");
		float x1=np.nextFloat();
		float x2=np.nextFloat();
		float x3=np.nextFloat();
		float x4=np.nextFloat();
		float x5=np.nextFloat();
		float x6=np.nextFloat();
		
		float mulR = np1.mul(x1, x2);
		float addR = np1.add(mulR, x3);
		float addR1= np1.add(addR, x4);
		float subR = np1.sub(addR1, x5);
		float divR = np1.div(subR, x6);
		System.out.println("\nTotal: "+divR);
	}
}
