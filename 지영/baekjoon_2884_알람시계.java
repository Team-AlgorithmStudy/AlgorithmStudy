package test;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();
		int M = sc.nextInt();
		int resultM = 0;
		int resultH = 0;

		if (H == 0) {
			if (M >= 45 && M < 60) {
				resultH = 0;
				resultM = M - 45;
			} else if (M < 45) {
				resultH = 23;
				resultM = (M - 45) + 60;
			}
		}
		if (H != 0) {
			if (M >= 45 && M < 60) {
				resultH = H;
				resultM = M - 45;
			} else if (M < 45) {
				resultH = H - 1;
				resultM = (M - 45) + 60;
			}
		}
		System.out.print(resultH + " " + resultM);
	}
}
