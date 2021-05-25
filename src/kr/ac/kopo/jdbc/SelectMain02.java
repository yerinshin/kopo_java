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
			
			
			//ConnectionFactory�� �ν��Ͻ� ��ü�� ��ȸ������ ����ϱ�
			conn = new ConnectionFactory().getConnection(); 
			
			
			//3�ܰ� : ���� ��ü
			String sql = "select * from t_test ";
			pstmt = conn.prepareStatement(sql);
			
			//4�ܰ�
			ResultSet rs = pstmt.executeQuery();
			
			
			 //rs.next() ���ϰ� : boolean -> ���� ������ true, ������ false
			while(rs.next()) { //rs.next() �� false�϶����� �ݺ�
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
