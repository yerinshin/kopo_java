package kr.ac.kopo.day04.hw;

import java.util.Scanner;

public class HomeWork02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("4개의 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		
		/*
		 * 1~100사이의 정수를 4개 추출
		 * Random r = new Random();
		 * int num = r.nextInt(100) + 1; //(0~99) + 1 사이의 수가 나옴		
		*/
		
		int max = 0;
		max = num1 > num2 ? num1 : num2;
		max = max > num3 ? max : num3;
		max = max > num4 ? max : num4;
		
		System.out.println(max);
		
		
		/* 준결승 형태
		 * int max1 = num > num2? num:num2;
		 * int max2 = num3;
		 * if(num4 > num3){
		 * 	max2 = num4;
		 * }
		 * System.out.println("가장 큰 수 : " + (max1 > max2 ? max1 : max2));
		 */
		
		

	}

}
