package pkg1;

import pkg2.TreeMethod;

public class BanyanTree extends TreeMethod
{
	public void me0() 
	{
		System.out.println("\nI am Child default Method");
	}
	public void me1(int a) 
	{
		System.out.println("I am Child one parameterized Method");
	}
	public void me2(int a, int b)
	{
		super.m3(2,3,7);
		this.me0();
		this.me4(4, 5, 6, 7);
		this.me3(2,3,4);
		this.me1(1);
		System.out.println("I am Child two parameterized Method");
	}
	public void me3(int a, int b, int c) 
	{
		System.out.println("I am Child three parameterized Method");
	}
	public void me4(int a, int b, int c, int d) 
	{
		System.out.println("I am Child four parameterized Method");
	}
	
	public static void main(String[] args) 
	{
		BanyanTree np = new BanyanTree();
		np.me2(2,3);
	}
}
