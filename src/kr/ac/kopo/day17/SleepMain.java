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
			System.out.println("현재 시간 : " + new Date().toLocaleString());
		}
	}
}

public class SleepMain {

	public static void main(String[] args) {
	
		
		TimeThread tt = new TimeThread();
		tt.start();
		
		while(true) {
			System.out.println("go!!!!");
			
			//tt가 sleep에 있다가 돌아오려고 해도 계속 반복하고 있는 thread (go!!!)가 있으면 
			//다시 돌아오지를 못함. 잠깐이라도 다른 thread를 멈춰주어야함
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		
		/*
		System.out.println("Thread가 2초동안 잠이 들겠습니다.");
		
		try {
			Thread.sleep(2000);            //Block으로 갔다가 2초 후 빠져 나와서 Runnable로
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("Thread가 깨어났습니다.");
		*/
		
	}

}
