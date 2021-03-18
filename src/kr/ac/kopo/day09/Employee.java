package kr.ac.kopo.day09;

public class Employee {
	
	//지역변수들은 인스턴스마다 하나씩 생성된다
	private String name;
	private int salary;
	private String grade;
//	int totalEmployee; 		// 그래서 각각 사원들마다 (0으로 생성)->(1로 증가)만 하게됨
	private static int totalEmployee;	// 하나만 생성해서 공유하겠다는 뜻.	

	//	static final String kind = "포유류";
	// 고치지 않을 변수에 static쓰는 이유 : 메모리 낭비를 최소화하기 위하여
	
	
	Employee() {		//기본생성자
		
		++Employee.totalEmployee;
	}
	
	Employee(String name, int salary, String grade){ 	//매개변수 3 생성자
		this.name = name;
		this.salary = salary;
		this.grade = grade;
		
		++Employee.totalEmployee; // 생성자가 실행될 때마다 사원수 ++
	}
	
	void info() {
		System.out.println("이름 : " + name + ", 연봉 : " + salary 
							+ ", 직급 : "+ salary);
		
		Employee.printTotalEmployee();
	}

	// 객체 생성 없이도 메소드를 사용할 수 있게 하기 위해 static 붙여줌
	static void printTotalEmployee() {
		
//		System.out.println("사원명 : " + name);
		//-->불가능 : static안에서 일반변수 사용x 
		
//		System.out.println("사원명 : " + this); 
		//-->this불가능 : 객체 생성 됐다는 보장이 없다. static안에서 사용 x
		
		// static 변수는 클래스명.변수명 으로 사용하는게 좋음
		System.out.println("총 사원수 : " + Employee.totalEmployee + "명");
		
		
		/*
		System.out.println("총 사원수 : " + totalEmployee + "명");
		로 써도 작동하지만 멤버변수와 구분 하기 힘듬. 
		*/
	}
	
	String getName(){
		return this.name;
	}
	
	int getSalary() {
		return salary;
	}
	
	void setSalary(int salary) {
		this.salary = salary; 
	}
	
}
