package kr.ac.kopo.day17;

import java.net.InetAddress;

public class InetAddressMain {

	public static void main(String[] args) {
		
		try {
			InetAddress localhost = InetAddress.getLocalHost();
			
			System.out.println("�� ��ǻ���� ��Ʈ��ũ �̸� : " + localhost.getHostName());
			System.out.println("�� ��ǻ���� IP �ּ� : " + localhost.getHostAddress());
			System.out.println(localhost.toString());
			
			InetAddress addr = InetAddress.getByName("www.hanati.co.kr");
			System.out.println("�ϳ�����Ƽ���� IP : " + addr.getHostAddress());
			
			InetAddress[] addrs = InetAddress.getAllByName("www.naver.com");
			System.out.println("-------------------------------------");
			System.out.println("naver IP �ּ�");
			System.out.println("-------------------------------------");
			for(InetAddress address : addrs) {
				System.out.println(address);
			}
			System.out.println("-------------------------------------");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
