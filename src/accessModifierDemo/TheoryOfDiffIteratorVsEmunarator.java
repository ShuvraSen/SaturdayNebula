package accessModifierDemo;

public class TheoryOfDiffIteratorVsEmunarator {
	/*
 * Iterator was introduced in Java 2 (JDK 1.2) as a part of the Java Collections Framework.
*  It is used to traverse elements in modern collections like List, Set, and Map. 
*  It provides three main methods: hasNext() to check if more elements exist, next() 
*  to retrieve the next element, and remove() to delete elements while iterating. 
*  Unlike Enumerator, Iterator is more powerful because it allows modification (removal) of elements during traversal.
	 *   However, it is fail-fast, meaning it throws ConcurrentModificationException
	 *    if the collection is modified while iterating.

Enumerator, introduced in Java 1 (JDK 1.0), is used only with legacy collections
 like Vector and Hashtable. It provides two methods: hasMoreElements() to check for elements
  and nextElement() to retrieve the next one. Unlike Iterator, 
  Enumerator does not allow element removal during traversal,
   making it less flexible. However, it is fail-safe, meaning it does not throw exceptions 
   if the collection is modified while iterating. Due to its limitations,
    Enumerator is rarely used in modern Java development.
	 
	 
	 
	 
	 */

}
