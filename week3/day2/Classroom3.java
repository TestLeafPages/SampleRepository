package week3.day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Classroom3 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("oneplus 7t pro", 47999);
		map.put("samsung s20 ultra", 97999);
		map.put("iphone 11 max pro", 121300);
		map.put("redmi k20 pro",  25000);
		map.put("oppo reno 2", 35000);
		map.put("nokia 9 pure view", 45000);
		for(Entry<String, Integer> eachEntry : map.entrySet()) {
			Integer eachValue = eachEntry.getValue();
			if(eachValue>=20000 && eachValue<=50000) {
				System.out.println(eachEntry.getKey()+" -> "+eachValue);
			}
		}
			
		



	}
}
