package kr.ac.kopo.day12;

import java.util.Random;

/*final*/ class Super {
	
	private final int MAX = 100;
	
	public /* final */ void info() {
		System.out.println("Super 클래스에서 정의된 메소드...");
	}
}

class Sub extends Super {
	public void info() {
		System.out.println("Sub 클래스에서 재정의된 메소드...");
//		MAX =50;   --> final 변수 재할당 할 수 없음. 오류남
	}
	
}

class MyRandom extends Random{
	/**
	 *  bound가 10일 때 1 ~ 10 사이의 난수 추출
	 *  @param bound 난수 범위
	 *  @return 1 ~ bound 사이의 난수
	 */
	@Override
	public int nextInt(int bound) {
		// TODO Auto-generated method stub
		return super.nextInt(bound) + 1;
	}
	
}

/*
class MyString extends String{    -----------> String 클래스는 final이기 때문에 상속 받을 수 없음 
	
}
*/
 
public class FinalMain {

	public static void main(String[] args) {
		/*
		 *  1 ~ 100 사이의 난수를 발생시켜 출력하는 코드를 작성
		 */
		Random r = new MyRandom();
		int random = r.nextInt(100);
		System.out.println("추출된 정수 : " + random);
		
	}

}
