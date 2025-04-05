
public class MethodTypeDemo {

	public static void main(String[] args) {
		MethodTypeDemo obj= new MethodTypeDemo();
		// TODO Auto-generated method stub
		/*
		 * 3 types of methods
		 * a.Void type
		 * b. Static Method
		 * c.Return type Method
		 * 
		 * The return type of a method determines what type of value the method will return. 
		 * If a method has a void return type, it does not return any value.
		 * 
		 */
		obj.annualIncomeVoid();
		weeklyIncomecome();
		isProfitable();
		employeeNmae();
	}
	public static int hourlyIncome=55;
	public void   annualIncomeVoid() {
		int calculateIncome= hourlyIncome*2000;
		System.out.println("my annual income " + calculateIncome);

	}
	public static void   weeklyIncomecome() {
		int calculateIncome= hourlyIncome*40;
		System.out.println("my weekly income " + calculateIncome);
		
	}
	public static String   employeeNmae() {
		String nameFirstEmployee= "shuvra";
		System.out.println("nameFirstEmployee " + nameFirstEmployee);
		return nameFirstEmployee;
		
		
	}
	public static boolean   isProfitable() {
		boolean isProfitable= true;
		System.out.println("isProfitable " + isProfitable);
		return isProfitable;
		
		
	}

}
