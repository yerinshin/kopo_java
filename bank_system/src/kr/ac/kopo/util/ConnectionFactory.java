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
			String url = "jdbc:oracle:thin:@192.168.217.57:1522:xe";
			String user = "hr";
			String password = "hr";
			
			conn = DriverManager.getConnection(url ,user, password);
//			System.out.println("연결성공");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return conn;
		
	}
	
}
