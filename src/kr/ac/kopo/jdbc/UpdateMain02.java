package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
//StringBuilder 사용


/*
 	수정할 아이디를 입력 : hong
 	수정할 이름을 입력 : 홍길순      (홍길동 -> 홍길순)
 */


// 1,2,5 단계는 바뀌지 않음 ! ! !


public class UpdateMain02 {
	
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
			
			conn = DriverManager.getConnection(url, user, password);
			
			//3단계
			Scanner sc = new Scanner(System.in);
			System.out.println("아이디를 입력 : ");
			String id= sc.nextLine();
			System.out.println("수정할 이름을 입력 : ");
			String name = sc.nextLine();
			
			/*
			String sql = "update t_test ";
				   sql += " set name =? ";
				   sql +=" where id = ? ";
				   
			pstmt = conn.prepareStatement(sql);
			*/
			
			
			//StringBuilder 사용
			StringBuilder sql = new StringBuilder();
			sql.append("update t_test ");
			sql.append(" set name = ? ");
			sql.append(" where id = ? ");

			
			//stringBuilder에 들어있는 값을 문자열로 (toString())
			pstmt = conn.prepareStatement(sql.toString());
			
			pstmt.setString(1, name);
			pstmt.setString(2, id);
			
			
			//4단계
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개의 행 수정");
			
			
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
