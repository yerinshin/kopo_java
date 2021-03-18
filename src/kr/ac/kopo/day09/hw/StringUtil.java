package kr.ac.kopo.day09.hw;

public class StringUtil {
	
	boolean isUpperChar(char c) {
		boolean bool = false;
		if(65<= c && c <=90) {
			bool = true;
		}
		return bool;
	}
	
	boolean isLowerChar(char c) {
		boolean bool = false;
		if(c >= 97) {
			bool = true;
		}
		return bool;
	}
	
	int max(int i, int j) {
		int max = 0;
		if(i == j ) System.out.println("두 수의 크기가 같습니다.");
		else max = i > j ? i :j ;
		return max;
	}
	
	int min(int i, int j) {
		int min =0 ;
		if( i == j ) System.out.println("두 수의 크기가 같습니다.");
		else min = i < j ? i : j;
		return min;
	}
	
	void reverseString(String str) {
		String[] strArr = str.split("");
		String[] reverseArr = new String[str.length()];
		for(int i =0 ; i < str.length(); i ++) {
			reverseArr[str.length()-i-1] = strArr[i];
		}
		for(String s : reverseArr) {
			System.out.print(s);
		}
	}
	
	
	void toUpperString(String str) {
		
		for(int i =0; i < str.length(); i ++) {
		char ch = str.charAt(i);
		if(ch >= 97) {
			ch -= 32;
		}
		System.out.print(ch);
		}
	}
	
	
	void toLoserString(String str) {
		for(int i =0; i < str.length(); i ++) {
			char ch = str.charAt(i);
			if(65<= ch && ch <=90) {
				ch += 32;
			}
			System.out.print(ch);
			}
	}
	
	
	public static int checkChar(String strData, char ch) {
		int cnt = 0;
		for(int i =0; i < strData.length(); i++) {
			char c = strData.charAt(i);
			if(c == ch)	cnt ++;
		}
		return cnt;
	}
	
	public static String removeChar(String oriStr, char delChar) {
		String delStr = String.valueOf(delChar);
		oriStr = oriStr.replace(delStr, "");
		return oriStr;
	}
	
}
