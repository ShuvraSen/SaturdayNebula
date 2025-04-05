package accessModifierDemo;

import java.util.ArrayList;
import java.util.HashSet;

public class Array_Hashmap_Hashset_HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ageNebula=new int[]{};
		//int[] ageNebula=new ageNebula[]{};
/*
* is invalid because ageNebula is a variable name, not a data type.
In Java, when you create an array, you must specify 
the data type, not the variable name.
Correct way:   int[] ageNebula=new int[]{};
ArrayList<Integer> n= new ArrayList<>();
		 */
		int[] a={};
		
		String[] nameNebula=new String[]{"Shuvra", "Sabiha", "Fahmida", "Sharmin","Sana"};
		System.out.println(nameNebula.length);
		for(int i=0;i<nameNebula.length;i++){
			System.out.println(nameNebula[i]+ "   nameArray");
		}
		
		
//		multi-dimentional array
		int[][] age2D={{45,2,56},{3,5,85}};
		//int in=age2D[0][2];
		//age2D[0][2];---without assignment giving error
		System.out.println(age2D[0][2]);
		for(int i=0;i<age2D.length;i++){
			for(int j=0;j<age2D[i].length;j++){
				System.out.print(age2D[i][j]+ "   ");
			}
			System.out.println();
		}
		
HashSet<String> car=new HashSet<>();
car.add("toyota");
car.add("Tesla");
car.add("Marcidis");
car.add("Marcidis");
System.out.println(car);

//store unique value

	}

}
