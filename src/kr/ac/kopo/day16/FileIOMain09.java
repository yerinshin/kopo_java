package kr.ac.kopo.day16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import kr.ac.kopo.util.FileClose;

public class FileIOMain09 {

	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			
			fr = new FileReader("iodata/FileIOMain03.java");
			fw = new FileWriter("iodata/FileIOMain03_2.java.txt");
			
			
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			
			while(true) {
				String data = br.readLine();
				if(data == null) break;
				bw.write(data);
				//bw.write('\n');
				//bw.write('\r\n'); --> os 마다 줄바꿈이 다르다. : newLine() 을 사용하는게 편함
				bw.newLine();
			}
			
			bw.flush();
			System.out.println("파일 복사를 완료하였습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			FileClose.close(br, bw);
			FileClose.close(fr, fw);
		}

	}

}
