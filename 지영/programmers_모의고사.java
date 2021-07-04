package test;

import java.util.ArrayList;
import java.util.List;

//프로그래머스 모의고사
public class Test9 {
	public static void main(String[] args) {
		int[] answers = { 1,3,2,4,2 }; // 정답이 순서대로 들은 배열
		int[] student1 = { 1, 2, 3, 4, 5 };
		int[] student2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] student3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
		int[] sum = new int[3]; // 학생별 정답갯수
		//int[] answer = new int[3];
		int j = 0;

		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == student1[i % 5]) {
				sum[0]++;
			}
			if (answers[i] == student2[i % 8]) {
				sum[1]++;
			}
			if (answers[i] == student3[i % 10]) {
				sum[2]++;
			}
		}
		int max = Math.max(sum[0], Math.max(sum[1], sum[2]));
		
		List<Integer> list = new ArrayList<>();
		if(max == sum[0]) list.add(1);
		if(max == sum[1]) list.add(2);
		if(max == sum[2]) list.add(3);
		
		int[] answer = new int[list.size()];
		for(int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		
		for(int i=0; i<answer.length;i++) {
			System.out.println(answer[i]);
		}
		
		/*
		int num = 0;
		
		for(int i = 0; i < 3; i++) {
			if(sum[i] == max) {
				answer[j] = i + 1;
				j++;
				num++;
			}
		}
		
		int[] answer11 = new int[num];
		for(int i = 0; i < num; i++) {
			answer11[i] = answer[i];
		}
		
		for(int i = 0; i < num; i++) {
			System.out.println(answer11[i]);
		}
		*/
	}
}
