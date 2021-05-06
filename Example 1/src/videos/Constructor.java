package videos;

public class Constructor 
{
	public Constructor()										/*Constructor 1*/
	{
		//this(45,23);										//this keyword calls const. 3 within this one
		System.out.println("I am a default constructor");	
	}
	public Constructor(int a) 								/*Constructor 2*/
	{
		this();											//this keyword calls const.3 within this one
		System.out.println("I am one parameterized constructor");
	}
	public Constructor(int a, int b)							/*Constructor 3*/
	{
		this(5);
		System.out.println("I am a two parameterized constructor");
	}
	public static void main(String[] args) 
	{
		Constructor x = new Constructor();							//object itself calls directly the constructor
		Constructor y = new Constructor(2);							//without calling
		Constructor z = new Constructor(3,5);
	}
}
