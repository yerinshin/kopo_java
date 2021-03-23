package kr.ac.kopo.day12.inter02;

import java.util.ArrayList;
import java.util.List;


public class UserMain {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		
		TV tv = new SamsungTV();
//		tv = new LGTV();
		
		tv.powerOn();
		tv.channelDown();
		tv.soundDown();
		tv.mute();
		tv.mute();
		tv.mute();
		tv.soundUp();
		tv.powerOff();
		tv.copyright();
		
		
		
		
	}

}
