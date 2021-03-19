package kr.ac.kopo.day10;

//관리자 클래스
public class Manager02 extends Employee{
	
	Employee[] 	empList; 	//관리사원 목록

	Manager02(int no, String name, int salary, String grade, Employee[] empList){
		
		this.no =no;			// 내 클래스(자식클래스) 안에 no가 없기 때문에 this 라고 써도 super의 no에 접근
		this.name = name;
		this.salary = salary;
		this.grade = grade;
		this.empList = empList;
		
	}
	
	@Override      //오버라이딩 주석 -> error체크도 함
	void info() {
		
		super.info();		//내 클래스 안에 info존재할 경우, 부모클래스의 info사용하고 싶을 때는 꼭 super라고 명시
		
//		System.out.println("사원번호 : " +no+ ", 사원명 : " + name 
//				+ ", 연봉 : " + salary +", 직급 : "+ grade);
		System.out.println("=======================================================");
		System.out.println("\t관리사원 목록");
		System.out.println("=======================================================");
		for(Employee e : empList) {
			e.info();
		}
		System.out.println("=======================================================");
		
		
		
		
		
		
		
		
	}
	
}
