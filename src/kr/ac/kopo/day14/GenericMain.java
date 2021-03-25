package kr.ac.kopo.day14;

import java.util.Random;

class A {
	private Object obj;
	
	public A(Object obj) {
		this.obj = obj;
	}
	
	public void setObj(Object obj) {
		this.obj = obj;
	}
	
	public Object getObj() {
		return this.obj;
	}
	
	public void info() {
		System.out.println("obj : " + obj);
	}
}

class B<T> {//B에 어떤 타입(T)가 들어가는지 명시
//	private Object obj;
	private T obj;
	
	public B(T obj) {
		this.obj = obj;
	}
	
	public void setObj(T obj) {
		this.obj = obj;
	}
	
	public T getObj() {
		return this.obj;
	}
	
	public void info() {
		System.out.println("obj : " + obj);
	}
}

public class GenericMain {

	public static void main(String[] args) {
		
		B<String> b01 = new B<String>(new String("Hello"));
		B<Random> b02 = new B<Random>(new Random());
		
		b01.info();
		b02.info();
		
		//묵시적, 명시적 변환 필요없음. 이미 b01.getObj()는 이미 String형 
		System.out.println("길이 : " + b01.getObj().length());
		
	// b01 = new B<Random>(new Random); -->b01은 String값이기 때문에 컴파일 오류 발생
	
		System.out.println("-------------------------------------------------");
		A a01 = new A(new String("hello"));
		A a02 = new A(new Random());
		
		a01.info();
		a02.info();
		
//		System.out.println("길이 : " + a01.getObj().length()); --> a01.getObject형은 Object형
		System.out.println("길이 : " + ((String)a01.getObj()).length()); //명시적 형변환
		
		System.out.println("난수 : " + ((Random)a02.getObj()).nextInt()); 
	
		A[] arr = new A[2];
		arr[0] = a01;
		arr[1] = a02;
		 
	}

}
