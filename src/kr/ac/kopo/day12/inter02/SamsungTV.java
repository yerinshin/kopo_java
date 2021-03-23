package kr.ac.kopo.day12.inter02;

public class SamsungTV implements TV{
	
	private String modelName;
	private boolean power;
	private int volumeSize;
	private int channelNo;
	private boolean muteToggle;
	private int currentVolumeSize;
	
	
	public SamsungTV() {
		System.out.println("삼성TV 구매 완료 ...");
		modelName = "삼성TV";
		power = false;
		volumeSize =10;
		channelNo = 3;
		muteToggle = false; //디폴트도 false..안써도 된다.
		
	}

	@Override
	public void powerOn() {
		power = true;
		System.out.println("삼성 TV On");
		info();
		
	}

	@Override
	public void powerOff() {
		power = false;
		System.out.println("삼성 TV Off");
		
	}

	@Override
	public void channelUp() {
		System.out.println("channel UP");
		channelNo = ++channelNo % 101;
		info();
	}

	@Override
	public void channelDown() {
		System.out.println("channel Down");
		channelNo--;
		if(channelNo ==0) {
			channelNo=100; //max 채널번호
		}
		info();
	}

	@Override
	public void soundUp() {
		System.out.println("sound Up");
		if(muteToggle) {
			volumeSize = currentVolumeSize;
			muteToggle = false;
		}
		
		if(volumeSize < TV.MAX_VOLUME_SIZE)
			volumeSize++;
		info();
	}

	@Override
	public void soundDown() {
		System.out.println("sound Down");
		if(volumeSize > TV.MIN_VOLUME_SIZE)
			volumeSize--;
		info();
	}

	@Override
	public void mute() {
		if(muteToggle) {
			System.out.println("음소거 해제");
			volumeSize = currentVolumeSize;
		}else {
			currentVolumeSize = volumeSize;
			
			System.out.println("음소거 중...");
			volumeSize = TV.MIN_VOLUME_SIZE;
		}
		
		muteToggle = !muteToggle;
		
//		volumeSize = TV.MIN_VOLUME_SIZE;
		info();
	}
	
	private void info() {
		System.out.println("채널번호 : " + channelNo + ", 음량 크기 : "+ volumeSize);
		System.out.println();
	}



	
}
