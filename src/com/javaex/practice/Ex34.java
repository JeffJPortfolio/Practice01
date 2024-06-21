package com.javaex.practice;

import java.util.Scanner;

public class Ex34 {

	public static void main(String[] args) {
		// Ex18 사용자로부터 화씨 온도를 입력받아 섭씨 온도로 변환하는 프로그램을 작성하세요
		Scanner sc = new Scanner(System.in);
		System.out.print("화씨: ");
		double scanTemp = sc.nextDouble();
		double ans = 5.0/9.0 * (scanTemp-32);
		System.out.print("화씨 " + scanTemp + "의 섭씨온도는" + ans + "입니다.");
		
		sc.close();

	}

}
