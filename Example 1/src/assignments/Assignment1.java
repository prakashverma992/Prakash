package assignments;

public class Assignment1 
{
	int x, y;																//declaration of global variable
	public void display1()										//method 1
	{
		System.out.println("Welcome");					//method 1 body
	}
	public void display2() 										//method 2
	{
		System.out.println("to the class");				//method 2 body
	}
	
	public static void main(String[] args) 				//main method
	{
		Assignment1 np = new Assignment1();						//object (np) creation
		np.display1(); 												//calls method 1 via "." keyword
		np.display2();
		np.x=19;														//calls variable x and assign value to it
		np.y=24;
		System.out.println(np.x);								//prints variable x
		System.out.println(np.y);
	}
}
