package codingTest;

import java.util.Scanner;

/**
 * 1. 문자열 입력 2. 입력받은 문자열을 split으로 자르기 3. int로 변환해서 더해줌
 */
public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String a = sc.next();
		String[] sp = a.split("");
		int sum = 0;

		for (int i = 0; i < sp.length; i++) {
			sum += Integer.parseInt(sp[i]);
		}
		System.out.println(sum);
	}
}
