package test;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int j = 0;
		int i = 0;
		int k = 0;
		int N = sc.nextInt();
		for (j = 0; j < N; j++) {
			for (i = 1; i < N - j; i++) {
				System.out.print(" ");
			}
			for (i = N - j; i <= N; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
