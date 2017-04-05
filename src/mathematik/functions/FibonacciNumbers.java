package mathematik.functions;

public class FibonacciNumbers {

	 public static int fibonacci(int number) {
		    if ((number == 0) || (number == 1)){ // base cases
		      return number;
		    
		    }else
		      // recursion step
		      return fibonacci(number - 1) + fibonacci(number - 2);
		  }

	public static void main (String [] args){
		
		for (int i = 0; i < 10; i++) {
		System.out.println("La serie di FibonacciNumbers per il num "+i+" è "+fibonacci(i));	
		}
		for (int counter = 0; counter <= 10; counter++)
		      System.out.printf("Fibonacci of %d is: %d\n", counter, fibonacci(counter));
		  }
	}
	

