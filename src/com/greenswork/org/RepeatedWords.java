package com.greenswork.org;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RepeatedWords {
	
	public static void main(String[] args) {
		
		String s = "welcome to java to java to java to ";
		String[] split = s.split(" ");
		Map<String,Integer> m = new LinkedHashMap<String,Integer>();
		for (String word : split) {
			if (m.containsKey(word)) {
				Integer in = m.get(word);
				m.put(word, in+1);
			}
			else {
				m.put(word, 1);
			}			
		}
		System.out.println(m);
		Set<Entry<String, Integer>> entrySet = m.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue()>1) {
				System.out.println(entry);
			}
		}
	}

}
