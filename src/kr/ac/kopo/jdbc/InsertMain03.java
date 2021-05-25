package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/*
  	 JDBC �۾� ����
  	 1. ����̹� �ε�
  	 2. DB ���� �� ���� ��ü ���
  	 3. SQL�� ������ ��ü ���
  	 4. SQL�� ���� �� ��� ���
	 5. DB���� ����
	 //���������� �� IO����ϰ� �ִ���..!!!
	 
 */



public class InsertMain03 {
	
	public static void main(String[] args) {
		
		//���������� io �̱� ������ �� �ݾ��־�� �Ѵ�. (������ ���� �޼ҵ� : close �޼ҵ� ���)
		//finally���� close 
		
		Connection conn = null;
//		Statement stmt = null;
		PreparedStatement pstmt = null;
		Scanner sc = new Scanner(System.in);  //Ű������ �ܺ���ġ ��� -> ���� Scanner �� io
											  //�׷��� sc.close() ���� ����Ѵ�. ����
		
		
		try {
		
			//1�ܰ� : jdbc ����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε� ����...");
			
			//2�ܰ� : db���� �� Connection ��ü ���
			String url = "jdbc:oracle:thin:@192.168.119.119:1521:dink";
			String user		= "scott";
			String password	= "tiger";
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("conn : " + conn);
			
			System.out.println("���̵� �Է� : ");
			String id = sc.nextLine();
			
			System.out.println("�̸��� �Է� : ");
			String name = sc.nextLine();
		
			
			//3�ܰ� : SQL ���� ��ü ������
			String sql = "insert into t_test(id, name) ";
				   sql += " values(?, ?) ";
				   
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);  //ù��° ? �� 'id' �� (setString�̹Ƿ� ��������ǥ �ڵ���)
			pstmt.setString(2, name);
				   
			//4�ܰ� : SQL ���� �� ��� ���
			int cnt = pstmt.executeUpdate(); 
			System.out.println(cnt + "�� �� ����");
			
			
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
