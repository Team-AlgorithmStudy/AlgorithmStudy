package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int count = sc.nextInt();
		int sum[] = new int[count];
		String[] str = new String[count];

		for (int i = 0; i < count; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			sum[i] = A + B;
			str[i] = A + " + " + B + " = ";
		}
		for (int i = 0; i < count; i++) {
			System.out.println("Case #" + (i + 1) + ": " + str[i] + sum[i]);
		}
	}
}
