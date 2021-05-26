package kr.ac.kopo.day18;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoClientMain {

	public static void main(String[] args) {
		
		try {
			
			Socket socket = new Socket("192.168.217.57", 10001);
			
			//키보드로 입력 받을 객체
//			Scanner keyboard = new Scanner(System.in);
			BufferedReader keyboard 
					= new BufferedReader(new InputStreamReader(System.in)); //BufferedReader : 속도 빠르게 / InputStreamReader : 키보드 입력받기
			
			//클라이언트가 (키보드로 입력받은 데이터를) 서버에게 데이터 전달 객체
			OutputStream os = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			PrintWriter pw = new PrintWriter(osw); //속도빠르게 하기위해 BufferedWriter 그러나, PrintWriter가 대체 가능 (print, println 쓰기 위해서) 
			
			//서버에서 재전송한 데이터를 수신 객체
			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);   //pw로 보낸거 받기
			BufferedReader br = new BufferedReader(isr);		// 속도 빠르게 
			
			while(true) {
			System.out.print("메세지를 입력 : ");
			String msg = keyboard.readLine();  //readLine() 으로 하나의 메세지 입력 받음
			
			if(msg.equalsIgnoreCase("quit")) {
				System.out.println("서버연결을 종료합니다.");
				socket.close();
				break;
			}
			
//			pw.write(msg); //서버에 메세지 전달
//			pw.write('\n');
			
			pw.println(msg);
			pw.flush();
			
			String echoMsg = br.readLine();
			System.out.println("서버에서 전송한 메세지 : " + echoMsg);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
