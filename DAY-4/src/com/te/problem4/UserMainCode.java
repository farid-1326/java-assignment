package com.te.problem4;

public class UserMainCode {

	public static String removeEvenVovels(String str) {
		StringBuffer buffer = new StringBuffer();
		
		for(int i=0;i<str.length();i++)
		{
			if(i%2==0) {
				buffer.append(str.charAt(i));
			}else if(i%2!=0) {
				if(str.charAt(i)!='a' && str.charAt(i)!='e' && str.charAt(i)!='i'&& str.charAt(i)!='o'&& str.charAt(i)!='u') {
					buffer.append(str.charAt(i));
				}
		
			}
		}

		return buffer.toString();
	}

}
