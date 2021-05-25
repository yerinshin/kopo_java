package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBTestMain {
	
	public static void main(String[] args) {
		
		try {
			
			//1�ܰ� : JDBC ����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε� ����...");
			
			//2�ܰ� : DB ���� �� ���ᰴü ���
			Connection conn = DriverManager.getConnection(
									"jdbc:oracle:thin:@192.168.119.119:1521:dink", 
									"scott", 
									"tiger");
			
			System.out.println("DB ���� ���� : " + conn);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
