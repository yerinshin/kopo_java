package kr.ac.kopo.day05.hw;

import java.util.Scanner;

public class HomeWork05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		System.out.print("라인 수를 입력하세요 : ");

		while (true) {
			num = sc.nextInt(); //라인 수 

			if (num >= 3 && num <= 20)
				break;
			System.out.print("3 - 20사이의 라인 수를 입력하세요.  : ");
		}
		
		
		System.out.println("5-1>");
		
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num - i; j++) {
				System.out.print("-");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
		
		
		System.out.println();
//		num = sc.nextInt();
		
		System.out.println("5-2>");
		if(num %2 ==0) {
			num -= 1;
		}

		int dot = (num + 1) / 2;

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= dot; j++) {
				System.out.print("*");
			}
			if (i < (num + 1) / 2) {
				dot--;
			} else {
				dot++;
			}
			System.out.println();
		}

		
		System.out.println();
		System.out.println("5-3>");
		
		
		dot = num;
		int space = 0;
		
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= dot; j++) {
				System.out.print("*");
			}
			if (i < (num + 1) / 2) {
				dot-=2;
				space +=1;
			} else {
				dot+=2;
				space-=1;
			}
			System.out.println();
		}
		
	}

}
