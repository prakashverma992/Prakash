package pkg1;

import pkg2.TreeMethod;

public class BanyanFruit  extends TreeMethod
{
	public void third()
	{
		System.out.println("I am Child method, 3rd Generation");
	}
	public static void main(String[] args) 
	{
		BanyanFruit np = new BanyanFruit();
		np.third();
		np.m2(2, 3);									//calling method m2 from Parent Class
	}
}
