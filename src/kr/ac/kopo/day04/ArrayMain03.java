package kr.ac.kopo.day04;

import java.util.Arrays;

public class ArrayMain03 {
	public static void main(String[] args) {
		
		int[][] arr = new int[2][4];
		/*
		int[][] arr = new int[2][]; -> 얘만 하면 주소 값 대신 null 찍힘
		arr[0] = new int[5];
		arr[1] = new int[3];
		*/
		
		System.out.println("arr : " + arr); // arr 주소 값 들어있음
		System.out.println(arr.length);
		
		for(int i =0; i < arr.length ;i ++) {
			System.out.println("arr[" +i+ "] : " + arr[i]); //  주소 값
			System.out.println("arr[" +i+ "].length : " + arr[i].length);
		}
		
		
		//문자열
		
		String[] strArr  = {"안녕", "데이터 분석", "자바"};      
		//String strArr = {new String("폴리텍"), new String("데이터 분석"), new String("자바")} 로 해석
		//---> 참조 자료형 1차원 배열은 기본 자료형 2차원 배열과 같다. 
		
		System.out.println(strArr); //주소
		
		System.out.println("첫번째 문자열 : " + strArr[0]);
		
		for(int i =0; i < strArr.length ;i ++) {
			System.out.println(i+1 + "번째 문자열 : " + strArr[i]); // 
			
		}
		
		for(String str : strArr) {
			System.out.println(str);
		}
 	
		System.out.println(Arrays.toString(strArr));
}
}
