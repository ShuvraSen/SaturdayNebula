package assignment4;

public class DuplicateValueCount {
	public static  int countDuplicate(int[] array){
		int duplicateValueCount=0;
		for(int i=0;i<array.length;i++){
			boolean isdup=false;  // Every iteration starts with false
			//No matter whether a duplicate exists or not, the outer loop 
			//always starts with isDuplicate = false, allowing the inner loop to perform the check.
			for(int j=0;j<i;j++){
				if(array[i]==array[j]){
					isdup=true;
					break;
					
				}
			}
			if(isdup){
				 duplicateValueCount++;
			}
		}
		return  duplicateValueCount;
		
	}
	

	public static void main(String[] args) {
		// Write a method which return count of duplicate value from a array?
		int[] array = {1, 2, 3, 4, 5, 2, 3, 3, 6, 7, 8, 8};
        System.out.println("Count of duplicate values: " + countDuplicate(array));
	}

}
