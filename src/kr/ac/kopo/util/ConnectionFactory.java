package kr.ac.kopo.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	
	public Connection getConnection() { //return type : Connection
		
		Connection conn = null;
		
		try {
			//1단계
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2단계
			String url = "jdbc:oracle:thin:@192.168.119.119:1521:dink";
			String user = "scott";
			String password = "tiger";
			
			conn = DriverManager.getConnection(url ,user, password);
	//		System.out.println("접속 성공");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return conn;
		
	}
	
}
