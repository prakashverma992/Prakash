package assignments;

public class Assignment3 
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
	
	public static void main(String[] args) 						//main method
	{
		System.out.println("Solve the expression: \n\t(((((10-2)+2)-2)*2)/2)\n");
		Assignment3 np = new Assignment3(); 				//object creation
		float subR = np.sub(10, 2);									//calling method1
		float addR = np.add(subR, 2);
		float subR1 = np.sub(addR, 2);								//calling method2
		float mulR = np.mul(subR1, 2);
		float divR = np.div(mulR, 2);
		System.out.println("\nTotal: "+divR);
	}
}
