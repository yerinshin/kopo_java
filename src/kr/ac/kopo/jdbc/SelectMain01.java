package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectMain01 {
	
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			//1단계
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2단계
			String url = "jdbc:oracle:thin:@192.168.119.119:1521:dink";
			String user = "scott";
			String password = "tiger";
			
			conn = DriverManager.getConnection(url ,user, password);
//			System.out.println("접속 성공");
			
			//3단계 : 실행 객체
			String sql = "select * from t_test ";
			pstmt = conn.prepareStatement(sql);
			
			//4단계
			ResultSet rs = pstmt.executeQuery();
			
			
			 //rs.next() 리턴값 : boolean -> 값이 있으면 true, 없으면 false
			while(rs.next()) { //rs.next() 가 false일때까지 반복
 				String id = rs.getString("id");
 				String name = rs.getString("name");
 				System.out.println("id : " + id + ", name : " + name);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			if(conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
