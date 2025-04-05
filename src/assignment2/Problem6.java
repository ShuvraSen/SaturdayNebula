package assignment2;

public class Problem6 {
	  public static boolean isPrime(int number) {
	        if (number < 2) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(number); i++) {
	            if (number % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }

	public static void main(String[] args) {
		// Write a java program to find the prime number from 1 to 100 and print them.
		 for (int num = 1; num <= 100; num++) {
	            if (isPrime(num)) {
	                System.out.print(num + " ");
	            }
	        }
	}

}
