package assignments1;



public class Assignment1 {
	int firstArm=5;
	int secondArm=7;
	int thirdArm=11;
	public static int perameterOfTriangle(int firstArm,int secondArm,int thirdArm){
		int perameter=firstArm+secondArm+thirdArm;
		System.out.println(perameter);
		return  perameter ;
	}

	public static void main(String[] args) {
		// A triangle three arms are: 5, 7 and 11 inches.
		//Write a method to display the perimeter of triangle in console output.
perameterOfTriangle(5, 7, 11);		
		
		

	}

}
