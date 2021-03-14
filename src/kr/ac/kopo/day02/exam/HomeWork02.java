package kr.ac.kopo.day02.exam;

import java.util.Scanner;

public class HomeWork02 {

	public static void main(String[] args) {
		
		final double pi = 3.14; 
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름을 입력하세요 : ");
		int r = sc.nextInt();
		
		double l = r * 2 * pi;
		double s = r * r * pi;
		
		System.out.printf("반지름이 %d일때 원의 둘레 : %.2f\n",r, l);
		System.out.printf("반지름이 %d일때 원의 넓이 : %.2f\n",r, s);
		

	}

}
