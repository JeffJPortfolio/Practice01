package com.javaex.ex01;

public class Ex10 {
	public static void main(String[] args) {
		int a = 7, b = 2;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("------------------------------------------------");
		
		int sum = a+b;
		System.out.println(sum);
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		System.out.println("------------------------------------------------");
		
		System.out.println(7/2);
		System.out.println(7.0+2);
		System.out.println(7.0-2.0);
		
		int var = -3;
		int pVar = +var; //-3
		int nVar = -var; //3
		System.out.println(pVar);
		System.out.println(nVar);
		
		//증강연산자 
		System.out.println(a);
		System.out.println(a++);
		System.out.println(a--);
		System.out.println(++a);
		System.out.println(--a);
		
		int c= 5;
		System.out.println(++c * 2); //12 
		
		int d= 5;
		System.out.println(d++ * 2); //10
		
		
		
	}

}
