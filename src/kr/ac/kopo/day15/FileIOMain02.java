package kr.ac.kopo.day15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 	iodata/dog.jpg -> iodata/dog2.jpg 
 * dog.jpg :입력장치 , dog2.jpg : 출력장치
 * 
 * 작업순서
 * 1. stream open
 * 2. read/write
 * 3. stream close
 */

public class FileIOMain02 {

	public static void main(String[] args){
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			
			long start = System.currentTimeMillis();
			
			
		// 1. stream open
			 fis = new FileInputStream("iodata/dog.png");
			 fos = new FileOutputStream("iodata/dog2.png");
			
		// 2. read/write
			while(true) {
				int c = fis.read();
				if(c == -1) break;
				fos.write(c);
			}
			
			long end = System.currentTimeMillis();
			System.out.println("복사완료...");
			System.out.println("소요시간 : " + (end - start)/1000. + "초");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//3. stram close : 프로그램 종료전까지는 lock걸려있음 -> 외부에서 생성된 파일 접근 불가
			//자원을 해제하는 코드는 finally에 써줘야함
			try {
				fis.close();
			} catch (IOException e) {	
				e.printStackTrace();
			}
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
