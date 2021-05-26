package kr.ac.kopo.day17;


/*
 	Thread 구성 2가지
 	1. Thread 클래스를 상속 구현
 	2. Runnable 인터페이스를 상속 구현

 */

class ExtendThread extends Thread {

	@Override
	public void run() {
		for(int i =0; i < 100; i ++) {
			System.out.println(i+1 + "번째 인형 눈 붙이기...");
		}
	}
}

class ImplementThread implements Runnable{ //Runnable 인터페이스 : run() 메소드만 가지고 있음

	@Override
	public void run() {
		for(int i =0; i < 100; i ++) {
			System.out.println(i+1 +"번째 인형 코 만들기...");
		}
	}
		
}

public class ThreadMain02 {
	
	public static void main(String[] args) {
		
		ExtendThread et = new ExtendThread();
		
		ImplementThread it = new ImplementThread();
		//implementThread 는 그자체로 실행되는게 아니라 thread 에 runnable을 매개변수로 넣어서 실행
		Thread t = new Thread(it); 
		
		//누구로 시작할지, 모름/ thread Queue로 들어가는 것조차 경쟁(랜덤) A->B->A(X) , A->A->B->A->?(O)
		
		
		//1번째 thread
		et.start(); 
		
		//2번째 thread
		t.start();	
		
		//System.out.println(Thread.activeCount()); //thread 개수 : 3
		
		//3번째 thread (main함수)
		for(int i =0; i < 100; i++) {			
			System.out.println(i+1 + "번째 감독중...");
		}
		
	}
}
