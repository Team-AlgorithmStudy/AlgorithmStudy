package test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//요세푸스 문제 1158
public class Test23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		int count = 1;
		Queue<Integer> queue = new LinkedList<>();
		ArrayList<Integer> queue2 = new ArrayList<>();
		
		for(int i = 1; i <= N; i++) {
			queue.add(i);
		}
		
		while(!queue.isEmpty()) {
			
			if( count % K == 0) {  //count가 k의 배수일때
			queue2.add(queue.poll());  //poll : 반환하고 삭제
			} else {
			queue.offer(queue.poll());
			}
			count++;
		}
		String answer = "<";
		for(int i = 0; i < queue2.size(); i++) {
			if(i == queue2.size() - 1) {
				answer += queue2.get(i);
			} else {
			answer += queue2.get(i) + ", ";
			}
		}
		answer += ">";
		System.out.println(answer);
	}
}
