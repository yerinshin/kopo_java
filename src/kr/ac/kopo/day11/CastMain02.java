package kr.ac.kopo.day11;

public class CastMain02 {
	public static void main(String[] args) {
		
	//	Child01 c = new Parent();  ------> error! => Child의 범위 > Parent 범위 이기 때문
	
	//	Child01 c = (Child01)new Parent();  ------> 실행 시 예외 발생 => Child의 범위 > Parent 범위 이기 때문
		
		
		Parent p = new Child02(); //p는 Child02의 인스턴스객체 주소를 가르킴 (접근 범위는 Parent)
		p.info();
		
		Child02 c = (Child02)p; // Child02의 범위만큼 크니까 형변환가능
		
		c.info();  //그러므로 모두 접근 가능
		c.sing();
		c.play();
	}
}
