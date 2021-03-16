package kr.ac.kopo.day07;

import java.util.Scanner;

/**
 * 구구단과 관련된 여러가지 기능을 가지는 기능 클래스
 * @author HP
 *
 */
public class Gugudan{
	
	Scanner sc = new Scanner(System.in); //멤버변수
	
	int getDan() {
		
		int dan = sc.nextInt();
		sc.nextLine();
		
		return dan;
	}
	
	int getDan(String msg) {
		
		System.out.println(msg);
		
//		int dan = sc.nextInt();
//		sc.nextLine();
		int dan = getDan();
		
		return dan;
	}
	
	/**
	 * 한개의 단만 출력
	 * @param dan
	 */
	void print(int dan) {
		
		System.out.println("***" +  dan + "단 ***");
		for(int i =1; i<=9; i++) {
			System.out.println(dan +"*" + i + "=" + dan*i);
		}
		System.out.println();
	}

	/**
	 * 2 - 9 전체 구구단 출력
	 */
	void print() {
		
		/*
		this.print(2); //자기 참조 객체(나의 객체)-? this. 생략 가능
		print(2);
		print(3);
		print(4);
		print(5);
		print(6);
		print(7);
		print(8);
		print(9);
		*/
		
		print(2,9); //위의 코드는 이거와 같다.
		
	}
	
	/*
	 void printAll() {
		for(int dan = 2; dan<=9; dan++) {
			System.out.println("***" + dan + "단 ***");
			for( int i =1; i<=9; i++) {
				System.out.println(dan + "*"+ i + "="+(dan*i));
			}
			System.out.println();
		}
	}
	*/
	
	/**
	 * 시작단에서 종료단까지 구구단 출력
	 * @param sDAN 시작단
	 * @param eDAN 종료단
	 */
	void print(int sDan, int eDan) {
		for(int dan = sDan; dan<= eDan; dan++) {
			print(dan);
		}
	}
	
}
