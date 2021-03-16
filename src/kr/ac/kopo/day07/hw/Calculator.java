package kr.ac.kopo.day07.hw;

import java.util.Scanner;

public class Calculator {
	Scanner sc = new Scanner(System.in);
	
	int getNum() {
		System.out.print("정수 : ");
		int num = sc.nextInt();
		sc.nextLine();
		return num;
	}
	
	
	
	void calNum(int a , int b) {
		System.out.printf("%d + %d = %d\n", a, b, a+b);
		System.out.printf("%d - %d = %d\n", a, b, a-b);
		System.out.printf("%d * %d = %d\n", a, b, a*b);
		System.out.printf("%d / %d = %d\n", a, b, a/b);
		System.out.println();
	}


	
	
	void primeCheck(int num) {
		boolean flag = true;
		
		if(num <2 ) {
			flag = false;
		}else {
			for( int i =2; i<=num/2; i ++) {
				if(num ==2 ) break;
				else if(num % i ==0 ) {
					flag = false;
					break;
				}
			}
		}
		
		System.out.println(num + " 소수체크 : " + flag);
	}
	
	void primeCheck(int num1, int num2) {
		primeCheck(num1);
		primeCheck(num2);
	}
}
