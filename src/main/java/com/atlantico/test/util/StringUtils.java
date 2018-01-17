package com.atlantico.test.util;

public class StringUtils {
	public static Boolean isPalindrome(String s) {
		return s.equals(new StringBuilder(s).reverse().toString());
	}

	public static String firstNotRepeated(String s) {
		for (char c : s.toCharArray()) {
			if (s.indexOf(c) == s.lastIndexOf(c)) {
				return String.valueOf(c);
			}
		}

		return "Todos se repetem";
	}
}
