package kr.ac.kopo.day02.exam;

import java.util.Scanner;

public class HomeWork04 {

	public static void main(String[] args) {	
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();

		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();
		
		System.out.printf("[ %d가 %d의 배수인지 판단 결과 ] \n", num1, num2);
		// 조건 연산자
		System.out.printf("조건연산자 : "  + (num2 > 0 && num1 % num2 ==0 ? true: false));	//num2 > 0 이 앞에 나와야함	

	/*
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();
		
		System.out.printf("[ %d가 %d의 배수인지 판단 결과 ] \n", num1, num2);
		// 조건 연산자
		System.out.printf("조건연산자 : "  + (num2 !=0 && num1 % num2 ==0 ? true: false));		

		System.out.println();
		
		//if문
		System.out.printf("if문 : ");
		if(num2 ==0 ){
			System.out.println("거짓");
		}else if(num1 % num2 == 0) {
			System.out.println("참");
		}else {
			System.out.println("거짓");
		}
		*/
	}

}
