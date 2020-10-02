package com.greenswork.org;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Student {

	public static void main(String[] args) {
		String s = "Welcome to java to java to java in greens";
		String[] split = s.split(" ");

		Map<String, Integer> m = new LinkedHashMap<String, Integer>();
		for (String kword : split) {
			if (m.containsKey(kword)) {
				Integer in = m.get(kword);
				m.put(kword, in + 1);

			} else {
				m.put(kword, 1);

			}

		}
		System.out.println(m);
	}
}
