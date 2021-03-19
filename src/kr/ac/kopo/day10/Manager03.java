package kr.ac.kopo.day10;

//관리자 클래스
public class Manager03 extends Employee{
	
	Employee[] 	empList; 	//관리사원 목록
	
	
	//생성자
	Manager03(int no, String name, int salary, String grade, Employee[] empList){ 		
		
		super(no, name, salary, grade); //매개변수 있는 생성자 호출해서 초기화 할 수 있게 함. 이럼으로써 super()는 자동호출 되지 않음 .
		this.empList = empList;
		
	}
	
	
	
	@Override      //오버라이딩 주석 -> error체크도 함
	void info() {
		
		super.info();		//내 클래스 안에 info존재할 경우, 부모클래스의 info사용하고 싶을 때는 꼭 super라고 명시
		
		System.out.println("=======================================================");
		System.out.println("\t관리사원 목록");
		System.out.println("=======================================================");
		for(Employee e : empList) {
			e.info();
		}
		System.out.println("=======================================================");
		
	
		
		
	}
	
}
