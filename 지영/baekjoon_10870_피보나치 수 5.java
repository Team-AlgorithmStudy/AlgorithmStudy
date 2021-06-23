package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test11 {

	//피보나치수 문제.. n번째 피보나치 수를 구하시오
	//입력값 : 10
	//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233,    출력값 : 55
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] numbers = new int[n+1];
		
		for(int i = 0; i < numbers.length ; i++) {
			if(i == 0) {
				numbers[0] = 0;
			} else if(i == 1) {
				numbers[1] = 1;
			} else {
				numbers[i] = numbers[i-1] + numbers[i-2];
			}
		}
		System.out.println(numbers[n]);
	}

}
