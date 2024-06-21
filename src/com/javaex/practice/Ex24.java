package com.javaex.practice;

public class Ex24 {

	public static void main(String[] args) {
		// 다음의 코드는 화씨 온도를 섭씨 온도로 변환하는 프로그램이다. 결과값이 0이 나오는 이유는 무엇이며 정상인 결과가 나오도록 수정하세요.
		//정담() '5/9'는 인트끼리 나누는 것이고 우리는 소수점까지 나눠야 하기 때문에 더블로 만들어준후에 나누면 된다. 0 이 나오는 이유는 5/9 int로 나눴을 경워 0이기 때문이다
		double f = 80.0;
		System.out.println((5.0/9.0) * (f - 32.0) );

	}

}
