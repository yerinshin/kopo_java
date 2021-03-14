package kr.ac.kopo.day02.exam;

import java.util.Scanner;

public class HomeWork03 {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		System.out.print("물건 값 입력: ");
		int price = sc.nextInt();
		
		System.out.print("지불한 액수 입력 : ");
		int money = sc.nextInt();
		
		System.out.println();
		
		
		if(money >= price) {		
		
		int change = money - price ;
		int temp = change;
		
		int c1000, c500, c100, c50, c10;
		
		c1000 = temp / 1000;
		temp %= 1000;
		
		c500 = temp / 500;
		temp %= 500;
		
		c100 = temp / 100;
		temp %= 100;
		
		c50 = temp / 50;
		temp %= 50;
		
		c10 = temp / 10;
		temp %= 10;
		
		
		System.out.println("[방식 1]");
		System.out.printf(" 거스름돈 : %d \n", change);
		System.out.printf(" 1000원 : %d 개 \n", c1000);
		System.out.printf(" 500원 : %d 개 \n", c500);
		System.out.printf(" 100원 : %d 개 \n", c100);
		System.out.printf(" 50원 : %d 개 \n", c50);
		System.out.printf(" 10원 : %d 개 \n", c10);	
		
		System.out.println();
		
		System.out.println("[방식 2]");
		System.out.printf(" 거스름돈 : %d \n", change);
		if(c1000 > 0) System.out.printf(" 1000원 : %d 개 \n", c1000);
		if(c500 > 0) System.out.printf(" 500원 : %d 개 \n", c500);
		if(c100 > 0) System.out.printf(" 100원 : %d 개 \n", c100);
		if(c50 > 0) System.out.printf(" 50원 : %d 개 \n", c50);
		if(c10 > 0) System.out.printf(" 10원 : %d 개 \n", c10);	
		
		
		}else {
			System.out.printf("%d원이 부족합니다.\n", price - money);
		}
	}

}
