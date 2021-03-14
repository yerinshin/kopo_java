package kr.ac.kopo.day05.hw;

import java.util.Random;
import java.util.Scanner;

public class HomeWork06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = 5;	//기회 개수
		int min = 1;
		int max = 100;
		
		Random r = new Random();
		int data = r.nextInt(100) +1 ;
		System.out.println(data);
		
		while(cnt>0) {
			System.out.print(min +" - "+ max + " : ");
			int ans = sc.nextInt();
			
			if(ans<data) {
				System.out.println(ans + "보다 큰 수 입니다.");
				min = min < ans ? ans : min;
				
			}else if(ans>data) {
				System.out.println(ans + "보다 작은 수 입니다.");
				max = ans < max ? ans: max;
			}else {
				System.out.println("축하합니다. 정답입니다.");
				break;
			}
			cnt--;
			System.out.println("기회는 "+cnt+"번 남았습니다.");
			System.out.println();
			
		}
		
		if(cnt==0) {
			System.out.println("아쉽습니다.. 기회를 전부 소진하셨습니다.");
			System.out.println("정답은 "+data+" 입니다.");
		}
		
	}

}
