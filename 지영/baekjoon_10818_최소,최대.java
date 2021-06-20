package test;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int[] N = new int[count];
		int temp = 0;

		for (int i = 0; i < count; i++) {
			N[i] = sc.nextInt();
		}
		Arrays.sort(N); // 오름차순정렬

		System.out.print(N[0] + " " + N[count - 1]);
	}
}