package abstraction;

public abstract class Class1 			//Abstract class
{
	public abstract void first();			//without body (Abstract method)
	
	public void second()					//with body (Concrete method)
	{
		System.out.println("\nI am Abstract class with abstract method");
		System.out.println("\nThis is concrete method of method2");
	}
			//we cannot create objects of Abstract class and Interface 
}
