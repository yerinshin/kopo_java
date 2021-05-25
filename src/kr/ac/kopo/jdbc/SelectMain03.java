package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.ac.kopo.util.ConnectionFactory;

class Test implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("close()...");
	}
	
}



public class SelectMain03 {
	
	
	public static void main(String[] args) {
		
		//String은 AutoCloseable 인터페이스 상속 받지 않아서 try()문 밖에 있어야한다.
		String sql = "select * from t_test"; 
		
		
		//1.7버전 이후 try
		try (
				
				/*
				autoCloseable 클래스 상속 받았기 때문에 사용가능
				자동으로 close 메소드 호출 -> close 때문에 finally 사용할 필요 없음
				Test t = new Test();    
				*/
				 
				//Connection 객체는 AutoCloseable인터페이스 상속 하고 있음
				//Connection 객체 자동 close
				Connection conn = new ConnectionFactory().getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				 
		){
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				System.out.println("id : " + id + ", name : " + name);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
