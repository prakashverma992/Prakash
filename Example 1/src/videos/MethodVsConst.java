package videos;

public class MethodVsConst 
{
	int a, b, c, d, e;
	public void This_Const(int p, int q, int x, int y, int z)
	{
		a=p;
		b=q;
		c=x;
		d=y;
		e=z;
		System.out.println(" "+a+" "+b+" "+c+" "+d+" "+e);
	}
	public static void main(String[] args) 
	{
		MethodVsConst np = new MethodVsConst();
		np.This_Const(1, 2, 5, 4, 8);
	}
}
