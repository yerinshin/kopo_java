package kr.ac.kopo.day13;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

class Dog {
	String name;
	int age;
	
	Dog(String name, int age){
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "name : " + name + ",age : " + age;
	}
	
	
//	public void info() {
//		System.out.println("name + " + name +  ", age : " +age);
//	}
}



public class DateMain {
	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();
		System.out.println("c : " + c);
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
//		int date = c.get(Calendar.DATE);
		int	date = c.get(Calendar.DAY_OF_MONTH);
		int day = c.get(Calendar.DAY_OF_WEEK);	//일(1) ~ 토(7)
		
		String[] dayArr= {"", "일", "월", "화", "수", "목", "금", "토"};
		
		System.out.println("오늘은 "+ year + "년 " + month + "월 " 
						+ date + "일(" + dayArr[day] + ")");
		
		//2021년 5월 5일 무슨요일 ????
		c.set(2021, 5-1, 5);
		day = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("2021년 5월 5일은 " +dayArr[day]+"요일 입니다.");
		
		//5월의 마지막날이 몇 일??
		int lastday = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("5월은 " +lastday +"일로 구성되어있습니다.");
		
		//2월의 마지막 날이 몇일 ??
		c.set(c.MONTH, 2-1);  	//2021년 2월 5일로 변경
		lastday = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("2월은 " +lastday +"일로 구성되어있습니다.");
		System.out.println();
		
		Date d = c.getTime();
		
		String pattern = "yyyy년 MM월 dd일 HH시 mm분 ss초(E)";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String data = sdf.format(new Date());
		System.out.println(data);
		
		data = sdf.format(d);
		System.out.println(data);
		
		
		System.out.println("-------------------------------------------------------------------");
		
		/*
		Dog dog = new Dog("멍이", 3);
		System.out.println("dog : " + dog);	
		System.out.println("dog : " + dog.toString() ); 	//주소 값 찍힘 (출력(print) 할때만, 자체적으로 toString() 호출)

		System.out.println("--------------------------------------------------------------------------------");
		
		// 오늘은 2021년 3월 24일입니다.
		Date d = new Date();
		System.out.println("d : " + d); 
		System.out.println("d : " + d.toString());	// 객체 찍어도 주소 값 안나옴 ---> Date클래스에서 toString()메소드를 오버라이딩 한 것
		
		int year = d.getYear() + 1900;
		int month = d.getMonth() + 1;
		int date = d.getDate();
		
		System.out.println("오늘은 " + year + "년 " + month + "월 " + date + "일입니다.");
		*/
	}
}
