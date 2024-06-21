package com.javaex.practice;

import java.util.Scanner;

public class Ex36 {

	public static void main(String[] args) {
		// 동전별 개수를 입력받아 총금액을 계산하는 프로그램을 작성하세요. 
		Scanner sc = new Scanner(System.in);
		System.out.print("500원 개수: ");
		int scan500 = sc.nextInt();
		System.out.print("100원 개수: ");
		int scan100 = sc.nextInt();
		System.out.print("50원 개수: ");
		int scan50 = sc.nextInt();
		System.out.print("10원 개수: ");
		int scan10 = sc.nextInt();
		
		int ans = 500 * scan500 + 100 * scan100 + 50 * scan50 + 10 * scan10 ;
		System.out.println("동전 종합은 " + ans + " 원 입니다");
		sc.close();
		

	}

}
