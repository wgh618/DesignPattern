package com.will.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {
	
	public static boolean isValidCard(String str) {
		// 身份证正则表达式(15位)
		Pattern isIDCard1 = Pattern.compile("^[1-9]\\d{7}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}$");
		// 身份证正则表达式(18位)
		Pattern isIDCard2 = Pattern.compile("^[1-9]\\d{5}[1-9]\\d{3}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}([0-9]|X)$");
		Matcher matcher1 = isIDCard1.matcher(str);
		Matcher matcher2 = isIDCard2.matcher(str);
		if (matcher1.matches()) {
			return true;
		} else if (matcher2.matches()) {
			//身份证号前十七位每一位权值
			int[] wi = new int[]{7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2,1};
			char[] ai = new char[]{'1','0','X','9','8','7','6','5','4','3','2'};
			if ('x' == str.charAt(17)) {
				str.replace('x', 'X');
			}
			int sum = 0;
			for (int i = 0 ; i < str.length() - 1 ; i ++) {
				sum = sum + Integer.parseInt(str.charAt(i) + "") * wi[i];
			}
			int seq = sum%11;
			char getCheckDigit = ai[seq];
			
			if (str.charAt(17) == getCheckDigit) {
				return true;
			}
			return false;
		}else {
			return false;
		}
	}
}
