package exceptionHandling;

public class TryCatchDemo {
	/* Java Exceptions - Use "try - catch - finally"
	 * 
	 Exception is unusual behavior of code's execution/program.
		A. Built-in Exceptions - Built-in exception throws by java which explain certain error situations
			 1. ArithmeticException - error has occurred in an arithmetic operation.
			 2. ArrayIndexOutOfBoundsException -  an array has been accessed with an illegal index.
			 3. ClassNotFoundException - try to access a class whose definition is not found
			 4. FileNotFoundException - a file is not accessible or does not open.
			 5. IOException - input-output operation failed or interrupted
			 6. InterruptedException  - thread is waiting, sleeping, or doing some processing, and it is interrupted.
			 7. NoSuchFieldException - class does not contain the field or variable specified
			 8. NoSuchMethodException - accessing a method which is not found
			 9. NullPointerException - referring to the members of a null object
			 10. NumberFormatException  -  a method could not convert a string into a numeric format
			 11. RuntimeException - any exception which occurs during runtime.
			 12. StringIndexOutOfBoundsException -  String class methods to indicate that an index is either negative or greater than the size of the string
		
		B. User-Defined Exceptions - User can also create exception where the error situations is not covered by java
	*/
	public static void main(String[] args){
		try{
		int[] age= new int[]{24,30,55,60,45,40};
		System.out.println(age[9]);
		}catch(ArithmeticException e){
			System.out.println("got error--arithmatic");
		}catch(Exception e){
			System.out.println("got error--by exception");
		}catch(ArrayIndexOutOfBoundsException e){
//Since the parent exception is already handled, the more specific exceptions will not be triggered	
		}
		finally{
			System.out.println("test completed");
		}
		/*
		 *if we don't handle the exception the project will close if any
		 unusual behavior happen. And we don't know in which line or time it got stopped. that's why
		 we handle exception.
	The try block contains code that might throw errors or exceptions during execution. 
	The catch block handles these exceptions and 
	provides meaningful messages to help you take the right steps to resolve the issue.
	 The finally block executes regardless of whether an exception occurs or not.
		 */
	}
	
}
