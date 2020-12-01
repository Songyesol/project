package com.yedam.array;

import java.util.Arrays;
import java.util.Scanner;

public class sortMorning {
	/* 정수 3개를 입력받아 오름차순으로 정렬하는 프로그램작성 */
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		while (true) {
			
			int selectNo = scn.nextInt();
			scn.nextLine();
			System.out.println("=======================");
			System.out.println(" 정렬할 숫자입력 & 출력");
			System.out.println("=======================");
			System.out.println("선택> ");

			if (selectNo == 1) {
				System.out.print("첫번째 입력> ");
				int num1 = scn.nextInt();
				System.out.print("두번째 입력> ");
				int num2 = scn.nextInt();
				System.out.println("세번째 입력> ");
				int num3 = scn.nextInt();

				int arrays[] = { num1, num2, num3 };
				Arrays.sort(arrays);
				System.out.println(arrays);

				}
			}

		}

	}


