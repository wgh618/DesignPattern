package com.will.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * ClassName:StringUtils
 * Description:String工具类
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2017年12月1日
 */
public class StringUtils {

	/**
	 * 判断输入的身份证号码是否有效（合法）
	 * @param str 身份证号
	 * @return 检验结果（true：有效 false：无效）
	 */
	public static boolean isValidCard(String str) {
		// 身份证正则表达式(15位)
		Pattern isIDCard1 = Pattern.compile("^[1-9]\\d{7}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}$");
		// 身份证正则表达式(18位)
		Pattern isIDCard2 = Pattern
				.compile("^[1-9]\\d{5}[1-9]\\d{3}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}([0-9]|X)$");
		Matcher matcher1 = isIDCard1.matcher(str);
		Matcher matcher2 = isIDCard2.matcher(str);
		if (matcher1.matches()) {
			return true;
		} else if (matcher2.matches()) {
			// 身份证号前十七位每一位权值
			int[] wi = new int[] { 7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2, 1 };
			char[] ai = new char[] { '1', '0', 'X', '9', '8', '7', '6', '5', '4', '3', '2' };
			if ('x' == str.charAt(17)) {
				str.replace('x', 'X');
			}
			int sum = 0;
			for (int i = 0; i < str.length() - 1; i++) {
				sum = sum + Integer.parseInt(str.charAt(i) + "") * wi[i];
			}
			int seq = sum % 11;
			char getCheckDigit = ai[seq];

			if (str.charAt(17) == getCheckDigit) {
				return true;
			}
			return false;
		} else {
			return false;
		}
	}

	/**
	 * 判断邮箱是否有效
	 * @param str 邮箱
	 * @return 检验结果（true：有效 false：无效）
	 */
	public static boolean isMail(String str) {
		String mail = isNull(str);
		Pattern regex = Pattern
				.compile("^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$");
		Matcher matcher = regex.matcher(mail);
		boolean isMatched = matcher.matches();
		return isMatched;
	}

	public static String isNull(String str) {
		if (str == null) {
			return "";
		}
		return str.trim();
	}
}
