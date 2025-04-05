package assignment4;

public class LeapYear {
	public static void checkLeapYear(int year){
		if((year%4==0 && year%100!=0) || year%400==0){
			// a year being divisible by 400 already means it is divisible by 4, 
	//so checking both((year%4==0 && year%100!=0) && year%400==0)) is unnecessary.
			System.out.println("the year is leapYear - " +year );
		}else{
			System.out.println(year+ " is not a leapYear");
		}
	}

	public static void main(String[] args) {
	//	Write a method to check leap year?
		checkLeapYear(2000);
	}

}
