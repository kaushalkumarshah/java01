package javacollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
	
	/*
	 *   1> List
	 *      ArrayList,LinkedList
	 *      
	 *   2> Set -> unique data
	 *   	HashSet,TreeSet,LinkedHashSet
	 *   	
	 *   3> Map -> <k,v>
	 *   	 HashMap,TreeMap,LinkedHashMap
	 */

	
	public static void main(String[] args) {
		
		 //List<String>  list = new ArrayList<>();
		 List<String>  list = new LinkedList<>();
		 
		 list.add("nepal");
		 list.add("India");
		 
		 
		 for(String  s : list) {
			 System.out.println(s);
		 }
		
		
	}
	
	
}
