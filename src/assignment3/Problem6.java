package assignment3;

public class Problem6 {

	public static void main(String[] args) {
		/*
		 * Write a java program which will count the number of vowels, 
		 *consonants, digits, tabs and blank spaces
		 *from a string “A quick brown fox jumps over the lazy dog”.
		 * 
		 */
		String sentence="A quick brown fox jumps over the lazy dog";
		int vowels=0;
		int consonants=0;
		int digits=0;
		int tabs=0;
		int blank_spaces=0;
		sentence=sentence.toUpperCase();
		for(int i=0;i<sentence.length();i++){
			char ch=sentence.charAt(i);
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
				vowels++;
				
			}else if(ch>='A'&& ch<='Z'){
				consonants++;
				
			}else if(ch >= '0' && ch <= '9'){
				digits++;
				
			}else if(ch==' '){
			blank_spaces ++;
			
			}else if (ch == '\t') {  // Properly checking for tabs
              tabs++;
               
            }else{
            	System.out.println(" no string is here");
            }
			
		}
		System.out.println(vowels+" total vowels");
		System.out.println(consonants + " Total consonants");
		System.out.println(digits+ " total digits");
		System.out.println(blank_spaces+ " total space");
		 System.out.println(tabs+ " total tabs");

	}

}
