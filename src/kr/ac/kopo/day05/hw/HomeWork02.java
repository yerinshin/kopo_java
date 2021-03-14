package kr.ac.kopo.day05.hw;
import java.util.Scanner;
public class HomeWork02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("짝수 개수 입력 : ");
		int even = sc.nextInt();
		System.out.println("홀수 개수 입력 : ");
		int odd = sc.nextInt();

		int[] arr = new int[even + odd];

		int start = 0;				//짝수 저장할 인덱스
		int end = arr.length - 1;	//홀수 저장할 인덱스

		for (int i = 0; i < arr.length; i++) {
			System.out.print("num" + (i + 1) + " : ");
			int num = sc.nextInt();

			if (num % 2 == 0) {
				if (start < even) {
					arr[start] = num; // 인덱스 0부터 저장
					start++;
				} else i--;

			} else {
				if (end >= arr.length - odd) {
					arr[end] = num; // 배열 끝에서부터 저장
					end--;
				} else i--;
		}
	}

		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + "  ");
		}

	
	}
}
