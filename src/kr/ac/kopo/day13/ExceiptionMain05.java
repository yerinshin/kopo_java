package kr.ac.kopo.day13;

import java.io.FileReader;

public class ExceiptionMain05 {
	
//----------------------------------------------------------------------
abstract static class Parent{
	public abstract void print();
	public abstract void scan() throws Exception;
}
	
	
static class Child extends Parent{

	@Override
	public void print() {
		
	}

	@Override
	public void scan() throws Exception  {
		
	}
	
}
//-------------------------------------------------------------------	
	
public static void main(String[] args) throws Exception{
	
		Child obj = new Child();
		obj.print();
		//obj.scan();
		try {
			obj.scan();
		}catch(Exception e) {
			
		}
	
		b();
		
		/*
		try {
			b();
		}catch(Exception e) {
			System.out.println("main() 예외처리...");
			e.printStackTrace();
		}
		*/
		
//		a();
}
	
	
public static void b() throws Exception {
	System.out.println("b() 메소드 호출...");
	String str = null;
	System.out.println(str.charAt(0));
	System.out.println(1 / 0);
}
	
	
public static void a() {
	System.out.println("a() 메소드 호출 ... ");
		
	try {
		FileReader fr = new FileReader("a.txt");	
	}catch(Exception e) {
		e.printStackTrace();
	}
		
	}
}
