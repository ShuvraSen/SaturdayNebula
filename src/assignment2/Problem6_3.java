package assignment2;

public class Problem6_3 {
	public static void  primeN(){
		for(int i=1;i<=100;i++){
			
			 
			if(i==3||i==5||i==7)
				{System.out.println(i+" prime numb");}
			
	
			else if(i%2==0||i%3==0||i%5==0||i%7==0) {
		   System.out.println(i+" not a prime numb");}
		   else
			   
		   { System.out.println(i+" prime numb");
		   }}
		   }
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  primeN();

	}

}
