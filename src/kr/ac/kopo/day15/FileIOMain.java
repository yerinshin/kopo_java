package kr.ac.kopo.day15;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import kr.ac.kopo.util.FileClose;

public class FileIOMain {
	
	public static void write() {
		char c = 'A';
		int i = 10;
		double d = 12.34;
		
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		try {
			fos = new FileOutputStream("iodata/test.dat");
			dos = new DataOutputStream(fos);
			
			dos.writeChar(c);
			dos.writeInt(i);
			dos.writeDouble(d);
			
			System.out.println("쓰기완료..");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(dos);
			FileClose.close(fos);
		}
	}
	
	public static void read() {
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try {
			fis = new FileInputStream("iodata/test.dat");
			dis = new DataInputStream(fis);
			
			char c = dis.readChar();
			int i = dis.readInt();
			double d = dis.readDouble();
			
			//파일에 저장한 순서를 알고 있어야 읽어올 수 있음
			System.out.println("읽어온 데이터 출력");
			System.out.println("문자 : " + c);
			System.out.println("정수 : " + i);
			System.out.println("실수 : " + d);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(dis, fis);
		}
	}
	
	
	public static void main(String[] args) {
		
		read();		//읽어오기
		
		//write(); //파일 저장 완료

	}

}
