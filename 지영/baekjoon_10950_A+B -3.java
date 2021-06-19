package test;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int list[] = new int[count];

		for (int i = 0; i < count; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			list[i] = A + B;
		}

		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
	}

}
