package test;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int numbers[] = { 2, 1, 3, 4, 1 }; // 주어진 정수배열 numbers

		ArrayList<Integer> al = new ArrayList<>();

		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				int result = numbers[i] + numbers[j];
				if (al.contains(result)) {
					continue;
				}
				al.add(numbers[i] + numbers[j]);
			}
		}
		
		//ArrayList 방식 풀이(프로그래머스에서는 List를 사용하라고 나와있음)
/*
		Collections.sort(al);

		for (int i = 0; i < al.size(); i++) {
			System.out.print(al.get(i));
		}
*/

		// ArrayList -> List 로 변경 (프로그래머스 조건에 맞춰서 변경한것임)
		int[] answer = new int[al.size()];
		int size = 0;
		for (int temp : al) {
			answer[size++] = temp;
		}
		Arrays.sort(answer);

		for (int i = 0; i < answer.length; i++) {
			System.out.print(answer[i]);
		}

	}
}