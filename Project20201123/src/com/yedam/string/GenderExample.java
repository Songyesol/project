package com.yedam.string;


public class GenderExample {

	public static void main(String[] args) {
		StringBuilder sb =new StringBuilder();
		
		Gender birth1 = new Gender("991123-1234567");
		Gender birth2= new Gender ("981123_2345678");
		Gender birth3= new Gender ("971103*3234567");
		Gender birth4= new Gender ("9502034234567");		

		Gender[] births = {birth1, birth2, birth3, birth4};

		for(int i=0; i<births.length; i++) {

		}
		
	}
}
