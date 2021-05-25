package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
//StringBuilder ���


/*
 	������ ���̵� �Է� : hong
 	������ �̸��� �Է� : ȫ���      (ȫ�浿 -> ȫ���)
 */


// 1,2,5 �ܰ�� �ٲ��� ���� ! ! !


public class UpdateMain02 {
	
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			//1�ܰ�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2�ܰ�
			String url = "jdbc:oracle:thin:@192.168.119.119:1521:dink";
			String user = "scott";
			String password = "tiger";
			
			conn = DriverManager.getConnection(url, user, password);
			
			//3�ܰ�
			Scanner sc = new Scanner(System.in);
			System.out.println("���̵� �Է� : ");
			String id= sc.nextLine();
			System.out.println("������ �̸��� �Է� : ");
			String name = sc.nextLine();
			
			/*
			String sql = "update t_test ";
				   sql += " set name =? ";
				   sql +=" where id = ? ";
				   
			pstmt = conn.prepareStatement(sql);
			*/
			
			
			//StringBuilder ���
			StringBuilder sql = new StringBuilder();
			sql.append("update t_test ");
			sql.append(" set name = ? ");
			sql.append(" where id = ? ");

			
			//stringBuilder�� ����ִ� ���� ���ڿ��� (toString())
			pstmt = conn.prepareStatement(sql.toString());
			
			pstmt.setString(1, name);
			pstmt.setString(2, id);
			
			
			//4�ܰ�
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "���� �� ����");
			
			
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
