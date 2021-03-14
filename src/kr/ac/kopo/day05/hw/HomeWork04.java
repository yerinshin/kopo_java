package kr.ac.kopo.day05.hw;

public class HomeWork04 {
	public static void main(String[] args) {
		
		int[] arr = new int[99];
		
		for(int i = 0; i <arr.length; i++) {
			arr[i] = i+2;  //2~100까지 배열에 넣기
		}
		
		
		for(int i =0; i< arr.length; i ++) {

			for(int j =2; j<i; j ++) {
				if(arr[i] != j && arr[i] % j ==0) {
					arr[i] =0;
				}
			}
		}
		
		for(int i = 0; i <arr.length; i++) {
			if(arr[i] !=0) {
			System.out.print(arr[i] + " ");
			}
		}
		
		
		}
		
		
	}

