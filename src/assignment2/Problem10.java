package assignment2;

public class Problem10 {
	public static void convertCelsius(double ferhenheit){
	
		double celsius=( (ferhenheit-32)*5)/9;
		System.out.println(String.format("%.2f",celsius ));
		 
	}

	public static void main(String[] args) {
		// Write a Java program to convert temperature from 
		//Fahrenheit to Celsius degree. 
		convertCelsius(55);
	}

}
