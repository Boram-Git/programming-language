package sec02.exam03;

/*
작성자: 김보람
작성일: 2023-02-13
 */

public class LongExample {
	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L;
		// long var3 = 1000000000000; <- 컴파일 에러
		long var4 = 1000000000000L; // 위에 컴파일 에러 해결하는 코드
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	}
}
