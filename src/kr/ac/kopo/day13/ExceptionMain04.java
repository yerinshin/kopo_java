package kr.ac.kopo.day13;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionMain04 {
	public static void main(String[] args) {
		
//		FileReader fr = new FileReader("a.txt"); 	//checked exception(컴파일 시점의 예외처리)
		
	
		
		
		try {
			FileReader fr = new FileReader("a.txt");
		}catch(FileNotFoundException fnfe) {
			try {
				FileWriter fw = new FileWriter("error.log");
			}catch(IOException ie){
				ie.printStackTrace();
			}
			
			
		}
	}
}