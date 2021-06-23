package test;

import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();  //정수의개수
		
		int[] numbers = new int[n]; //크기가 n인 배열 numbers
		
		for(int i =0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();   //배열 numbers 에 들어갈 값들 a
		}
		
		int v = sc.nextInt();  //찾으려고하는정수 v
		
		int count = 0;         //찾으려고 하는 정수v의 갯수
		
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] == v) {
				count++;
			}
		}
		
		System.out.println(v + "의 개수 " + count);
		
	}

}
