package assignment4;

import java.util.Arrays;

public class CharATvsToCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello";
		char c = str.charAt(2);//it gives index-value
		//need to pass by index number then get the index value
		System.out.println(c);
		
		String str1 = "hello";
		char[] chars = str1.toCharArray();
		System.out.println(chars);
		System.out.println(str1.toCharArray());//return string
		System.out.println(Arrays.toString(chars));//return array with character
		//System.out.println(Arrays.toString(str1));

	}

}
