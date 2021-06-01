package kr.ac.kopo.dao;

import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.vo.BoardVO;

public class BoardDAO {
	
	private List<BoardVO> list;

	public BoardDAO() {
		list = new ArrayList<>();
	}
	
	/**
	 * 전체 게시글 조회
	 */
	public List<BoardVO> 전체게시글조회() throws Exception {
		System.out.println("dao 전체 게시글 조회 ...");
		return list;
	}
	
	public BoardVO 글번호조회(int no) throws Exception {
		
		for(BoardVO board : list) {
			if(board.getNo() == no) {
				return board;
			}
		}
		return null;
		
	}
	
	public void 새글등록(BoardVO newBoard) {
		list.add(newBoard);
		System.out.println("dao : " + newBoard);
	}
	
	public void 게시글수정(BoardVO board) { //매개변수 개수나 종류가 수정되더라도 넘겨받는 데이터(제목, 날짜, 글쓴이 등등)는 어짜피 BoardVO 형태 중 하나이기 때문에 BoardVO로 아예 매개변수 설정 가능
		
		for(BoardVO vo : list) {
			if(vo.getNo() == board.getNo()) {
				vo.setTitle(board.getTitle());
				return;
			}
		}
		
	}
	
	public void 게시글삭제(int no) {
		for(BoardVO vo : list) {
			if(vo.getNo() == no) {
				list.remove(vo);
				return;
			}
		}
	}
	
	
}
