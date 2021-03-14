package kr.ac.kopo.day05.hw;

import java.util.Scanner;

public class HomeWork01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];	
		int i =0;
	
		while(i< arr.length) {
			
			System.out.print(i +1 + "'s 정수 : ");
			int num = sc.nextInt();
			if(num >= 0 && num <= 99) {
				arr[i] = num;
				i++;	
			} else {
				System.out.println("0-99사이의 정수만 입력하세요.");
			}
		}
		
		System.out.println("< PRINT > ");
		for(int j =0; j<arr.length; j++) {
			System.out.print(arr[j] + "  ");
		}
		
		System.out.println();
		
		System.out.println("< REVERSE > ");
		for(int j =arr.length-1; j>=0; j--) {
			System.out.print(10 * (arr[j]%10) + arr[j]/10 +"  ");

		}
		
	}
	
}
