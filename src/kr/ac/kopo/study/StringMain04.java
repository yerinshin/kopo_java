package kr.ac.kopo.study;

import java.util.Arrays;

public class StringMain04 {
	public static void main(String[] args) {
		
		String str = "hello world";
		
		System.out.println("str : " + str);
		
		String subStr = str. substring(1,5);
		//String subStr = str. substring(1); //1부터 끝까지
		System.out.println("substring(1,5) : [ " + subStr+ " ]"); //부분 문자열을 반환
		
		
		System.out.println("----------------------------------------------");
		
		String str1 = "hello";
		String str2 = "!!!!";
		
//		str = str1 + str2;
		str = str1.concat(str2);
		System.out.println("str1 : " + str1);
		System.out.println("str 2 : " + str2);
		System.out.println("concat (str1, str2 ) : " +str);
		
		System.out.println("----------------------------------------------");
		
		str = "hello world";
		System.out.println("replace() 전 : " + str);
		
//		str.replace('l', 'r');
		str = str.replace("l", "r");
		System.out.println("replace() 후 : " +str);
		
		System.out.println("----------------------------------------------");
		str = "   hello world   ";
		System.out.println("trim() 전 [" + str + "] 길이 : " + str.length());
		str = str.trim(); //중간 공백은 상관 안함
		System.out.println("trim() 후 [" + str + "] 길이 : " + str.length());
		
		System.out.println("----------------------------------------------");
		
		str= "Hello World!!!";
		System.out.println("str :" + str);
		System.out.println("toLowerCase() : " + str.toLowerCase());
		System.out.println("toUpperCase() : " + str.toUpperCase());
		
		System.out.println("----------------------------------------------");
		
		str = "홍길동전:허균:조선시대";
		
		String[] strArr = str.split(":");
		System.out.println(Arrays.toString(strArr));
		
		String ip = "192.168.5.203";
		String[] ipArr = ip.split("\\."); // .은 역슬래시 두개랑
		System.out.println(Arrays.toString(ipArr));
		
		System.out.println("----------------------------------------------");
		int num = 123;
		//"123"으로 변환
		
//		String strNum = num + ""; //꼼수
		String strNum = String.valueOf(num);
		
		System.out.println(strNum + 10);
		System.out.println(String.valueOf(true)); //true라는 문자열로 바꿈 -> 반환형 string
		System.out.println(String.valueOf(true) + false);
	}
	
}
