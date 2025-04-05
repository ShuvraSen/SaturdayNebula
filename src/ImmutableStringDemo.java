
public class ImmutableStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abcd";//string literal
String upp=str.toUpperCase();
		System.out.println(str+ "addstr");
		//System.out.println(upp+"after uppercase");
		

String str1=new String();//create a string object 
		str1="uu";
		str1.toUpperCase();
	System.out.println(str1+ "obj");

	}
// both way u can not mutable the string. it is immutable
}
