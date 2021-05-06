package assignments;

import java.util.Scanner;

public class Table 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a value to print its table up to 20");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		
		int i=1;
				while (i<=20)
				{
					int sum= a*i;
					System.out.println(""+a+"*"+""+i+"="+""+sum);
					i++;
				}
		/*for(int i=1; i<=20; i++)
		{
			int sum= a*i;
			System.out.println(""+a+"*"+""+i+"="+""+sum);
		}*/
	}
}
