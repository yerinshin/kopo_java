package kr.ac.kopo.day04;

public class ArrayMain01 {
	
	public static void main(String[] args) {
		
		int[] arr;
		
		arr = new int[5];
		
		System.out.println("arr :" + arr);
		
		System.out.println("첫번째 정수 : " + arr[0]); //0
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i+1 + "번째 정수" + arr[i]);
			
		}
	}
}
