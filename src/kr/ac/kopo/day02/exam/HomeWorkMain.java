package kr.ac.kopo.day02.exam;

import java.util.Scanner;

/*
 *  1. 
 *  2개의 정수를 입력받아 다음과 같이 출력하는 코드를 작성
 *  첫번째 정수 : 12
 *  두번째 정수 : 5
 *  
 *  12 + 5 = 17
 *  12 - 5 = 7
 *  12 * 5 = 60
 *  12 / 5 = 2.40
 *  12% 5 = 2 
 *  
 *  2. 
 *  반지름을 입력받아 원둘레와 원넓이를 출력하는 코드를 작성 (단, 원주율을 상수변수를 사용해서 작성)
 *  반지름을 입력 : 1
 *  반지름이 1일때, 원둘레는 xxxx이고, 원넓이는 xxxx이다.
 *  
 *  3. 
 *  2960원 어치 물건을 사고 5000원을 입력했을 때, 
 *  거스름돈의 액수와 1000, 500, 100, 50, 10원의 개수를 출력하는 코드를 작성
 *  
 *  (입력)
 *  물건값 입력 : 2960
 *  지불한 액수 입력 : 5000
 *  
 *  (출력)
 *  
 *  방식1.
 *  거스름돈 :
 *  1000원 : 2개
 *  500원 : 0개
 *  100원 : 0개
 *  50원 : 0개
 *  10개 : 4개
 *  
 *  2000원 지불했다면 960원이 부족합니다.출력
 *  
 *  
 *  방식2.
 *  1000원 : 2개
 *  10개 : 4개
 *  
 *  2000원 지불했다면 960원이 부족합니다.출력
 *  
 *  4. 두개의 정수를 입력 받아 첫번째 정수가 두번째 정수의 배수인지를 판단하는 프로그램 작성
 *  (조건연산자, if모두 이용해서 작성)
 *  
 *  (입력)
 *  첫번째 정수 : 12 
 *  두번째 정수 : 4
 *  
 *  12가 4의 배수인지 판단 결과 : 참, 거짓 ---> 한글로 출력
 *  
 *  두번째 정수가 0일 경우 : false 로 
 *  ------------------
 *  
 *  
 */




public class HomeWorkMain {

	public static void main(String[] args) {
		
		Scanner sc_01 = new Scanner(System.in);
		Scanner sc_02 = new Scanner(System.in);
		System.out.println("첫번째 정수 : ");
		int num_01 = sc_01.nextInt();
		System.out.println("두번째 정수 : ");
		int num_02 = sc_02.nextInt();
		
		System.out.printf("%d", num_01 + num_02);
	}

}
