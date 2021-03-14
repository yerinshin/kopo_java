package kr.ac.kopo.day04.hw;

import java.util.Scanner;

public class HomeWork04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		int cnt = 0;

		if (num < 2) {
			System.out.printf("%d는 소수가 아닙니다.", num);
		} else {
			for (int i = 2; i < num / 2; i++) {

				if (num % i == 0) {
					cnt++;
					break;
				}
			}
		}
		System.out.print(cnt == 0 ? num + "은 소수입니다." : num + "은 소수가 아닙니다.");

		
		
		/* [방법 2] boolean형 쓰기
		 * 
		  System.out.print("정수를 입력하세요 : "); 
		  int num = sc.nextInt(); 
		  boolean bool = true;
		  
		  if (num < 2) { System.out.printf("%d는 소수가 아닙니다.", num); 
		  }else { 
		  for (int i =2; i < num / 2; i++) {
		   	if (num % i == 0) { 
		   	bool = false; 
		   	break; 
		   	} 
		   	} 
		   }
		  
		  if(bool) { //bool 이 true라면 
		  		System.out.println(num + "은 소수입니다."); 
		  }else {
		 		System.out.println(num + "은 소수가 아닙니다."); 
		  }
		  
		 */
		

		/* [방법 3] while 문 쓰기
		 * 
		 * 
		  int i =2 ; 
		  while( i <= num-1 && num % i != 0){ 
		  		i++; 
		  }
		  
		  if( i == num) { 
		  System.out.println(num + "은 소수입니다."); 
		  }else {
		  		System.out.println(num + "은 소수가 아닙니다."); 
		  	}
		  
		 */

	}

}
