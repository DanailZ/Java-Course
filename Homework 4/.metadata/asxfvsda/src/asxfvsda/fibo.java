package asxfvsda;

public class fibo{

	public static void main(String[] args) {
		
		int count = 144;

		int fibonacci = fibonacci(count);
	    System.out.printf("Fibonacci from: " + count + " is " + fibonacci);

	}
	
	public static int fibonacci(int number) {
	    if (number == 0 || number == 1) {
	      return number;
	    } else {
	      return fibonacci(number - 1) + fibonacci(number - 2);
	    }
	  }

}
