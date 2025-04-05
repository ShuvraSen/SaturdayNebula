package assignment2;

public class Problem6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isPrime=false;
		for(int i=2;i<=100;i++){
				isPrime =true;//assume all i is a prime number
		
		 for (int j = 2; j <= Math.sqrt(i); j++) { // Check divisibility
             if (i % j == 0) {
                 isPrime = false; // If divisible, it's not prime
                 break;
             }
         }

         if (isPrime) {
             System.out.print(i + " "); // Print the prime number
         }

	}

}
}
