package assignments;

public class Assignment4 								//Use of this keyword in Constructor
{
	public Assignment4()															//Constructor 0
	{
		this(1);
		System.out.println("I am a dafault constructor");
	}
	public Assignment4(int a) 													//Constructor 1
	{
		this(6,7,8,9);
		System.out.println("I am one parameterized constructor");
	}
	public Assignment4(int a, int b)											//Constructor 2
	{
		this(2,3,4);
		System.out.println("I am a two parameterized constructor");
	}
	public Assignment4(int a, int b, int c)									//Constructor 3
	{
		this();
		System.out.println("I am a three parameterized constructor");
	}
	public Assignment4(int a, int b, int c, int d)						//Constructor 4
	{
		System.out.println("I am a four parameterized constructor");
	}
	public static void main(String[] args) 
	{
		Assignment4 np= new Assignment4(2,3);
	}
}
