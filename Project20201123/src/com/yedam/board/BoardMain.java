package com.yedam.board;

import java.util.List;
import java.util.Scanner;

import com.yedam.db2.EmployeeVO;

public class BoardMain {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		BoardService service = new BoardServiceImp();

		while (true) {
			System.out.println("==================================================");
			System.out.println("1.목록보기 | 2.상세화면 | 3.등록 | 4.삭제 | 5.수정 | 6.종료");
			System.out.println("==================================================");
			System.out.println("번호선택> ");

			int selectNo = scn.nextInt();
			scn.nextLine();

			if (selectNo == 1) {
				List list = service.getScriptList();
				for (Object vo : list) {
					BoardVO brd = (BoardVO) vo;
					brd.showList();
				}
			} else if (selectNo == 2) {
				System.out.print("글번호> ");
				int scptNo = scn.nextInt();
				BoardVO vo = service.getScript(scptNo);
				vo.showDetail();

			} else if (selectNo == 3) {
				System.out.print("글번호를 입력하세요: ");
				int scptNo = scn.nextInt();
				scn.nextLine();
				System.out.print("글 제목: ");
				String title = scn.nextLine();
				System.out.print("내용: ");
				String content = scn.nextLine();
				System.out.print("작성자: ");
				String writer = scn.nextLine();
				System.out.print("작성일자: ");

				BoardVO vo = new BoardVO();

				vo.setScptNo(scptNo);
				vo.setTitle(title);
				vo.setContent(content);
				vo.setWriter(writer);

				service.insertScript(vo);

			} else if (selectNo == 4) {
				System.out.print("삭제할 글 번호: ");
				int scptNo = scn.nextInt();
				service.deleteScript(scptNo);

			} else if (selectNo == 5) {
				System.out.println("수정 글 번호: ");
				int scptNo = scn.nextInt();
				scn.nextLine();
				System.out.print("수정 글 제목: ");
				String title = scn.nextLine();
				System.out.print("수정 내용: ");
				String content = scn.nextLine();

				BoardVO vo = new BoardVO();
				vo.setScptNo(scptNo);
				vo.setTitle(title);
				vo.setContent(content);

				service.updateScript(vo);

			}

			else if (selectNo == 6) {
				break;
			}
		}
		System.out.println("화면 종료");

	}
}
