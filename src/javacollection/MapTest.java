package javacollection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {
		//Map<String, String>   hmap = new HashMap<>();
		//Map<String, String>   hmap = new TreeMap<>();
		Map<String, String>   hmap = new LinkedHashMap<>();
		
		hmap.put("Kathmandu", "44600");
		hmap.put("Lalitpur", "44700");
		hmap.put("Dhanusha", "55690");
		for(String key : hmap.keySet()) {
			System.out.println(key+" "+ hmap.get(key));
			
		}
		
		//Set<String> key = hmap.keySet();
		
		
		hmap.forEach((k,v)-> System.out.println(v));
		
		
	}
	
	
}
