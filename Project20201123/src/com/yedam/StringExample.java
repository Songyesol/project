package com.yedam;

import java.io.IOException;

public class StringExample {

	public static void main(String[] args) {

		String str1 = new String();
		str1 = "Hello";

		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };
		// byte값이 문자로 변환되어 나옴.
		String str2 = new String(bytes);
		System.out.println(str2.toString());

		String str3 = new String(bytes, 6, 4);
		System.out.println(str3.toString());
	
		byte[] bytes2 = new byte[100];
//		try{
//			int readByteNo = System.in.read(bytes2);
//			String str4 = new String (bytes2, 0, readByteNo);
//			System.out.println(str4);
//		} catch(IOException e) {
//		e.printStackTrace();
//	}
		
		char chr = str2.charAt(0);
		System.out.println(chr);
	}
}
