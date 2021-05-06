package pkg2;

public class TreeConst 
{
	public TreeConst() 
	{
		this(3, 4, 5);
		System.out.println("I am Parent default Constructor");
	}
	public TreeConst(int a) 
	{
		this();
		System.out.println("I am Parent one parameterized Constructor");
	}
	public TreeConst(int a, int b) 
	{
		this(4, 5, 6, 7);
		System.out.println("I am Parent two parameterized Constructor");
	}
	public TreeConst(int a, int b, int c) 
	{
		System.out.println("I am Parent three parameterized Constructor");
	}
	public TreeConst(int a, int b, int c, int d) 
	{
		this(1);
		System.out.println("I am Parent four parameterized Constructor");
	}
	
	public static void main(String[] args) 
	{
		TreeConst n = new TreeConst(1,2);	
	}
}
