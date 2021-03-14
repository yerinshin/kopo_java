package kr.ac.kopo.day04.hw;

import java.util.Scanner;

public class HomeWork01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("3개의 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int max = 0;
		int mid = 0;
		int min = 0;
		
		max = num1 >= num2 ? num1 : num2;
		max = max >= num3 ? max : num3;
		
		min = num1 < num2 ? num1 : num2;
		min = min < num3 ? min : num3;
		
		if(max == num1) {
			mid = num2 > num3 ? num2 : num3;
		}else if(max == num2) {
			mid = num1 >= num3 ? num1 : num3;
		}else {
			mid = num1 >= num2 ? num1 : num3;
		}
	
		
		System.out.printf("%d  %d  %d", max, mid, min);
		
		//[방법2]
		
	}
}
