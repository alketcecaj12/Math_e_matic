package mathematik.functions;

public class FactorialRecursive {
	
	  public static int factorial( int n )
	  {
	    if ( n <= 0 )  // base case
	     return 1;
	    else    // general case
	     return ( n * factorial ( n - 1 ) );
	  }
	
	
	
		public static void main (String [] args){
			
		System.out.println(""+factorial(4));	
	
		}
		
		
	}

