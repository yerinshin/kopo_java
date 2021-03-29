package kr.ac.kopo.day12.inter02;

import java.util.Random;

public class ExceptionMain01 {

	public static void main(String[] args) {
		System.out.println("main start ...");
		
		Random r = new Random();
		int num = r.nextInt(3); //0~2난수
		System.out.println("num : " + num);
		
//		try {
//			System.out.println(10 / num);
//		}catch(ArithmeticException ae) {
////			System.out.println("catch 이유 : " + ae.getMessage());
//			ae.printStackTrace();
//		}
		
		
		String str = "hello";
//		String str = null;
		
		try {
			System.out.println(10 / num);
			System.out.println("첫번째 문자 : " + str.charAt(0)); //앞에서 예외 걸리면 실행 되지 않음
		} catch(Exception e) {
			e.printStackTrace();
		} 
		
		
		
		/*
		 * 	try {
			System.out.println(10 / num);
			System.out.println("첫번째 문자 : " + str.charAt(0));
		} catch(ArithmeticException | NullPointerException e ) {
			e.printStackTrace();
		} 
		 */
		
		
		
		/*
		 * 	try {
			System.out.println("첫번째 문자 : " + str.charAt(0));
			System.out.println(10 / num);
		} catch(ArithmeticException ae ) {
			ae.printStackTrace();
		} catch(NullPointerException ne) {
			System.out.println("NullPointerException 진입..");
		}
		 */
		
		System.out.println("main end ..."); //예외 발생해도 그 후 코드 실행

	}

}
