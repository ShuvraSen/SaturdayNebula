package assignment2;

public class Problem1 {
	 public static void calculateGrade(int marks) {
	        if (marks >= 90) {
	            System.out.println("Grade A");
	        } else if (marks >= 80) { // Covers 80-89
	            System.out.println("Grade B");
	        } else if (marks >= 70) { // Covers 70-79
	            System.out.println("Grade C");
	        } else if (marks >= 60) { // Covers 60-69
	            System.out.println("Grade D");
	        } else { // Below 60 is fail
	            System.out.println("FAIL");
	        }}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int marks = 85; // Example marks
		        calculateGrade(marks);
		    }

	

}
