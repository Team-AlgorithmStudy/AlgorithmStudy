package test;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//sc.hasNextInt() : NoSuchElement 에러 방지.. 더 이상 입력이 없다는 것을 판단할 부분이 필요. Scanner에서는 hasNext, hasNextInt, hasNextLong등과 같은 메소드로 판단.
		while (sc.hasNextInt()) { 
			int A = sc.nextInt();
			int B = sc.nextInt();

			System.out.println(A + B);
		}
	}
}