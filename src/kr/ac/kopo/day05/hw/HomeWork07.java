package kr.ac.kopo.day05.hw;

import java.util.Random;
import java.util.Scanner;

public class HomeWork07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt =5;
		int min = 1;
		int max = 100;
		
		System.out.print("사용자가 생각하는 숫자 입력 : "); //컴퓨터가 맞춰야 하는 숫자
		int data = sc.nextInt(); 
		
		Random r = new Random();
	
		while(cnt>0) {
			System.out.print(min +" - "+ max + " : ");
			int ans = r.nextInt(max-min) +min +1 ; //최소 최대 범위 설정하기
			System.out.print("사용자가 생각하는 숫자가 [ " + ans + " ]입니까? "
					+ "(맞으면 0, 작은 수면 1, 큰 수면 2) ==> ");
			
			int num = sc.nextInt();
			
			
			if(num ==  2 ) {
				System.out.println(ans + "보다 큰 수 입니다.");
				min = min < ans ? ans : min;
				
			}else if( num == 1) {
				System.out.println(ans + "보다 작은 수 입니다.");
				max = ans < max ? ans: max;
			}else if(num ==0){
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

