package videos;

public class ConstVsMethod 
{
	int a, b, c, d, e;
	public ConstVsMethod(int p, int q, int x, int y, int z)
	{
		a=p;
		b=q;
		c=x;
		d=y;
		e=z;
		//System.out.println(" "+a+" "+b+" "+c+" "+d+" "+e);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
	public static void main(String[] args) 
	{
		ConstVsMethod np = new ConstVsMethod(1,2, 3, 4, 5);
	}
}
