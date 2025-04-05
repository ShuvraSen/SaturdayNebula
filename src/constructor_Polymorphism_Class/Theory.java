package constructor_Polymorphism_Class;

public class Theory {
	/* It is the ability of object that can change in different forms.s.
	- Method Overloading (Compile time Polymorphism/Static binding) Same method name with different signature to overload
	- Method Overriding (Runtime Polymorphism/Dynamic binding) : We can not change the 
	method name and  signature from Parent class to override.Onnly we can change 
	the implementation.
	 Actually overriding can be possible through inheritance.
	  because in a single class we can not do overriding.
	*/
	
	/*
	 The method overriding is also called runtime polymorphism.
	 Because ,the execution depends on runtime that's why we call it runtime polymorphism 
	 and dynamic bindings. 
	 
	 How Execution Depends on Runtime (Method Overriding Behavior)
1. If an object is created using the Parent class reference and
 Parent class object  Parent's method is called.---- Parent p=new Parent();
2. If an object is created using the Child class reference and 
Child class object  Child's method is called.  ------Child c=new Child();
3. If an object is created using the Child class  but object reference 
is indicates the parent class, child class method is called.
----Parent p=new Child();
	 * */

}
