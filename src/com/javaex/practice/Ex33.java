package com.javaex.practice;

import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {
		// 구의 부피를 구하는 공식
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름: ");
		double scanR = sc.nextDouble();
		double ans = 3.14 * (4.0/3.0) * Math.pow(scanR, 3);
		System.out.print("구의 부피는: " + ans + "입니다.");
		
		sc.close();
		

	}

}
