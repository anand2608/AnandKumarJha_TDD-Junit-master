package com.epam.RemoveA;

public class RemoveAFromFirst2Chars {

	public String remove(String string) {
		int stringLength = string.length();
		String firstChar = "";
		String secondChar = "";
		String result = string;
		
		if(stringLength == 1 && string.charAt(0) == 'A') {
			result = string.substring(1,stringLength);
		}
		
		else if(stringLength >= 2) {
			if(string.charAt(0) != 'A') {
				firstChar = ""+string.charAt(0);
			}
			if(string.charAt(1) != 'A') {
				secondChar = ""+string.charAt(1);
			}
			result = firstChar + secondChar + string.substring(2,stringLength);
		}
		
		return result;
	}
}