package pkg1;

import pkg2.TreeConst;

public class MangoTree extends TreeConst
{
	public MangoTree() 
	{
		super(3,4);
		System.out.println("\nI am Child default Constructor");
	}
	public MangoTree(int a) 
	{
		this(3, 4, 5);
		System.out.println("I am Child one parameterized Constructor");
	}
	public MangoTree(int a, int b) 
	{
		this(45);
		System.out.println("I am Child two parameterized Constructor");
	}
	public MangoTree(int a, int b, int c) 
	{
		this();
		System.out.println("I am Child three parameterized Constructor");
	}
	public MangoTree(int a, int b, int c, int d) 
	{
		this(2, 3);
		System.out.println("I am Child four parameterized Constructor");
	}
	
	public static void main(String[] args) 
	{
		MangoTree np = new MangoTree(22, 45, 12, 3);
	}
}
