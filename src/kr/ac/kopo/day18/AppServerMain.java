package kr.ac.kopo.day18;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class AppServerMain {

	public static void main(String[] args) {
		
		try {
			
			ServerSocket server = new ServerSocket(10000); //개발자는 10000이후로 사용
			System.out.println("어플리케이션 서버 실행...");
			
			//accept()메소드 없으면 terminate(종료)됨
			Socket client = server.accept(); 
			
			//나한테 접속한 client 누군지 알고싶음 
			System.out.println("연결된 클라이언트 정보 : " + client);
			// Socket[addr=/127.0.0.1,port=51704  (----> 소켓 연결하는 포트 ) ,localport=10000]
			
			//data전송
			String msg = "접속을 환영합니다";
			OutputStream os = client.getOutputStream(); //int type 만 가능해서 filter class써주어야함
			DataOutputStream dos = new DataOutputStream(os); //filter 클래스
			
			dos.writeUTF(msg); 
			dos.flush();
			
			//연결 해제
			client.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
