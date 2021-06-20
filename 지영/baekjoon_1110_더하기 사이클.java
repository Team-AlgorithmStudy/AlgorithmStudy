package test;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();  // 입력받은 N
		int tenDigit = N / 10; // N의 10의자리수
		int OneDigit = N % 10; // N의 1의자리수
		int NewN = 0;          // 새로운 수
		int cycleLength = 0;   // 사이클길이

		do {
			int DigitSum = tenDigit + OneDigit;       // 자릿수 더한값
			NewN = (OneDigit * 10) + (DigitSum % 10); //새로운 수

			cycleLength++;

			tenDigit = NewN / 10;
			OneDigit = NewN % 10;

		} while (NewN != N);
		
		System.out.println(cycleLength);
		
	}
}