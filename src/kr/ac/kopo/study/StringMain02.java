package kr.ac.kopo.study;

import java.util.Arrays;
import java.util.Scanner;

public class StringMain02 {
	public static void main(String[] args) {
		
		String str = "Hello World";
//		char[] chars = {'H','e','l','l','o',' ','W','o','r','l','d' };
		char[] chars = new char[str.length()];
	
		/*
		for(int i=0; i < str.length(); i ++) {
			chars[i] = str.charAt(i);
		}
		*/
		
		str.getChars( 0, 5, chars, 1); //charAt 0번지에서 부터 
		
		System.out.println("chars : " + Arrays.toString(chars));
		
		/*
		int loc =0;
		for(int i =3; i<9; i++) {
			chars[loc++] = str.charAt(i);
		}
		*/
		str.getChars(3, 9, chars, 0);
		System.out.println("chars : " + Arrays.toString(chars));
		
		
		System.out.println("["+str+"의 길이 : " + str.length());
		System.out.println("0번째에 위치한 문자 : " + str.charAt(0));
		System.out.println("7번째에 위치한 문자 : " + str.charAt(7));
		
		Scanner sc = new Scanner (System.in);
		System.out.println("문자를 입력 : ");
		
		char c = sc.nextLine().charAt(0);
//		String input = sc.nextLine();
//		char c = input.charAt(0);
	}
}
