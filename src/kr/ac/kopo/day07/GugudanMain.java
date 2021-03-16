package kr.ac.kopo.day07;

import java.util.Scanner;

public class GugudanMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		
		Gugudan gu = new Gugudan(); //인스턴스 객체 만들기
		
		int dan = gu.getDan("2 - 9 사이의 단 입력 : ");
		
		/*
		int dan = sc.nextInt();
		sc.nextLine(); 		// 버퍼비우기
		*/
		
		gu.print(dan);
		gu.print();
//		gu.printAll();
		
		int startDan = gu.getDan("시작단을 입력 : ");
		int endDan = gu.getDan("종료단을 입력 : ");
		
		gu.print(startDan, endDan);

	}

}
