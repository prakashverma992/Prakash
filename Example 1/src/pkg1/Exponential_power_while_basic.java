package pkg1;

public class Exponential_power_while_basic 
{
		public static void main(String[] args) 
		{
			int base = 2, exponent = 3;
	        long result = 1;

	        while (exponent > 0)
	        {
	            result *= base;
	            --exponent;
	        }
	        
	        System.out.println("Answer = " + result);
		}
}
