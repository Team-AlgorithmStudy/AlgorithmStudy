package test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
//백준 카드2
public class Test24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		for(int i = 1; i <= N; i++) {
			queue.offer(i);
		}
		//System.out.println(queue);
		
		while(queue.size() != 1) {
			queue.remove();
			//System.out.println("1.queue : " + queue);
			queue.offer(queue.poll());
			//System.out.println("2.queue : " + queue);
		}
		int answer = queue.peek();
		System.out.println(answer);
	}
}
