package kr.ac.kopo.day12.inter01;

public class UserMain {

	public static void main(String[] args) {
		
		SamsungTV sam = new SamsungTV();
		
		sam.powerOn();
		sam.VolumeDown();
		sam.channelUp();
		sam.channelDown();
		sam.volumeUp();
		sam.powerOff();
		
		LGTV lg = new LGTV();
		lg.turnOn();
		lg.soundDown();
		lg.channelUp();
		lg.channelDown();
		lg.soundUp();
		lg.turnOff();

	}

}
