package videos;

public class ClassA 
{
	public ClassA() 
	{
		System.out.println("I am Parent default Constructor");
	}
	public ClassA(int a) 
	{
		System.out.println("I am Parent one parameterized Constructor");
	}
	public ClassA(int a, int b) 
	{
		System.out.println("I am Parent two parameterized Constructor");
	}
	public ClassA(int a, int b, int c) 
	{
		System.out.println("I am Parent three parameterized Constructor");
	}
	public ClassA(int a, int b, int c, int d) 
	{
		System.out.println("I am Parent four parameterized Constructor");
	}
	
	public static void main(String[] args) 
	{
		ClassA n = new ClassA(1,2);	
	}
}
