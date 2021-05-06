package videos;

public class This3 
{
	int deepak;
	public void method1(int deepak)
	{
		this.deepak = deepak;
	}
	public static void main(String[] args) 
	{
		This3 s = new This3();
		s.method1(344);
		System.out.println(s.deepak);
	}
}
