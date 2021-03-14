package kr.ac.kopo.day02.exam;

import java.util.Scanner;

public class HomeWork01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();

//		Scanner sc1 = new Scanner(System.in);
//		Scanner sc2 = new Scanner(System.in);
//		System.out.print("첫번째 정수 : ");
//		int num1 = sc.nextInt();
//		System.out.print("두번째 정수 : ");
//		int num2 = sc.nextInt();

		
		System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
		System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
		System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
		System.out.printf("%.2f / %.2f = %.2f\n", (double)num1, (double)num2, (double)num1 / (double)num2);
		System.out.printf("%d %% %d = %d\n", num1, num2, num1 % num2);

	}

}
