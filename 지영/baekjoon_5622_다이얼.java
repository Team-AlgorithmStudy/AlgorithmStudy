package test;

import java.util.Scanner;

//다이얼
public class Test12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine(); //입력값
		char xx[] = new char[x.length()];
		int second = 0; //초
		int secondSum = 0; //전체걸린시간
		
		for(int i = 0; i < x.length(); i++) {
			xx[i] = x.charAt(i);
			
			if(xx[i] == '1') {
				second = 2;
				secondSum += second;
			}
			if(xx[i] == 'A' || xx[i] == 'B' || xx[i] == 'C') {
				second = 3;
				secondSum += second;
			}
			if(xx[i] == 'D' || xx[i] == 'E' || xx[i] == 'F') {
				second = 4;
				secondSum += second;
			}
			if(xx[i] == 'G' || xx[i] == 'H' || xx[i] == 'I') {
				second = 5;
				secondSum += second;
			}
			if(xx[i] == 'J' || xx[i] == 'K' || xx[i] == 'L') {
				second = 6;
				secondSum += second;
			}
			if(xx[i] == 'M' || xx[i] == 'N' || xx[i] == 'O') {
				second = 7;
				secondSum += second;
			}
			if(xx[i] == 'P' || xx[i] == 'Q' || xx[i] == 'R' || xx[i] == 'S') {
				second = 8;
				secondSum += second;
			}
			if(xx[i] == 'T' || xx[i] == 'U' || xx[i] == 'V') {
				second = 9;
				secondSum += second;
			}
			if(xx[i] == 'W' || xx[i] == 'X' || xx[i] == 'Y' || xx[i] == 'Z') {
				second = 10;
				secondSum += second;
			}
			if(xx[i] == '0') {
				second = 11;
				secondSum += second;
			}
			
		}
		System.out.println(secondSum);
	}
}
