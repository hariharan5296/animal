package org.emp;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Occurence {
	public static void main(String[] args) {
		String s = "java";
		Map<Character, Integer> mp = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (mp.containsKey(s)) {
				Integer integer = mp.get(s);
				mp.put(c, integer + 1);
			} else {
				mp.put(c, 1);
			}
			Set<Entry<Character,Integer>> entrySet = mp.entrySet();
			for (Entry<Character, Integer> entry : entrySet) {
				System.out.println(entry);
			}

		}

	}

}
