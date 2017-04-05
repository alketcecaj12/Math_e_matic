package mathematik.functions;

public class PowerRecursive {

	
	static double power(double x, int n) {
	   if(n ==0)
		   return 1;
		if (n > 1)
	      return x * power(x, n - 1); // Recursive call
	    else if (n < 0)
	      return 1.0 / power(x, -n); // Negative power of x
	    
	    else  return x;
	    
	  }
	
	
	public static void main (String[]args){
		
		System.out.println(power(3, -2));
		System.out.println(power(3, 1));
		
	}
}
