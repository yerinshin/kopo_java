package kr.ac.kopo.day17;

import java.util.Date;

class TimeThread extends Thread{
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("���� �ð� : " + new Date().toLocaleString());
		}
	}
}

public class SleepMain {

	public static void main(String[] args) {
	
		
		TimeThread tt = new TimeThread();
		tt.start();
		
		while(true) {
			System.out.println("go!!!!");
			
			//tt�� sleep�� �ִٰ� ���ƿ����� �ص� ��� �ݺ��ϰ� �ִ� thread (go!!!)�� ������ 
			//�ٽ� ���ƿ����� ����. ����̶� �ٸ� thread�� �����־����
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		
		/*
		System.out.println("Thread�� 2�ʵ��� ���� ��ڽ��ϴ�.");
		
		try {
			Thread.sleep(2000);            //Block���� ���ٰ� 2�� �� ���� ���ͼ� Runnable��
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("Thread�� ������ϴ�.");
		*/
		
	}

}
