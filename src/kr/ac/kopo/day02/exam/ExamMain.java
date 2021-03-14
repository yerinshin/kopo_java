package kr.ac.kopo.day02.exam;

import java.util.Scanner;

/*
 *  집에서 출발한 시간 8 시 이전: 걸어서
 *  8시 15분 이전 : 버스 타고
 *  8시 15분 이후 : 택시 타고
 *  
 *  집에서 출발한 시간 입력 (8시 5분은 805 입력)
 */

public class ExamMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("집에서 출발한 시간 입력 : ");
		int time = sc.nextInt();

		if(time <= 800) {
			System.out.println("걸어 간다.");
		}else if(time <= 815) {
			System.out.println("버스 탄다.");
		}else if(time <= 900){
			System.out.println("택시 탄다.");
		}else {
			System.out.println("지각 !!!!!!");
		}
	}

}
