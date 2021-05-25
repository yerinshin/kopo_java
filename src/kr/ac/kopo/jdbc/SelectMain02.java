package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.ac.kopo.util.ConnectionFactory;
import kr.ac.kopo.util.JDBCClose;

public class SelectMain02 {
	
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			
//			ConnectionFactory factory = new ConnectionFactory();
//			conn = factory.getConnection();
			
			
			//ConnectionFactory의 인스턴스 객체를 일회용으로 사용하기
			conn = new ConnectionFactory().getConnection(); 
			
			
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
			
			JDBCClose.close(conn, pstmt);	
		
		}
	}
}
