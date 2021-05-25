package kr.ac.kopo.day17;


/*
 	Thread ���� 2����
 	1. Thread Ŭ������ ��� ����
 	2. Runnable �������̽��� ��� ����

 */

class ExtendThread extends Thread {

	@Override
	public void run() {
		for(int i =0; i < 100; i ++) {
			System.out.println(i+1 + "��° ���� �� ���̱�...");
		}
	}
}

class ImplementThread implements Runnable{ //Runnable �������̽� : run() �޼ҵ常 ������ ����

	@Override
	public void run() {
		for(int i =0; i < 100; i ++) {
			System.out.println(i+1 +"��° ���� �� �����...");
		}
	}
		
}

public class ThreadMain02 {
	
	public static void main(String[] args) {
		
		ExtendThread et = new ExtendThread();
		
		ImplementThread it = new ImplementThread();
		//implementThread �� ����ü�� ����Ǵ°� �ƴ϶� thread �� runnable�� �Ű������� �־ ����
		Thread t = new Thread(it); 
		
		//������ ��������, ��/ thread Queue�� ���� ������ ����(����) A->B->A(X) , A->A->B->A->?(O)
		
		
		
		
		
		//1��° thread
		et.start(); 
		
		//2��° thread
		t.start();	
		
		//System.out.println(Thread.activeCount()); //thread ���� : 3
		
		//3��° thread (main�Լ�)
		for(int i =0; i < 100; i++) {			
			System.out.println(i+1 + "��° ������...");
		}
		
	}
}
