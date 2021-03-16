package kr.ac.kopo.day06.hw;

import java.util.Scanner;


public class IcecreamMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이스크림 몇 개 구입할꺼야 ? : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		Icecream[] iceArr = new Icecream[num];
		
		for(int i =0; i<iceArr.length; i++) {
			iceArr[i] = new Icecream();
			System.out.println("\n***"+ (i+1) +"번째 아이스크림 구매 정보 입력  ***");
			
			System.out.print( "아이스크림 명 : ");
			// 
			
			
			
			iceArr[i].name = sc.nextLine();
			System.out.print("아이스크림 가격 : ");
			iceArr[i].price = sc.nextInt();
			
		}
		
		int sum = 0;
		
		System.out.println("\n<총 4 " + num + "개의 아이스크림 구매정보 출력 >");
		System.out.println("번호   아이스크림명   아이스크림가격");
		
		for( int i =0; i<iceArr.length; i++) {
			System.out.println(i+1  + "      " + iceArr[i].name
								+ "        " +  iceArr[i].price);
				
			sum += iceArr[i].price;
		}
		
		System.out.println("\n총계 : " + sum + "원");
	}

}
