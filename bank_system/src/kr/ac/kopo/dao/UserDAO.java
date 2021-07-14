package kr.ac.kopo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.util.ConnectionFactory;
import kr.ac.kopo.util.JDBCClose;
import kr.ac.kopo.vo.UserVO;

public class UserDAO {
	
	private List<UserVO> userlist;
	
	public UserDAO() {
		userlist = new ArrayList<>();
	}
	
	public void signUp(UserVO newUser) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = new ConnectionFactory().getConnection();
			
			StringBuilder sql = new StringBuilder();
			sql.append("insert into user_tbl(id, password, name, birth_date) ");
			sql.append(" values(?, ?, ?, ?)");
			
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, newUser.getId());
			pstmt.setString(2, newUser.getPassword());
			pstmt.setString(3, newUser.getName());
			pstmt.setString(4, newUser.getBirthDate());
			
			pstmt.executeUpdate();
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(conn, pstmt);
		}
	}
	
	public UserVO signIn(String id, String password) throws Exception {
		
		UserVO loginedUser = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = new ConnectionFactory().getConnection();
			
			StringBuilder sql = new StringBuilder();
			sql.append("select * from user_tbl where id = ? and password = ?" );
			
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, id);
			pstmt.setString(2, password);
			
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				loginedUser = new UserVO();
				loginedUser.setId(rs.getString("id"));
				loginedUser.setName(rs.getString("name"));
				loginedUser.setBirthDate(rs.getString("birth_date"));
				loginedUser.setLastAccountDate(rs.getString("last_open_acc_date"));
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCClose.close(conn, pstmt);
		}
		
		return loginedUser;
		
	}
	
	
	public int checkID(String id) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		int cnt = 0;
		
		try {
			conn = new ConnectionFactory().getConnection();
			
			StringBuilder sql = new StringBuilder();
			sql.append("select count(id) as count from user_tbl ");
			sql.append(" where id = ?");
			
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, id);
			
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				cnt = rs.getInt("count");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(conn, pstmt);
		}
		
		return cnt;
	}
	
}
