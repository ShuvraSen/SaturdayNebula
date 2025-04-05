package assignment2;

public class Problem3 {
	 public static int getFirstNumber() {
	        return 25;  // You can change this value
	    }

	    // Function to return second number
	    public static int getSecondNumber() {
	        return 40;  // You can change this value
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int num1 = getFirstNumber();  // Call function to get first number
	        int num2 = getSecondNumber(); 
		 if (num1 > num2) {
	            System.out.println(num1 + " is greater than " + num2);
	        } else if (num1 < num2) {
	            System.out.println(num2 + " is greater than " + num1);
	        } else {
	            System.out.println("Both numbers are equal.");
	        }

	}

}
