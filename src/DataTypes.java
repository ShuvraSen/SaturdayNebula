import java.util.Scanner;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		int b=7;
		int c=a+b;
		//System.out.println(c);
		int pre=10;
		//System.out.println(++pre);
		int post=10;
		//System.out.println(post++);
		Scanner sc=new Scanner(System.in);
		String n=sc.next();
		System.out.println(n);
	
		

	}

}
/*Explaining the "System.out.println()"
 * 1. System is java predefined class.
 * 2. out is static variable of System class and also instance of PrintStream class
 * like--- System out=new PrintStream()
 * but exact is ---PrintStream out = new PrintStream(System.out);
 * 
The println() method belongs to the PrintStream class.
 * 
 */
