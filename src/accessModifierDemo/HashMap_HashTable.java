package accessModifierDemo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class HashMap_HashTable {

	public static void main(String[] args) {
		
		HashMap<String, Integer> Student=new HashMap<>(); 
		
		Student.put("Shuvra", 1);
		Student.put("Sana", 2);
		Student.put("Sarmin", 3);
		Student.put("Sabiha", 4);
	
		
//		System.out.println(Student.get("Sabiha"));
//		System.out.println(Student.get("Shuvra"));
		
		
		HashMap<String, String> CountryCap=new HashMap<>(); 
		CountryCap.put("Texas", "Austin");
		CountryCap.put("Missouri", "JeffersonCity");
		CountryCap.put("Arkansas", "LittleRock");
		CountryCap.put(null, "null");
		//will not throw exception because it allows only one null key
		
		System.out.println(CountryCap.get(null)+ "map");
		
		//HashTable
		
		Hashtable<String, String> name=new Hashtable<>();
		name.put("Sagor", "Nevada");
		name.put("Sabiha", "NY");
		name.put("Mily", "Coppell");
		name.put(null, "Coppell");
		System.out.println(name.get(null)+ "table");
		//it throws a NullPointerException since null is not allowed as a key in Hashtable.
		
		
		//hash-set
		
		  HashSet<String> set = new HashSet<>();
		  
		  set.add("Apple");
	        set.add("Banana");
	        set.add("Cherry");
	        set.add("Apple");  // Duplicate (ignored)
	        System.out.println(set);

	}
	/*
	 HashMap and Hashtable are both classes in Java used to store key-value pairs,
	  but there are key differences between them:

1. Synchronization
HashMap is not synchronized by default, meaning it is not thread-safe.
 Multiple threads can access it simultaneously(Exact same time), which may lead to inconsistent results
  unless external synchronization is applied.
  
Hashtable is synchronized, meaning it is thread-safe out of the box.
 Multiple threads can access it concurrently(Happening in the same timeframe but not necessarily at the exact moment),
  but synchronization can cause performance issues.
2. Null Values
HashMap allows one null key and multiple null values.
Hashtable does not allow null keys or null values.
 Attempting to insert a null key or value will throw a NullPointerException.
3. Performance
HashMap generally provides better performance because it doesn't have the overhead of synchronization.
Hashtable has lower performance due to synchronization, which is useful in multithreaded
 environments but introduces additional processing overhead.
4. Iteration
HashMap uses the Iterator for iterating, which is fail-fast (throws ConcurrentModificationException if
 modified during iteration).
Hashtable uses the Enumerator for iteration, which is not fail-fast.

Uniqueness:
Yes, both HashMap and Hashtable store unique keys. In both classes, keys are unique, meaning:

If you try to insert a duplicate key, 
the new value will overwrite the existing value associated with that key.
HashSet:
HashSet is a class in Java that implements the Set interface 
and is part of the Java Collections Framework.
 It is used to store unique elements only and does not allow duplicates.

	 */

}
