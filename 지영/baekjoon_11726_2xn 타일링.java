package test;

import java.util.Scanner;
// 백준 11726 _ 2×n 타일링
public class Test18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] d = new int[n+1];
		
		d[0] = 1;
		d[1] = 1;
		if(n>=2) {
			for(int i = 2; i <= n; i++) {
				d[i] =  ( d[i-2] + d[i-1] ) % 10007;
			}
		}
		
		System.out.println(d[n]);
	}
}
