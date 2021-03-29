package kr.ac.kopo.study;

public interface TV {	//인터페이스는 오직 추상메소드만 가능하다. 
	
	/* public static final */ int MAX_VOLUME_SIZE = 50;
	
	int MIN_VOLUME_SIZE = 0;
	
	/* public abstract */ void powerOn();
	void powerOff();
	void channelUp();
	void channelDown();
	void soundUp();
	void soundDown();
	void mute();
	
	/*
	 * 인터페이스에서 일반 구현된 메소드를 쓰기 위해서는 default사용
	 * 원래는 추상메소드만 갖는 것이 맞다. 어쩔 수 없이 나중에 추가되는 경우에 사용ㅜ
	 */
	default void copyright() {
 		System.out.println("모든 기술은 TV협회에 귀속됩니다.");
	}
	
}
