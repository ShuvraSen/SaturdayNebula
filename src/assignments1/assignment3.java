package assignments1;

public class assignment3 {
	public static int displayAddition(int value1, int value2,int multiplyValue){
		int   add=(value1+value2+multiplyValue);
		//System.out.println(add);
		return add;
	}
	public static int displaymultiply(int value1, int value2){
		int   multiply=(value1*value2);
		//System.out.println(multiply);
		return multiply;
	}

	public static void main(String[] args) {
		//  A function which returns the multiply value of a and b where a = 9 and b = 11. 
		//Write a program which will display addition of a +b + function returns value.
		
		
		System.out.println(displaymultiply(9,11));
		System.out.println(displayAddition(9,11,displaymultiply(9,11)));
		
		

	}

}
