package javacollection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
	
	public static void main(String[] args) {
		Set<String>   hset  = new LinkedHashSet<>();
		
		//Set<String>   hset  = new HashSet<>();
		//Set<String>   hset  = new TreeSet<>();
		hset.add("java");
		hset.add("ColdFusion");
		hset.add("RubyonRails");
		hset.add("PHP");
		hset.add("java");
		hset.add("java");
		hset.add("java");
		
		for(String  s : hset) {
			 System.out.println(s);
		 }
	}

}
