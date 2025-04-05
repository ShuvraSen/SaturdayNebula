
package multithreading;

public class Multithreading {
	
	/* Multithreading is a Java feature that allows concurrent execution 
	 * of two or more parts of a program.
	 * Multithreading in Java allows a program to run multiple tasks at the same time.
	
	Threads can be created by using two mechanisms : 

		1. Extending the Thread class 
		2. Implementing the Runnable Interface */


	public static void main(String[] args) {
		
		int n = 4;
		for (int i = 0; i < n; i++){
			MultithreadigThread obj = new MultithreadigThread();
			obj.start();
//this start() internally call the run method from the tread and runableInterface.
			
			Thread obj2 = new Thread(new MultithreadingRunable());
			obj2.start();
			//in runable interface there is no start() 
			//method of its own that's why we create thread object and as a perameter we pass runableinterface.
			
		}
	}
}
/*
Multithreading is a Java feature that allows concurrent execution of 
two or more parts of a program.
	
	Threads can be created by using two mechanisms : 

		1. Extending the Thread class 
		2. Implementing the Runnable Interface
*/