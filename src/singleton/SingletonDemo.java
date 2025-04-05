package singleton;

public class SingletonDemo {
//singleton is a class that have only one object.
	//private constructor, it prevent any other class from intantiating
	private SingletonDemo(){
		
	}
	//private static objcet of the class
	
	private static SingletonDemo singletonDemoobj=new SingletonDemo();	
	
	public static SingletonDemo getntance(){
		return singletonDemoobj;
	}
	protected static void demo(){
		System.out.println("demo method from singleton");
	}
	
}
