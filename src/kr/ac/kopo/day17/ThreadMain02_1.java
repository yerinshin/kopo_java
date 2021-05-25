package kr.ac.kopo.day17;


/*
 	Thread ���� 2����
 	1. Thread Ŭ������ ��� ����
 	2. Runnable �������̽��� ��� ����

 */

class ExtendThread02 extends Thread {

	@Override
	public void run() {
		for(int i =0; i < 100; i ++) {
			System.out.println(i+1 + "��° ���� �� ���̱�...");
		}
	}
}

class ImplementThread02 implements Runnable{ //Runnable �������̽� : run() �޼ҵ常 ������ ����

	@Override
	public void run() {
		for(int i =0; i < 100; i ++) {
			System.out.println(i+1 +"��° ���� �� �����...");
		}
	}
		
}

public class ThreadMain02_1 {
	
	public static void main(String[] args) {
		
		ExtendThread02 et = new ExtendThread02();
		
		ImplementThread02 it = new ImplementThread02();
		//implementThread �� ����ü�� ����Ǵ°� �ƴ϶� thread �� runnable�� �Ű������� �־ ����
		Thread t = new Thread(it); 
		
		//������ ��������, ��/ thread Queue�� ���� ������ ����(����) A->B->A(X) , A->A->B->A->?(O)
		
		System.out.println("������ �����մϴ�.");
		
		//1��° thread
		et.start(); 
		//2��° thread
		t.start();	
		
		
		try {
			et.join(100); 	//0.1 ��ٸ��� ���� ������ runnable�� ���� ������ ���ε� ����
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("������ �����մϴ�.");
		

		}
		
	
}
