package kr.ac.kopo.day11.abs02;

import java.util.Scanner;

public class Menu {
	
	public int selectMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("LV2 프린터를 선택하세요(1.LG  2.삼성) => ");
		int no = sc.nextInt();
		sc.nextLine();
		
		return no;
	}
	
	public void choice() {
		int type = selectMenu();
		print(type);
		
	}
	
	Printer p = null; 
	
	public void print(int no) {
		switch(no) {
		case 1 : 
			p = new LGPrinter(); //자식 클래스의 인스턴스 객체를 부모가 가질 수 있다.
			//p.print();
			break;
		case 2 : 
			p = new SamsungPrinter();
			//p.print();
			break;
		case 3 :
			p = new HPInkjetPrinter();
			p = new HPLaserPrinter();
			//p.print();
			break;
		}
		
		if( p!=null) {
			p.print();
		}else {
			System.out.println("잘못 선택하셨습니다."); //예외처리
		}
		
		
		
		
		/*
		 * switch(no) {
		case 1 : 
			LGPrinter lg = new LGPrinter();
			lg.print();
			break;
		case 2 : 
			SamsungPrinter sam = new SamsungPrinter();
			sam.print();
			break;
		case 3 :
			HPPrinter hp = new HPPrinter();
			hp.print();
			break;
		}
		 */
	}
}







