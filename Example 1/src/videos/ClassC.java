package videos;

public class ClassC extends ClassB
{
	public ClassC() 
	{
		System.out.println("I am GrandChild default Constructor");
	}
	public ClassC(int a) 
	{
		super(1, 2);
		System.out.println("I am GrandChild one parameterized Constructor");
	}
	public ClassC(int a, int b) 
	{
		System.out.println("I am GrandChild two parameterized Constructor");
	}
	
	public static void main(String[] args) 
	{
		ClassC np = new ClassC(12);
	}
}
