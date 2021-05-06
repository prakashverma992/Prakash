package pkg2;

public class TreeMethod 
{
	public void m0() 
	{
		System.out.println("I am Parent default Method");
	}
	public void m1(int a) 
	{
		System.out.println("I am Parent one parameterized Method");
	}
	public void m2(int a, int b) 
	{
		System.out.println("I am Parent two parameterized Method");
	}
	public void m3(int a, int b, int c) 
	{
		this.m0();
		this.m4(4, 5, 6, 7);
		this.m1(1);
		this.m2(3, 4);
		System.out.println("I am Parent three parameterized Method");
	}
	public void m4(int a, int b, int c, int d) 
	{
		System.out.println("I am Parent four parameterized Method");
	}
	
	public static void main(String[] args) 
	{
		TreeMethod np = new TreeMethod();
		np.m3(2,3,4);
	}
}
