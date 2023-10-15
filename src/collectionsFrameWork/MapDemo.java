package collectionsFrameWork;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
	
	public static void main(String[] args) {
		
		Map<Integer, String> map = new TreeMap<>();
		
		map.put(10, "java");
		map.put(20, "Python");
		map.put(30, "kotlin");
		map.put(40, "Php");
		map.put(50, "Ruby");
		
		System.out.println(map);
		
		if(map.containsKey(30)) {
			map.put(30, "t");
		}
		
		for(Map.Entry<Integer,String> e : map.entrySet()) {
			System.out.println(e.getValue());
			System.out.println(e.getKey());
			System.out.println(e);
		}
		
		for(Integer keys :  map.keySet()) {
			System.out.println(keys);
		}
	}
}
