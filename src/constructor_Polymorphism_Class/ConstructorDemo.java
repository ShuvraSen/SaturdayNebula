package constructor_Polymorphism_Class;

public class ConstructorDemo {
	int amount;
	String acc;
	
	public ConstructorDemo(){
		/*default constructor. it need not to call directly call.
If no constructor is defined, Java automatically provides a default constructor 
(without parameters).
This allows objects to be instantiated even if no specific values are passed.		 
		 */
	}
	public ConstructorDemo(String name){
		System.out.println(name);
		//parameterized constructor
		
	}
	
	
public ConstructorDemo(String accName,int amontAcc){
	amount=amontAcc;
	//acc=accName;
	System.out.println(accName+amontAcc);
}
//public ConstructorDemo(String accName,int amontAcc);	//without body error show

	
	public static void main(String[] args) {
		ConstructorDemo ConstructorDemoobj=new ConstructorDemo("savings",200);
		ConstructorDemo ConstructorDemoobjS=new ConstructorDemo("shuvra");

	}

}
/*
1. constructor name should be same as the class name. It is special type method.
2. but constructor has no return type even can not be void and static.
3.constructor only use to assign the variable, can not be contain any logics.
constructor can be overloaded but not be overridden as the name of the constructor 
same as class name. 
4. Types of constructors--
i. default and parameterized
ii. parameterized constructor
Constructor is used to initialize the object.

		 */