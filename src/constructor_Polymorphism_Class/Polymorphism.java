package constructor_Polymorphism_Class;

public class Polymorphism {
	public static void car(){
		System.out.println("I have a car");
	}
	public static void car(String name){
		System.out.println("My car is "+ name);
	}
	public static void car(int price){
		System.out.println("My car price is " +price);
	}
	public static void car(String color,int door){
		System.out.println("My car color is " +color +"  it has "+door +" door");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car();
		car("Honda");
		car(40000);
		car("Blue", 4);
	}

}
/* It is the ability to take an object in many forms.
- Method Overloading (Compile time Polymorphism/Static binding) Same method name with different signature to overload
- Method Overriding (Runtime Polymorphism/Dynamic binding) : We can not change the 
method name and  signature from Parent class to override.Onnly we can change 
the implementation.
 Actually overriding can be possible through inheritance.
  because in a single class we can not do overriding.
   In Java, polymorphism is primarily achieved through method overriding (runtime polymorphism) 
   and method overloading (compile-time polymorphism). 
*/