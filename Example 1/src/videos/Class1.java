package videos;

public class Class1 
{
	//(22+2)*(12-2)
			int sum(int a, int b)
			{
				int c=a+b;
				System.out.println("Addition: "+c);
				return c;
			}
			int sub(int a, int b)
			{
				int c= a-b;
				System.out.println("Subtraction: "+c);
				return c;
			}
			void mul(int a, int b)
			{
				int c=a*b;
				System.out.println("Total: "+c);
			}
			
			public static void main(String[] args) 
			{
				System.out.println("Solve the expression: \n\t(22+2)*(12-2)\n");
				Class1 np = new Class1();
				int sumR =np.sum(22, 2);
				int subR = np.sub(12, 2);
				np.mul(sumR, subR);
			}
}
