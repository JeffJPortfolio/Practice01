package com.javaex.practice;

import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
		// 상품을 구매하면 정가의 10%를 부가세로 부여한다. 아래와 같이 출력되도록 프로그램을 작성하세요
		Scanner sc = new Scanner(System.in);
		System.out.print("상품가격: ");
		double scanP = sc.nextDouble();
		System.out.print("받은돈: ");
		double scanR = sc.nextDouble();
		
		System.out.print("=====================");
		
		System.out.println("받은돈: " + scanR);
		System.out.println("상품가격" + scanP);
		System.out.println("부가세" + (scanP * 0.1));
		System.out.println("잔액" + (scanR - scanP));
		
		
		
		sc.close();

	}

}
