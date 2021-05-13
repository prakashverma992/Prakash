package videos;

public class Class6_static_method 
{
	static int a;
	public static void method1()
	{
		System.out.println("I am Static method");
		System.out.println("abcd");
	}
	public static void main(String[] args) 
	{
		method1();											//calling static method1() without using classname
		
		Class6_static_method.a =19;				//value given to static variable a
		System.out.println(a);							//printing static variable
		
		Class6_static_method.method1();			//calling static method1() using classname
	}
}
