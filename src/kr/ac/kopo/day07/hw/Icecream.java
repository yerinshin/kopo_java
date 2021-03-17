package kr.ac.kopo.day07.hw;

import java.util.Scanner;

public class Icecream {
	
	Scanner sc = new Scanner(System.in);

	String 	name ;
	int		price; 
	

	
	int getNum(String msg) {
		System.out.print(msg);
		int num = sc.nextInt();
		sc.nextLine();
		return num;
	}
	
	String getName(String msg) {
		System.out.print(msg);
		String str = sc.nextLine();
		return str;
	}
	
	
	Icecream[] getIcecream(int num) {
			Icecream[] iceArr = new Icecream[num];
		
			for(int i =0; i<num; i++) {
			iceArr[i] = new Icecream();
			
			System.out.println("\n***"+ (i+1) +"번째 아이스크림 구매 정보 입력  ***");
			iceArr[i].name = getName("아이스크림 명 : ");
			iceArr[i].price = getNum("아이스크림 가격 : ");
			
		}
			return iceArr;
	}
	
	
	/**
	 * 아이스크림 출력
	 * @param iceArr
	 */
	void printList(Icecream[] iceArr){
		System.out.println("\n<총  " + iceArr.length + "개의 아이스크림 구매정보 출력 >");
		System.out.println("번호   아이스크림명   아이스크림가격");	
		for( int i =0; i<iceArr.length; i++) {
			System.out.println(i+1  + "  \t" + iceArr[i].name
								+ "  \t" +  iceArr[i].price);
		
		}
		
	}
}
