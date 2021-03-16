package kr.ac.kopo.day07;

import java.util.Scanner;

public class KeyboardTestMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		sc.nextLine(); // nextLine 만 엔터를 소비 --> 버퍼를 공백으로 만들어줌 
		
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		*/
		
		System.out.print("정수 입력 : ");
		
		//int num = Integer.parseInt("123"); // "123" => 123(정수)
		
		//엔터 소비하기 위해 (buffer 공백으로 만들기 위해) nextLine으로 입력 받고 parseInt로 정수 변환
		int num = Integer.parseInt(sc.nextLine());   
		sc.nextLine(); // 엔터를 소비 --> 버퍼를 공백으로 만들어줌 
		
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
	}

}
