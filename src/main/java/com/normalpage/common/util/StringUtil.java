package com.normalpage.common.util;

public class StringUtil {

	public static boolean isEmpty(String str) {
		return str == null || str.length() == 0;
	}
	
	public static boolean isNotEmpty(String str) {
		return !isEmpty(str);
	}
	
}
