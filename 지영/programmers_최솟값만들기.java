//프로그래머스 최솟값 만들기
package test;

import java.util.Arrays;

public class Test11111 {
	public static void main(String[] args) {
		int[] A = { 1, 4, 2 }; // 1,2,4,
		int[] B = { 5, 4, 4 }; // 4,4,5
		int sum = 0; // 결과값

		Arrays.sort(A);
		Arrays.sort(B);

		for (int i = 0; i < A.length; i++) {
			sum += A[i] * B[A.length -i - 1];
		}
		System.out.println(sum);
	}

}
