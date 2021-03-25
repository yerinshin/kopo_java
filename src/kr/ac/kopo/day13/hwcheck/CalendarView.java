package kr.ac.kopo.day13.hwcheck;

import java.util.Scanner;

//키보드 입력을 받거나 하는 등의 클래스
public class CalendarView {
	
	private Scanner sc;
	
	public CalendarView() { //생성자에서 Scanner 객체 만듬
		sc = new Scanner(System.in);
	}
	
	public int getInt(String msg) {
		System.out.println(msg);
		int no = sc.nextInt();
		sc.nextLine();
		
		return no;
	}
	
	public void process() {
		
		CalendarUtil util = new CalendarUtil();
		
/* loop : */ while(true){
			int command = getInt("항목을 선택하세요 (1.특정연도 2.특정월 3.종료) : ");
			int year, month;
			switch(command) {
			case 1 :
				year = getInt("년도를 입력하세요 : ");
				util.showDayByYear(year);
				break;
			case 2 :
				year = getInt("년도를 입력하세요 : ");
				month = getInt("월을 입력하세요 : ");
				util.showDayByMonth(year, month);
				break; 	//  가장 가까운 switch문 빠져나옴
			case 3 :
				System.out.println("프로그램을 종료합니다.");
				
				//프로그램 종료 메소드 : exit(0)
				System.exit(0);	 //접근 제한자:public, static일거라고 추측할 수 있음 
//				break loop; 	//이름 설정한 while문 빠져나옴
			}
		}
	}

}
