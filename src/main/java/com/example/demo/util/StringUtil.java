package com.example.demo.util;

public class StringUtil {
	public static String reverseString(String input) {
		// getBytes() method to convert string
		// into bytes[].
		byte[] strAsByteArray = input.getBytes();

		byte[] result = new byte[strAsByteArray.length];

		// Store result in reverse order into the
		// result byte[]
		for (int i = 0; i < strAsByteArray.length; i++)
			result[i] = strAsByteArray[strAsByteArray.length - i - 1];

		return new String(result);
	}
}
