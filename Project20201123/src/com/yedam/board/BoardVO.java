package com.yedam.board;

/*vo란?
 * 로직을 갖고 있지 않는 순수한 데이터 객체이며 속성과 그 속성에 
 * 접근하기 위한 getter, setter 메소드만 가진 클래스 */

public class BoardVO { 
	//field
	private int scptNo;
	private String title;
	private String content;
	private String writer;
	private String date;
	
	//constructor 
	public BoardVO() {

	}
	public BoardVO(int scptVo) {
		this.scptNo = scptNo;
	}
	public BoardVO(int scptNo, String title, String content, String writer, String date) {
		super();
		this.scptNo = scptNo;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
	}

	
	//method
	public void showList() {
		System.out.println("글번호: "+ scptNo+" | 제목: " + title + " | 작성자: "+writer+"| 작성일자: "+date);
	}
	public void showDetail() {
		System.out.println("글번호: "+ scptNo+" | 제목: " + title + " | 내용: " + content +"| 작성자: "+writer+"| 작성일자: "+date);
	}
	public int getScptNo() {
		return scptNo;
	}
	public void setScptNo(int scptNo) {
		this.scptNo = scptNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}





}//end of class
