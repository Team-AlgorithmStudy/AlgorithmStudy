package test;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		int mul = A * B * C; // 세 수의 곱
		String strMul = Integer.toString(mul);

		int arr[] = new int[10];

		for (int i = 0; i < strMul.length(); i++) {
			arr[strMul.charAt(i) - '0']++; // ex) 문자 '2'를 숫자 2로 바꾸는 방법은 문자'2'에서 문자'0'을 빼주는 것이다.
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}