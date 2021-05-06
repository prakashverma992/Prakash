 package videos;

 //String[] args====command line arguments
 //array of String
 //how we will give the arguments(inputs) to our code
 
public class Command_line_argument 
{
	public static void main(String[] prakash) 			//prakash instead of args
	{
		System.out.println("Total arguments : "+prakash.length);
		for(int i=0; i<prakash.length; i++)
		{
			System.out.println(prakash[i]);
		}
	}
}
