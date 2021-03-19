package kr.ac.kopo.day10;

public class ExtendsMain02 {
	public static void main(String[] args) {
		
		//사원번호가 1, 연봉 4000을 받은 홍길동 사원 객체 생성
		
		Employee e = new Employee(1, "홍길동", 4_000, "사원");
		Employee e2 = new Employee(2, "김길동", 4_200, "사원");
		Employee e3 = new Employee(3, "고길동", 4_200, "사원");
		Employee e4 = new Employee(4, "왕길동", 5_500, "팀장");
		
		Employee[] empList = {e,e2,e4};
		Manager02 m = new Manager02(100,"나캡틴", 9_000, "부장",empList);
		Manager03 m3 = new Manager03(100,"나캡틴", 9_000, "부장",empList);
		m.info();
		m3.info();
	}
}
