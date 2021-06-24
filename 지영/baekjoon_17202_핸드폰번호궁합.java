package test;

import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next(); // 핸드폰번호1
		String B = sc.next(); // 핸드폰번호2
		char[] numbers = new char[16]; // 각 핸드폰번호 교차해서 넣는 char 배열
		int[] answer = new int[16]; // int형으로 변환하여 더한값을 넣은 배열
		int count = 0;

		int j = 0;

		for (int i = 0; i < 16; i += 2) { // numbers에 교차해서 넣어준다
			numbers[i] = A.charAt(j);
			numbers[i + 1] = B.charAt(j);
			j++;
			
		}
		
		for (int i = 0; i < 16; i++) {
			answer[i] = Integer.parseInt(String.valueOf(numbers[i]));
		}

		// 더하기
		while(count < 14) {
			
			for (int i = 0; i < answer.length - 1; i++) {
				int sum = answer[i] + answer[i + 1];
				if (sum >= 10) {
					sum = sum % 10; // 일의자리수 표현
					answer[i] = sum;
				}
				answer[i] = sum;
				
			}
			if(count == 13) {
				for(int i = 0; i < 2; i++) {
				System.out.print(answer[i]);
				}
			}
			
			count++;
			
		}
	}
}
