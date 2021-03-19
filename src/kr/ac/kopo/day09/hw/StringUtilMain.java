package kr.ac.kopo.day09.hw;

public class StringUtilMain {

	public static void main(String[] args) {
		
		String str = new String();
		StringUtil util = new StringUtil();
		
		System.out.println("대문자인가? : " + util.isUpperChar('C')); 	//true
		System.out.println("소문자인가? : " + util.isLowerChar('c'));	//true
		System.out.println(util.max(2, 5));			// 5
		System.out.println(util.min(17, 2));		// 2
		util.reverseString("Hello World");			// dlroW olleH
		System.out.println();				
		util.toUpperString("hEllO worlD");			// HELLO WORLD
		System.out.println();
		util.toLoserString("hEllO worlD");			//hello world
		System.out.println();
		//static 메소드 호출할 때는 클래스명.메소드명
		System.out.println(StringUtil.checkChar("Hello A World JAva", 'A')  + "개"); //2개
		System.out.println(StringUtil.removeChar("Hello World Java", 'l'));	//Heo Word Java
	}

}
