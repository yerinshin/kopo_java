package kr.ac.kopo.day15;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileIOMain01 {

	public static void main(String[] args) throws Exception{
		
		 System.out.println("입력을 하세요. ctrl+z 을 누르면 종료합니다.");
		
		 InputStream is = System.in;
		 
		 //byte로 들어오는 데이터를 문자stream으로 읽어서 쓸거야 -->한글 쓰기위해
		 InputStreamReader isr = new InputStreamReader(is);
		 
		 try { //예외처리
			 while(true) {
				 int c = isr.read();
				 if(c== -1) break;
				 System.out.print((char)c);
			 }
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		 
		 /*
		 InputStream is = System.in;
		 while(true) {
			 int c = is.read();
			 if(c ==-1) break;
			 System.out.print((char)c);
		 }
		  */
	}

}
