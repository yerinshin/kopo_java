package kr.ac.kopo.day16;

import java.io.Serializable;

/*
  	alt + shift + s 누른 후   c 선택 :  기본 생성자 만들어짐 
 							o 선택 :  매개변수를 가지는 생성자
 							r 선택 : getter/setter 메소드
 							v 선택 : override
 							s 선택 : toString() 메소드 오버라이드
 */

public class UserInfo implements Serializable {  //object 형태로 read, write하기위해 serialize
	
	private String name;
	private transient int age; 	//transient : 객체 직렬화 할 때 age라는 값은 빼겠다는 뜻 ---> age=0 나옴
	private String addr;

	
	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public UserInfo(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getAddr() {
		return addr;
	}
	
	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "UserInfo [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}
	
}
