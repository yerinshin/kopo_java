package kr.ac.kopo.service;

public class BoardSequence {
	
	private static int no = 1;
	
	public static synchronized int getNo() {  //혹시나 no가 다중스레드로 인해 나중에 증가되는 것을 막기 위해서 synchronized(동기화) 걸기
		return BoardSequence.no++;
	}
	
}
