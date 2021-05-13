package abstraction;

public class Class4 implements Interface3
{
	public void parent()
	{
		System.out.println("I am Parent of Interface 2");
	}
	public void father()
	{
		System.out.println("I am Father of Interface 3 inherited from Interface 2: Parent");
	}
	public void child()
	{
		System.out.println("I am child of Class 4 inherited from Interface 3: Father");
	}
	
	public static void main(String[] args) 
	{
		Class4 np = new Class4();
		np.parent();
		np.father();
		np.child();
	}
}
