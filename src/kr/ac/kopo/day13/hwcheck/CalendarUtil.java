package kr.ac.kopo.day13.hwcheck;

import java.util.Calendar;

//달력과 관련된 여러가지 기능 클래스
public class CalendarUtil {
	
	/* 멤버변수로 사용할 경우
	 * 
	private Calendar c;
	
	public CalendarUtil() {  //생성자로 초기화
		c= Calendar.getInstance();
	}
	*/
	
public void showDayByYear(int year) {
		
		for(int month = 1; month <= 12; month++) {
			showDayByMonth(year, month);
		}
	}
	
	public void showDayByMonth(int year, int month) {
		Calendar c = Calendar.getInstance();
		
		// year-month-1로 날짜정보 변경
		c.set(year, month-1, 1);
		
		// month/1의 요일???
		int week = c.get(Calendar.DAY_OF_WEEK);
		
		// month의 마지막날수??
		int lastDay = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		System.out.println("<< " + year + "년 " + month + "월 >>");
		showDay(week, lastDay);
	}
	
	private void showDay(int week, int lastDay) {
		System.out.println("--------------------------------------------------");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		System.out.println("--------------------------------------------------");
		int cnt = 0;
		for(int i = 1; i < week; i++) {
			System.out.print("\t");
			cnt++;
		}
		for(int day = 1; day <= lastDay; day++) {
			System.out.print(day + "\t");
			if(++cnt % 7 == 0)
				System.out.println();
		}
		if(cnt % 7 != 0)
			System.out.println();
		System.out.println("--------------------------------------------------");
		}
	
}
