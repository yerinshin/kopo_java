package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
  	 JDBC �۾� ����
  	 1. ����̹� �ε�
  	 2. DB ���� �� ���� ��ü ���
  	 3. SQL�� ������ ��ü ���
  	 4. SQL�� ���� �� ��� ���
	 5. DB���� ����
	 //���������� �� IO����ϰ� �ִ���..!!!
	 
 */



public class InsertMain01 {
	
	public static void main(String[] args) {
		
		//���������� io �̱� ������ �� �ݾ��־�� �Ѵ�. (������ ���� �޼ҵ� : close �޼ҵ� ���)
		//finally���� close 
		
		Connection conn = null;
		Statement stmt = null;
		
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
			
			//3�ܰ� : SQL ���� ��ü ������
			stmt = conn.createStatement();
			String sql = "insert into t_test(id, name) "; //���������� �ڿ� ���� �ֱ�
				   sql += " values('hong', 'ȫ�浿') ";    //���� �ڿ��� �����ݷ� ������ x
			
			//jdbc �⺻�뵵 : crud -> dml ��ɾ ���, �Ϲ������� DDL�� ������� �ʴ´� (���������  proxy �����)
				   
				   
			//4�ܰ� : SQL ���� �� ��� ���
			int cnt = stmt.executeUpdate(sql);	//��ȯ�� int
			System.out.println("�� " + cnt + "�� �� ����");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			if(stmt != null) {    	//statement close
				try {
					stmt.close();
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
