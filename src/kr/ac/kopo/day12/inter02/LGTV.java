package kr.ac.kopo.day12.inter02;

public class LGTV implements TV {
	public LGTV() {
		System.out.println("LG TV 구매 완료 ...");
	}
	
	@Override
	public void powerOn() {
		System.out.println("LG TV On..");

	}

	@Override
	public void powerOff() {
		System.out.println("LG TV Off..");

	}

	@Override
	public void channelUp() {
		System.out.println("channel UP...");

	}

	@Override
	public void channelDown() {
		System.out.println("channel Down...");

	}

	@Override
	public void soundUp() {
		System.out.println("sound Up...");

	}

	@Override
	public void soundDown() {
		System.out.println("sound Down...");

	}

	@Override
	public void mute() {
		System.out.println("음소거..");

	}

}
