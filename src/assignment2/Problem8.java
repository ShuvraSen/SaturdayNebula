package assignment2;

public class Problem8 {
	public static void findFactorial(int num){
		int fac=1;
		for(int i=1;i<=num;i++){
			fac*=i;
			
		}
		System.out.println(fac);
		
	}

	public static void main(String[] args) {
		// Write Java Program to display Factorial of Number 7.
		findFactorial(8);

	}

}
