package com.company.ct0729;

import java.util.Scanner;

public class bj1712 {	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		/*
		 * int count = 0; int tmp = B; while((A+B)>C*count) { int sum = A + B; int
		 * answer = C * count; if(sum>answer) { B += tmp; count++; }else { break; }
		 * 
		 * } if(count !=0) { System.out.println(count); }else { System.out.println(-1);
		 * }
		 */
		if(C <= B) {
			System.out.println(-1);
		}else {
			System.out.println(A/(C-B)+1);
		}
			
	}
}
