
public class Variables {

	public static void main(String[] args) {
		Variables objVariable=new Variables();
		System.out.println(objVariable.firstLady);
	
	 mo("Josh Hawley");
	//tx();
	
	}//main
	
	public static String country="USA";
	public static String region="North America";
	public static String president="Trump";
	public  String firstLady="Melania Trump";
	
	public static void mo(String senetor){//perameterized variable
		Variables obj=new Variables();
		String city="Nevada";
		String county="vernom";
		System.out.println(city);
		System.out.println(county);
		System.out.println(country);
		System.out.println(region);
		System.out.println(president);
		System.out.println(obj.firstLady);
		System.out.println(senetor+"senetor");
	
	}
//	public static void tx(){
//		String city="Arlington";
//		String county="xxx";
//		System.out.println(city);
//		System.out.println(county);
//		System.out.println(country);
//		System.out.println(region);
//	}

	/*In java there are 4 types of variables
	 * 1. Instance variables--variables declared in class level,
	 *    outside any method
	 * 2. Local variable - variables declared in methods 
	 * 3. Static variable - variables belong to class and don't required creating object.and before the variable
	 * we put the static keyword
	 * 4. Method parameter - variables used as method parameter
	 
			 */
			/*
			 * a global variable in Java (or other languages) can be static or 
			 *  non-static, depending on how it is defined within a class.
			 */

}//class
