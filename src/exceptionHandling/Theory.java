package exceptionHandling;

public class Theory {
	/*
	ArithmeticException
Description: Occurs when there is an error in an arithmetic operation (e.g., division by zero).

int result = 10 / 0;  // Throws ArithmeticException (division by zero)
==================
ArrayIndexOutOfBoundsException
Description: Happens when you try to access an array with an invalid index (either negative or
 beyond the array length).

int[] arr = {1, 2, 3};
int value = arr[5];  // Throws ArrayIndexOutOfBoundsException (index 5 is out of bounds)
================
ClassNotFoundException
Description: Occurs when Java can't find the class that is being referred to.


Class.forName("com.example.NonExistentClass");  // Throws ClassNotFoundException
=========================================
FileNotFoundException
Description: Thrown when a file is not accessible, either because it doesn't exist or can't be opened.

FileReader file = new FileReader("nonexistentFile.txt");  // Throws FileNotFoundException
=======================
IOException
Description: Thrown when an input/output operation fails or is interrupted.

BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
String line = reader.readLine();  // Throws IOException if there is an error reading the file
===============================
InterruptedException
Description: Occurs when a thread is waiting, sleeping, or processing, and
 another thread interrupts it.

Thread.sleep(1000);  // Throws InterruptedException if the thread is interrupted while sleeping
===========================================
NoSuchFieldException
Description: Happens when you try to access a field that doesn't exist in a class.

Class<?> cls = MyClass.class;
Field field = cls.getDeclaredField("nonExistentField");  // Throws NoSuchFieldException
===========================================
NoSuchMethodException
Description: Occurs when you try to access a method that does not exist.

Method method = MyClass.class.getMethod("nonExistentMethod");  // Throws NoSuchMethodException
==============================================
NullPointerException
Description: Happens when you try to access or call methods on an object that is null.

String str = null;
int length = str.length();  // Throws NullPointerException (str is null)
======================================
NumberFormatException
Description: Thrown when a method tries to convert a string into a number, but the string is not a valid number.

int num = Integer.parseInt("abc");  // Throws NumberFormatException (invalid number format)
=================================
RuntimeException
Description: A general exception that occurs during runtime. Other exceptions, like NullPointerException, inherit from this.

throw new RuntimeException("An unexpected error occurred");
=============================
StringIndexOutOfBoundsException
Description: Thrown when an invalid index is used with a string (either negative or beyond the string's length).

String str = "Hello";
char ch = str.charAt(10);  // Throws StringIndexOutOfBoundsException (index 10 is out of bound
	 */

}
