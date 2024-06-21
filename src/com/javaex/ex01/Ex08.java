package com.javaex.ex01;

public class Ex08 {
	public static void main(String[] arg) {
		
		int var01 = 2;
		double var02 = 3.5;
		
		//auto casting
		System.out.println(var01 + var02);
		
		//forced casting to smaller data type
		double var03 = 13.12;
		int var04 = (int)var03;
		
		System.out.println(var03);
		System.out.println(var04);
		
		//forced casting to bigger data type
		
		int var05 = 123;
		double var06 = (double)var05;
		
		System.out.println(var05);
		System.out.println(var06);
		
	}
}
