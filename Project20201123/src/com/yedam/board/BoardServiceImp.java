package com.yedam.board;

import java.util.List;

public class BoardServiceImp implements BoardService {

	BoardDAO dao = new BoardDAO();

	@Override
	public List getScriptList() {
		// TODO Auto-generated method stub
		return dao.getScriptList();
	}

	@Override
	public BoardVO getScript(int scptNo) {
		// TODO Auto-generated method stub
		return dao.getScript(scptNo);
	}

	@Override
	public void insertScript(BoardVO boardvo) {
		dao.insertScript(boardvo);
		
	}

	@Override
	public void deleteScript(int scptNo) {
		dao.deleteScript(scptNo);
		
	}

	@Override
	public void updateScript(BoardVO vo) {
		dao.updateScript(vo);
		
	}






	

}
