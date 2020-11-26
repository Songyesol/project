package com.yedam.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

/*DAO란?
 * DB를 사용해 직접적으로 데이터를 조회하거나 
 * 조작하는 기능을 전담하도록 만든 오브젝트*/

public class BoardDAO {
	Connection conn = null;
	PreparedStatement pstm; 
	ResultSet rs;//select 할 때만 필요하다.결과값을 담아야 하기 때문에
	String sql;

	// 전체리스트 조회
	public List getScriptList() {
		conn = DAO.getConnection();
		sql = "select * from board";
		List list = new ArrayList();

		try {
			pstm = conn.prepareStatement(sql); //쿼리 실행준비완료. 
			rs = pstm.executeQuery(); //쿼리의 실행결과를 resultset에 담는다
			while (rs.next()) {
				/*.next()의 의미
				 * 읽어올때 데이터의 처음부터 읽어오므로 next를 만나면 한 로우를 읽어오고 다음로우로 내려간다. 
				 * next하면 데이터를 한줄한줄 내려가면서 가져오게 하는 역할 */
				BoardVO vo = new BoardVO();
				vo.setScptNo(rs.getInt("board_no")); //가져올 컬럼의 데이터타입에 따라 결정되고 괄호안에는 sql컬럼의 원래 이름을 적어주면 됨
				vo.setTitle(rs.getString("title"));
				vo.setWriter(rs.getString("writer"));
				vo.setDate(rs.getString("creation_date"));
				list.add(vo); //만들어둔 리스트에 add(추가)한다
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	// 상세화면
	public BoardVO getScript(int scptNo) {

		conn = DAO.getConnection();
		sql = "select * from board where board_no = ?";
		BoardVO vo = new BoardVO();

		try {
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, scptNo);
			rs = pstm.executeQuery();

			if (rs.next()) {
				vo.setScptNo(rs.getInt("board_no"));
				vo.setTitle(rs.getString("title"));
				vo.setContent(rs.getString("content"));
				vo.setWriter(rs.getString("writer"));
				vo.setDate(rs.getString("creation_date"));

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vo;

	}

	// 등록
	public void insertScript(BoardVO vo) {

		conn = DAO.getConnection();
		sql = "insert into board(board_no,title, content, writer, creation_date)" 
		+ "values (?, ?, ?, ?,sysdate)";

		try {
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, vo.getScptNo());
			pstm.setString(2, vo.getTitle());
			pstm.setString(3, vo.getContent());
			pstm.setString(4, vo.getWriter());
			
			int r = pstm.executeUpdate();
			System.out.println(r + "건 입력완료.");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	//삭제
	public void deleteScript(int scptNo) {
		conn = DAO.getConnection();
		sql = "delete from board where board_no =?";
		
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, scptNo);
			int r = pstm .executeUpdate();
			System.out.println(r + "건 삭제됨.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//수정
	public void updateScript(BoardVO vo) {
		conn = DAO.getConnection();
		sql = "update board\r\n"
				+ "set title = ?, content = ?"
				+ "where board_no = ?";
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, vo.getTitle());
			pstm.setString(2, vo.getContent());
			pstm.setInt(3, vo.getScptNo());
			int r = pstm .executeUpdate();
			System.out.println(r + "건 수정됨.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
				
	}
	
} // end of class
