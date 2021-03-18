package kr.ac.kopo.day09.hw;

public class StringUtilMain {

	public static void main(String[] args) {
		
		String str = new String();
		StringUtil util = new StringUtil();
		
		System.out.println(util.isUpperChar('C')); 	//true
		System.out.println(util.isLowerChar('c'));	//true
		System.out.println(util.max(2, 5));			// 5
		System.out.println(util.min(17, 2));		// 2
		util.reverseString("Hello World");			// dlroW olleH
		System.out.println();				
		util.toUpperString("hEllO worlD");			// HELLO WORLD
		System.out.println();
		util.toLoserString("hEllO worlD");			//hello world
		System.out.println();
		System.out.println(util.checkChar("Hello A World JAva", 'A')  + "개"); //2개
		System.out.println(util.removeChar("Hello World Java", 'l'));	//Heo Word Java
	}

}
