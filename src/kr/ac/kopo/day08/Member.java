package kr.ac.kopo.day08;

public class Member {
	
	String 	name;
	int 	age;
	String 	bloodType;
	
	//생성자
	Member(){
		this("알수없음"); //Member(String) 호출
	}
	
	Member(String name){
		this(name, -1); //Member(String, int)호출
	}
	
	Member (String name, int age){
		this(name, age, "알수없음");
		
	}
	
	Member (String name, int age, String bloodType){
		this.name = name;
		this.age = age;
		this.bloodType = bloodType;
	}
	
	/*
	Member(){
		this("알수없음", -1, "알수없음");
	}
	
	Member(String name){
		this(name, -1, "알수없음");
		
	//	this.name = name;  //이런경우 this생략 불가능 --> 멤버변수와 지역변수를 구분해주어야함
	// name = name : 둘다 지역변수로 인식(지역변수가 우선)
	}
	
	Member (String name, int age){
		this(name, age, "알수없음");
		
//		this.name = name;
//		this.age = age;
//		bloodType = "알수없음";
	}
	
	Member (String name, int age, String bloodType){
		this.name = name;
		this.age = age;
		this.bloodType = bloodType;
	}
	*/
	
	//메소드
	void info() {
		System.out.println("이름 : " + name+ ", 나이 : " +age+ ", 혈액형 : "+ bloodType);
	}
	
}
