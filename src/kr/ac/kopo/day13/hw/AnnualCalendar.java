package kr.ac.kopo.day13.hw;

import java.util.Calendar;
import java.util.Scanner;

public class AnnualCalendar {
	Scanner sc = new Scanner(System.in);
	Calendar c = Calendar.getInstance();
	
	private int year;
	private int month;
	
	
	public void selectCalendar() {
		System.out.print("선택하세요 (1.특정연도 2.특정월 3.종료) => ");
		int num = sc.nextInt();
		sc.nextLine();
		
		switch(num) {
		case 1:
			System.out.println("1");
			showYearCalendar();
			break;
		case 2 :
			System.out.println("2");
			showMonthCalendar();
			break;
		case 3 :
			System.out.println("종료되었습니다.");
			break;
		}
		
		}
	
	public void getCalendar() {
		c.set(year, month-1,1);
		System.out.println("일\t 월\t 화\t 수\t 목\t 금\t 토\t");
		int lastday = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		int day = c.get(Calendar.DAY_OF_WEEK);
		for(int space =1; space<day; space++) {
			System.out.print("\t");
		}
		for(int j = 1; j <= lastday; j ++) {	
			System.out.print(j + "\t");
			if(((day-1) + j)%7 ==0) {
				System.out.println();
			}
		
			}
	}
	
	public void showYearCalendar() {	
		System.out.println("년도를 입력하세요 : ");
		year = sc.nextInt();
		for(int i = 1; i <=12; i ++ ) {
			System.out.println("<< " + year + "년 "+i+"월 >>");
			month = i;
			c.set(year, month-1,1);
			
			getCalendar();

			System.out.println();
			}
		}
		
	
	public void showMonthCalendar() {
		System.out.println("년도를 입력하세요 : ");
		year = sc.nextInt();
		System.out.println("달을 입력하세요 : ");
		month = sc.nextInt();
		getCalendar();

		
	}


}
