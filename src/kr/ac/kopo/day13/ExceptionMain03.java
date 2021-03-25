package kr.ac.kopo.day13;

public class ExceptionMain03 {

	public static void main(String[] args) {
		
		System.out.println("main start...");
		
		for(int i = -2; i< 3; i ++) {
			System.out.println(i + "번째 반복문 수행중...");
			try{
				System.out.println(10 / i);
			}catch(ArithmeticException ae) {
				System.out.println("예외 발생...");
				break;
			} finally {	//break로 나가면서도 finally 의 문장은 수행된다.
				System.out.println("반복문 수행중..."); 	
			}
		}
		
		System.out.println("main end ...");
	}

}
