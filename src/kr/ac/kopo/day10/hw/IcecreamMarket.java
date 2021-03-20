package kr.ac.kopo.day10.hw;

import java.util.Scanner;

public class IcecreamMarket {
	Scanner sc = new Scanner(System.in);

	private int cnt = 0;
	private int totalNum = 0;
	private int totalPrice = 0;

	public int inputInt(String msg) {
		System.out.print(msg);
		int num = sc.nextInt();
		sc.nextLine();
		return num;
	}

	public String inputStr(String msg) {
		System.out.print(msg);
		String str = sc.nextLine();
		return str;
	}

	public void buyIcecream() {
		buy();
		print();
	}

	public void buy() {
		boolean bool = true;

		while (bool) {
			Icecream[] iceList;
			Icecream ice = new Icecream();

			int num = inputInt("아이스크림 몇개 구입할래 ? : ");
			iceList = new Icecream[num];
			for (int i = 0; i < num; i++) {
				System.out.println((i + 1) + "번");
				String name = inputStr("아이스크림 명 : ");
				int price = inputInt("아이스크림 가격 : ");
				totalPrice += price;

				ice = new Icecream(name, price);
				iceList[i] = ice;
			}
			cnt++;
			totalNum += num;
			char ch = inputStr("계속 구매할래 ? (Y/N) ").charAt(0);

			if (ch == 'N') {
				bool = false;
			}
		}
	}

	public void print() {

		System.out.println("총 " + cnt + "명의 고객이 아이스크림을 구매했습니다.");
		System.out.println("판매된 아이스크림 총 개수 : " + totalNum);
		System.out.println("총 판매액 : " + totalPrice);
	}

}
