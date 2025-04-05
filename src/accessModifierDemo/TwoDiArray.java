package accessModifierDemo;

public class TwoDiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] nameArray = {
			    {"Shuvra", "Sagor", "Sen"},
			    {"Shahana", "Afroj", "Tania"}
			    
			};
		
		System.out.println(nameArray[0][2]+ "----1st index name");
		System.out.println(nameArray[1][2]+"----2nd index ");
		 for (int i = 0; i < nameArray.length; i++) {
	            for (int j = 0; j < nameArray[i].length; j++) {
	                System.out.print(nameArray[i][j] + " ");
	            }
	            System.out.println();  
	}}

}
