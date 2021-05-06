package assignments;

public class Assignment5 										//Use of this keyword in Method
{
	public void method0()															//Method 0
	{
		System.out.println("I am a dafault Method");
	}
	public void method1(int a) 													//Method 1
	{
		System.out.println("I am one parameterized Method");
	}
	public void method2(int a, int b)											//Method 2
	{
		this.method3(3,4,5);
		this.method0();
		this.method1(1);
		this.method4(4, 5, 6, 7);
		System.out.println("I am a two parameterized Method");
	}
	public void method3(int a, int b, int c)									//Method 3
	{
		System.out.println("I am a three parameterized Method");
	}
	public void method4(int a, int b, int c, int d)						//Method 4
	{
		System.out.println("I am a four parameterized Method");
	}
	public static void main(String[] args) 
	{
		Assignment5 np= new Assignment5();
		np.method2(2,3);
	}
}