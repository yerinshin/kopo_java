package kr.ac.kopo.day17;

class AAA extends Thread {
	
	@Override
	public void run() {
		while(true)
			System.out.println("go!!!!");
	}
}


class BBB extends Thread {
	
	@Override
	public void run() {
		while(true)
			System.out.println("\t stop!!!!");
	}
}


public class ThreadMain01 {

	public static void main(String[] args) {
		
		AAA ta = new AAA();
		BBB tb = new BBB();
		
		//run 메소드는 JVM이 알아서 동시에 일어나는 것처럼 실행시킴
		//우리는 시작시킬 Thread만 정해줌 (start() 메소드)
		ta.start();
		tb.start();
		
		
	}

}
