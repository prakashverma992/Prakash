package videos;

public class Class6_static_keyword 
{
	static int x;							//default value of global variable is 0
	public void increment()
	{
		x += 1;
		System.out.println(x);
	}
	public static void main(String[] args) 
	{
		System.out.println("**********First Object************");
		Class6_static_keyword a = new Class6_static_keyword();
		a.increment();									//every object has different memory
		
		System.out.println("**********Second Object***********");
		Class6_static_keyword b = new Class6_static_keyword();
		b.increment();
		
		System.out.println("**********Third Object************");
		Class6_static_keyword c = new Class6_static_keyword();
		c.increment();
	}
}
