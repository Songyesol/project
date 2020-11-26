package com.yedam.board;

import java.util.List;

public interface BoardService {

	public List getScriptList(); //전체리스트 보기
	public BoardVO getScript(int scptNo); //상세화면 보기
	public void insertScript(BoardVO boardvo); //등록
	public void deleteScript(int scptNo); //삭제
	public void updateScript(BoardVO vo);
	
	

}
