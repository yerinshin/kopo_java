package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/*
  	 JDBC 작업 순서
  	 1. 드라이버 로딩
  	 2. DB 접속 후 연결 객체 얻기
  	 3. SQL문 실행할 객체 얻기
  	 4. SQL문 실행 및 결과 얻기
	 5. DB접속 해제
	 //내부적으로 다 IO사용하고 있는중..!!!
	 
 */



public class InsertMain03 {
	
	public static void main(String[] args) {
		
		//내부적으로 io 이기 때문에 꼭 닫아주어야 한다. (접속을 끊는 메소드 : close 메소드 사용)
		//finally에서 close 
		
		Connection conn = null;
//		Statement stmt = null;
		PreparedStatement pstmt = null;
		Scanner sc = new Scanner(System.in);  //키보드라는 외부장치 사용 -> 원래 Scanner 도 io
											  //그래서 sc.close() 같이 써야한다. 원래
		
		
		try {
		
			//1단계 : jdbc 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공...");
			
			//2단계 : db연결 후 Connection 객체 얻기
			String url = "jdbc:oracle:thin:@192.168.119.119:1521:dink";
			String user		= "scott";
			String password	= "tiger";
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("conn : " + conn);
			
			System.out.println("아이디를 입력 : ");
			String id = sc.nextLine();
			
			System.out.println("이름을 입력 : ");
			String name = sc.nextLine();
		
			
			//3단계 : SQL 실행 객체 얻어오기
			String sql = "insert into t_test(id, name) ";
				   sql += " values(?, ?) ";
				   
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);  //첫번째 ? 에 'id' 들어감 (setString이므로 작은따옴표 자동들어감)
			pstmt.setString(2, name);
				   
			//4단계 : SQL 실행 및 결과 얻기
			int cnt = pstmt.executeUpdate(); 
			System.out.println(cnt + "개 행 삽입");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			if(pstmt != null) {    	//statement close
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			if(conn != null) {		// connection close
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
