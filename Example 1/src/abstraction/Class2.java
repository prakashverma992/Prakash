package abstraction;

public class Class2 extends Class1
{
	public void first()				//the child class giving body to abstract method of Abstract class1
	{
		System.out.println("I am child class2");
		System.out.println("body given to abstract method of class1");
	}
	public static void main(String[] args) 
	{
		Class2 np = new Class2();
		
		np.first();					/*we re able to call Abstract class method from child class object 
													but we cannot create object of Abstract class and Interface*/
		np.second();			//Concrete method of Abstract class1 using object of class2 (Inheritance)
	}
}
