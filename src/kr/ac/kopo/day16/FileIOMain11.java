package kr.ac.kopo.day16;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileIOMain11 {

	
	public static void write() throws Exception {
		UserInfo user = new UserInfo("홍길동", 25, "서울시 서초구");
		
		FileOutputStream fos = new FileOutputStream("iodata/objectData.txt");  //ObjectOutputStream : 바이트 스트림의 필터 스트림 -> FileWriter (x) FileOutputStream(o)
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(user);
		oos.flush();
		
		System.out.println("objectData.txt 저장완료");
	}
	
	public static void read() throws Exception {
		
		FileInputStream fis = new FileInputStream("iodata/objectData.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		UserInfo user = (UserInfo)ois.readObject();  //UserInfo 객체 형태이므로 형변환
		System.out.println("파일 로드 완료 ...");
		System.out.println(user);
	}
	
	
	public static void main(String[] args) {
		
		try {
			write();
			read();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}