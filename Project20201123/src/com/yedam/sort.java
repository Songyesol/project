package com.yedam;

import java.util.Arrays;
import java.util.Scanner;
/* 정수 3개를 입력받아 오름차순으로 정렬하는 프로그램작성 */
public class sort {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		while (true) {

				System.out.print("첫번째 입력> ");
				int num1 = scn.nextInt();
				System.out.print("두번째 입력> ");
				int num2 = scn.nextInt();
				System.out.print("세번째 입력> ");
				int num3 = scn.nextInt();

				int arrays[] = { num1, num2, num3 };
				Arrays.sort(arrays);
				for(int i =0; i<arrays.length; i++) {
				System.out.print(arrays[i]+" ");
				
				} break;
			}

	}
}
