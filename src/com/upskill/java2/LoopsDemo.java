package com.upskill.java2;

public class LoopsDemo {

	public static void main(String[] args) {
		/*
		 * types of loop
		 * 1. forloop
		 * 2.whileloop
		 * 3.do-whileloop
		 * infinite loop
		 */
		practiceForLoop();
		System.out.println();
		practiceWhile();
		System.out.println();
		practiceDoWhile();
		System.out.println("===");
		practiceNestedForLoop();

	}
	public static void practiceForLoop(){
		for(int i=0;i<=10;i++){
			System.out.println(i+"  --this is forLOOP");
/*forLoop -that have a lower and upper limit .
 *  and the looping  will continue upto the upper limit
			 * 
			 */
		}
	}//for
	
	public static void practiceWhile(){
		int i=0;
		while(i<=10){
			System.out.println(i+ "---whileLOOP");
			i++;
		}
		/*
		 * in while loop the loop will
		 *  continue until  condition is not match
		 */
	}//while
	
	public static void practiceDoWhile(){
		int i=0;
		do{
			System.out.println(i+ "---DowhileLOOP");
			i++;
		}while(i<=10);
		/*In do while loop it will 
		 * execute the action first  before checking the condition
		 
		 */
	}//do-while
	
	public static void practiceNestedForLoop(){
		int i;
		int j;
		for( i=0;i<=10;i++){
			for( j=0;j<=10;j++){
				int multifly=i*j;
				System.out.print( i + j+ multifly + " ");
				
			}
			System.out.println("  ");
			
		}
	}
	
}
