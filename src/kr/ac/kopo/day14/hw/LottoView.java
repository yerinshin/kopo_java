package kr.ac.kopo.day14.hw;

import java.util.Scanner;

public class LottoView {
	
	public void process() {
		LottoUtil util = new LottoUtil();
		Scanner sc = new Scanner(System.in);
		System.out.print("게임 수를 입력하세요 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		System.out.println("배열 사용");
		for(int j =1; j <=num; j ++) {
			System.out.print("게임 "+ j + " : ");
			util.getLotto01();
		}
		System.out.println();
		
		System.out.println("출력 사용");
		for(int j =1; j <=num; j ++) {
			System.out.print("게임 "+ j + " : ");
			util.getLotto02();
		}
		System.out.println();
		
		System.out.println("List 사용");
		for(int j =1; j <=num; j ++) {
			System.out.print("게임 "+ j + " : ");
			util.getLotto03();
		}
		System.out.println();
		
		System.out.println("Set 사용");
		for(int j =1; j <=num; j ++) {
			System.out.print("게임 "+ j + " : ");
			util.getLotto04();
		}
		System.out.println();
		
	}
	
	
	
}
