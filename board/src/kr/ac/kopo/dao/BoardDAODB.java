package kr.ac.kopo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.util.ConnectionFactory;
import kr.ac.kopo.util.JDBCClose;
import kr.ac.kopo.vo.BoardVO;

public class BoardDAODB {
	
	private List<BoardVO> list;

	public BoardDAODB() {
		list = new ArrayList<>();
	}
	
	/**
	 * 전체 게시글 조회
	 */
	public List<BoardVO> 전체게시글조회() throws Exception{
		
		List<BoardVO> list = new ArrayList<>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = new ConnectionFactory().getConnection();
			
			StringBuilder sql = new StringBuilder();
			sql.append("select no, title, writer ");
			sql.append(", to_char(reg_date, 'yyyy-mm-dd') as reg_date ");
			sql.append("  from tbl_board ");

			pstmt = conn.prepareStatement(sql.toString());
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				int no = rs.getInt("no");
				String title =rs.getString("title");
				String writer = rs.getString("writer");
				String regDate = rs.getString("reg_date");
				
				BoardVO board = new BoardVO(no, title, writer, regDate);
				list.add(board);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(conn, pstmt);
		}

		return list;
		
	}
	
	public void 새글등록(BoardVO newBoard) throws Exception {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = new ConnectionFactory().getConnection();
			
			System.out.println("연결완료");
			
			StringBuilder sql = new StringBuilder();
			sql.append("insert into tbl_board(no, title, writer) ");
			sql.append(" values(seq_tbl_board_no.nextval, ?, ?) ");
			
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, newBoard.getTitle());
			pstmt.setString(2, newBoard.getWriter());
			
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(conn, pstmt);
			
		}
	}
	
	public void 게시글수정(BoardVO board) throws Exception { //매개변수 개수나 종류가 수정되더라도 넘겨받는 데이터(제목, 날짜, 글쓴이 등등)는 어짜피 BoardVO 형태 중 하나이기 때문에 BoardVO로 아예 매개변수 설정 가능

		
	}
	
	public boolean 게시글삭제(int no) throws Exception {
		return false;
	}
	
	
}
