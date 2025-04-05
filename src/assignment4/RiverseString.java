package assignment4;

public class RiverseString {
//	static String str="Upskill";
//	static String rev="";
	public static void riverseString(String str){
		String rev="";
		for(int i=str.length()-1; i>=0;i--){
			rev= rev + str.charAt(i);
			
		}
		System.out.println(rev);
	}
	


	public static void main(String[] args) {
		// Write a method which will reverse a string ?
		riverseString("Upskill");

	}

}
