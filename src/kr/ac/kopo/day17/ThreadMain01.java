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
		
		//run �޼ҵ�� JVM�� �˾Ƽ� ���ÿ� �Ͼ�� ��ó�� �����Ŵ
		//�츮�� ���۽�ų Thread�� ������ (start() �޼ҵ�)
		ta.start();
		tb.start();
		
		
	}

}
