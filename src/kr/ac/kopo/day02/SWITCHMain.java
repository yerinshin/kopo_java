package kr.ac.kopo.day02;

import java.util.Scanner;

public class SWITCHMain {
	
	
	//정수형 조건문_SWITCH
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("1 - 3 사이의 정수 : ");
		int num = sc1.nextInt();
		
		switch(num) {
		case 1 :
			System.out.println("ONE");
			break;
		case 2 :
			System.out.println("TWO");
			break;
		case 3 :
			System.out.println("THREE");
			break;
		default :							//가장 마지막 수행
			System.out.println("ERROR");	
		
		}
		
		
		
		//문자열 조건문_IF
		Scanner sc2 = new Scanner(System.in);
		System.out.println("좋아하는 계절을 입력 : ");
		String season = sc2.nextLine();
		
//		if(season == "spring") {           참조 자료형은 동등 비교형(==)불가
//			System.out.println("봄은 3~5월!");
//		}
		
		if(season.equals("spring")) {
			System.out.println("봄은 3~5월!");
		}else if(season.equals("summer")) {
			System.out.println("여름은 6월~8월");
		}
	
	//문자열 조건문_SWITCH
	Scanner sc3 = new Scanner(System.in);
	System.out.println("좋아하는 계절 다시 입력 : ");
	String season2 = sc3.nextLine();
	
	switch(season2) {
	case "spring" :
	case "SPRING" :
	case "봄" :
		System.out.println("봄은 3 ~ 5월!");
		break;
	case "summer" :
		System.out.println("여름은 6월 ~ 8월!");
		break;
	default :
		System.out.println("error");
	}
	

	}
}
