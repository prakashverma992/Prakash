package abstraction;

public class Class3 implements Interface1
{
	public void f1()						//body given to Abstract method f1() of Interface1
	{
		System.out.println("body done");
	}
	public void f2()						//body given to Abstract method f2() of Interface1
	{
		System.out.println("body given");
	}
	public static void main(String[] args) 
	{
		Class3 np = new Class3();
		np.f1();
		np.f2();
	}
}
