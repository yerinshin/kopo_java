package kr.ac.kopo.day08;
/*
 * 생성자의 특징
 * 1. 클래스명과 동일
 * 2. 반환형이 존재하지 않음
 * 3. 디폴트 생성자를 지원
 * 4. 오버로딩 지원
 * 5. 객체의(멤버변수) 초기화가 목적
 */

class Car {
	
	//JVM이 디폴트로 만들어 내는 형태 --> Car() {  }
	Car(){
		System.out.println("Car() 생성자 호출");
	}
	
	Car(String s ){
		System.out.println("Car(String) 생성자 호출");
	}
	
	Car(int i , String s ){
		System.out.println("Car(int, String) 생성자 호출");
	}
	
	void Car() {
		System.out.println("일반 메소드 Car() 호출...");
	}
}

public class ConstructorMain01 {
	public static void main(String[] args) {
		
		Car c = new Car();
		Car c2 = new Car("소나타");
		Car c3 = new Car(1000, "모닝");
		
		c.Car();
	}
}
