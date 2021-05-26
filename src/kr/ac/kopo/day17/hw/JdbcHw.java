package kr.ac.kopo.day17.hw;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class JdbcHw {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			
			//1단계
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2단계
			String url = "jdbc:oracle:thin:@192.168.217.57:1522:xe";
			String user = "hr";
			String password = "hr";
			
			conn = DriverManager.getConnection(url ,user, password);
		//	System.out.println("접속완료");
			
			Scanner sc = new Scanner(System.in);
			System.out.print("급여를 입력하시오: ");
			int salary = sc.nextInt();
			sc.nextLine();
			
			//3단계
			String sql = "select j.job_title as job, avg(e.salary) as sal from employees e, jobs j where e.job_id = j.job_id and e.salary >= ? group by j.job_title order by sal desc";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, salary);
			
			//4단계
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String job = rs.getString("job");
				String sal = rs.getString("sal");
				System.out.println("[" + job + "] " + sal);
			}
			
			int cnt = pstmt.executeUpdate();
			System.out.println("총 [ " + cnt + " ]개가 검색되었습니다.");
			
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
