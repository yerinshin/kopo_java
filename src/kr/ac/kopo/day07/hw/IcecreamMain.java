package kr.ac.kopo.day07.hw;

public class IcecreamMain {

	public static void main(String[] args) {
		
		Icecream ice = new Icecream();
		
		int num = ice.getNum("아이스크림 몇 개 구입할꺼야 ? : ");
		
		Icecream[] iceArr = ice.getIcecream(num);
		ice.printList(iceArr);
		

	}

}

