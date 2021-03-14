package kr.ac.kopo.day04;

import java.util.Arrays;

public class ArrayMain02 {

	public static void main(String[] args) {

		/*
		int[] arr = new int[5];
		for(int i=0; i< arr.length; i++) {
			arr[i] = i+1;
		}
		*/
		
		
//		int[] arr = {1, 2, 3, 4, 5}; //새로 초기화 불가능
//		arr = {10, 20, 30, 40, 50, 60, 70}; ->(x) :
		
		
		int[] arr = new int[] {1, 2, 3, 4, 5};		
		arr = new int[] {10, 20, 30, 40, 50, 60, 70}; // 이미 만들어진 참조 변수 새로 초기화
		
		//출력
		for(int i=0; i< arr.length; i++) {
		
			System.out.println(arr[i]);
		}
		
		//출력2
		
		//arr에 있는 모든 변수를 인덱스 0부터 length -1 까지 접근하고-> num이라는 변수에 기억
		for(int num : arr) {
			System.out.println(num);
		}
		
		//출력3
		// Arrays.toString() 메소드를 이용한 출력 -> 배열의 요소들을 하나의 문자열로 만들어줌
		// ---> "[10, 20, 30]"
		
		System.out.println(Arrays.toString(arr));
		
	}

}
