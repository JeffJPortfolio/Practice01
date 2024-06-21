package com.javaex.ex02;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("이름을 입력해 주세요");
		System.out.print("이름:");

		String scanName = sc.nextLine();

		System.out.println("나이를 입력해 주세요");
		System.out.print("나이:");

		int scanAge = sc.nextInt();

		System.out.println("키를 입력해 주세요");
		System.out.print("키:");

		float scanHeight = sc.nextFloat();

		System.out.println("당신의 이름은 " + scanName + " 나이는 " + scanAge + "키는 " + scanHeight + " 입니다.");
		sc.close();


	}
}
