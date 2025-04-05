package assignments1;

public class Assignment2 {

//	int width=9;
//	int length=13;
	public static int perimeterOfRectangle(int width,int length){
		int perimeter=2*(length+width);
		System.out.println(perimeter);
		return perimeter;
	}
	
	public static void main(String[] args) {
		// A rectangle width and length are: 9 and 13 inches.
		//Write a method to display the perimeter of rectangle in console output.
		perimeterOfRectangle(9,13);
	
	
	}

}
