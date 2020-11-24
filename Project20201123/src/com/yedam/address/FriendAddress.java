package com.yedam.address;

import java.util.Scanner;


public class FriendAddress {
	// Friend의 필드
	static Friend[] friends = new Friend[100];
	static Scanner scn = new Scanner(System.in);// 입력한 값을 읽어와서 스캐너가 처리함

	public static void main(String[] args) {
		// 주소록 생성하는 프로그램

		while (true) {
			System.out.println("---------------------------------------------");
			System.out.println("1.친구등록 | 2.학교친구 | 3.회사친구 | 4.전체리스트 | 5.번호검색 |6.종료");
			System.out.println("---------------------------------------------");
			System.out.print("선택> ");

			int selectNo = scn.nextInt();
			scn.nextLine();

			if (selectNo == 1) {
				addFriend();

			} else if (selectNo == 2) {
				addUnivFriend();
			} else if (selectNo == 3) {
				addCompfriend();
			} else if (selectNo == 4) {
				showFriendList();
			} else if (selectNo == 5) {
				searchPhone();
			} else if (selectNo == 6) {
				break; /* (alt키를 누르고 화살표키를 누르면 움직임) */

			}
		}
		System.out.println("프로그램 종료");

	}// end of main

//1번 친구등록 메소드
	public static void addFriend() {
		System.out.print("친구이름> ");
		String name = scn.nextLine();
		System.out.print("전화번호> ");
		String phone = scn.nextLine();

		Friend frnd = new Friend(name, phone);
		insertFriend(frnd);
		 // 한건 입력하고 빠져나와랏			
	}
//2번 학교친구등록
	public static void addUnivFriend() {
		System.out.print("친구이름> ");
		String name = scn.nextLine();
		System.out.print("전화번호> ");
		String phone = scn.nextLine();
		System.out.print("학교명> ");
		String univ = scn.nextLine();
		System.out.print("전공정보> ");
		String major = scn.nextLine();

		UnivFriend frnd = new UnivFriend(name, phone);
		frnd.setUniv(univ);
		frnd.setMajor(major);
		insertFriend(frnd);
	}
//3번 회사친구등록
	public static void addCompfriend() {
		System.out.print("친구이름> ");
		String name = scn.nextLine();
		System.out.print("전화번호> ");
		String phone = scn.nextLine();
		System.out.print("회사이름> ");
		String company = scn.nextLine();
		System.out.print("부서명> ");
		String department = scn.nextLine();

		CompFriend frnd = new CompFriend(name, phone);
		frnd.setCompany(company);
		frnd.setDepartment(department);
		insertFriend(frnd);
	}
//4번 친구리스트 
	public static void showFriendList() {
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null) {
				friends[i].showFriendInfo();
			}
		}
	}
//5번 번호검색
	public static void searchPhone() {
		System.out.print("전화번호> ");
		String phone = scn.nextLine();
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null && phone.equals(friends[i].getPhone())) {
				friends[i].showFriendInfo();
			}
		}

	}
	//6. 한건 입력
	public static void insertFriend(Friend friend) {
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = friend;
				break;
			}
		}
	}
	}// end of class
