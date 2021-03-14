package kr.ac.kopo.day02;

import java.util.Scanner;

public class OperationMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		boolean result = (num > 0 && num % 2 == 0);			
		
		System.out.print(num + "의 짝수 유무 : " + result);
	}

}
