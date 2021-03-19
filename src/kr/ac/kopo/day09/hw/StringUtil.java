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
	
	/// 2,3,4 > 수업시간 코드
	public String reverseString02(String str) {
		
		char[] chars = new char[str.length()];
		for(int i = str.length() -1, j =0; i >=0; i--) {
			chars[j++] = str.charAt(i);
		}
		return new String(chars);
	}
	
	public String reverseString03(String str) {
		
		StringBuffer sb = new StringBuffer();
		for(int i = str.length() -1, j =0; i >=0; i--) {
			sb.append(str.charAt(i));
		}
		return sb.toString(); 	//StringBuffer 를 string으로 변환
	}
	
	public String reverseString04(String str) {		// length 7이면, 0<->6, 1<->5, 2<->4, 3은 그대로
		int length = str.length();
		char[] chars = new char[length];
		str.getChars(0, length, chars, 0);
		
		for( int i =0, j = length - 1; i < length/2; i++, j--) {
			char temp = ' ';
			temp = chars[i];
			chars[i] = chars[j];
			chars[j] = temp;
		}
		return new String(chars);
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
	
	public String toUpperString02(String str) {
		
		char[] chars = new char[str.length()];
		str.getChars(0,str.length(), chars, 0);
		
		for(int i =0; i < str.length(); i ++) {
			if(chars[i] >= 'a' && chars[i] >='z') chars[i] -= 32;
		}
		return new String(chars);
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
