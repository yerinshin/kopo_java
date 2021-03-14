package kr.ac.kopo.day04.hw;

import java.util.Scanner;

public class HomeWork06 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[10];
		int even = 0;
		int odd = 0;

		for (int i = 0; i < arr.length; i++) {
			
			System.out.print(i+1+"'s 정수 : ");
			int num = sc.nextInt();
			arr[i] = num;

		}
		
		System.out.println("<짝수>");
		for (int i = 0; i < arr.length; i++) {

			if(arr[i] % 2 ==0) {
				even += arr[i];
				System.out.print(arr[i]+ "  ");
			}
		}
		
		System.out.printf("짝수 총합 : %d\n", even);

		System.out.println("<홀수>");
		for (int i = 0; i < arr.length; i++) {

			if(arr[i] % 2 ==1) {
				odd += arr[i];
				System.out.print(arr[i]+ "  ");
			}
		}
		System.out.printf("홀수 총합 : %d\n", odd);
		
		
	}
}
