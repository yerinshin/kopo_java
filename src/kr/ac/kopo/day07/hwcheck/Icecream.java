package kr.ac.kopo.day07.hwcheck;

public class Icecream {

		String 	name;
		int 	price;
		
		
		void set(String n, int p) {
			name = n;
			price = p;
		}

		// 타 클래스에서 멤버변수를 직접 쓰는 것보다 메소드로 소통하는 것이 더 좋은 코드.
		// 그렇기 때문에 이름과 가격을 알려주는 메소드를 작성
		// 수정할 때 이 클래스에서만 수정하면됨. 타 클래스는 변화에 둔감하도록 --> 객체지향
		String getName() {
			return name;
		}
		
		int getPrice() {
			return price;
		}
}
