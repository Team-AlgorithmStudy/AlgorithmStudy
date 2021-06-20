package test;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0; // 최댓값
		int maxIndex = 0; // 최댓값 배열번호

		int num[] = new int[9];

		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		for (int i = 0; i < num.length; i++) {
			if (max < num[i]) {
				max = num[i];
				maxIndex = i + 1;
			}
		}
		System.out.println(max);
		System.out.println(maxIndex);

	}
}