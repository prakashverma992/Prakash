package videos;
																					//Inheritance Class A,B & C
public class ClassB extends ClassA
{
	public ClassB() 
	{
		System.out.println("I am Child default Constructor");
	}
	public ClassB(int a) 
	{
		System.out.println("I am Child one parameterized Constructor");
	}
	public ClassB(int a, int b) 
	{
		System.out.println("I am Child two parameterized Constructor");
	}
	public ClassB(int a, int b, int c) 
	{
		System.out.println("I am Child three parameterized Constructor");
	}
	public ClassB(int a, int b, int c, int d) 
	{
		System.out.println("I am Child four parameterized Constructor");
	}
	
	public static void main(String[] args) 
	{
		ClassB np = new ClassB();
	}
}
