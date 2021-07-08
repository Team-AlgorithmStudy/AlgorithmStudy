package test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

//백준 도키도키 간식드리미 
public class Test25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();         //승환이 앞에 있는 학생의 수
		
		Queue<Integer> queue = new LinkedList<>(); //승환이 앞에 있는 학생들의 번호표
		for(int i = 0; i < N; i++) {
			queue.offer(sc.nextInt());
		}
		
		int i = 1;
		Stack<Integer> stack = new Stack<>();
		
		while(!queue.isEmpty() || !stack.isEmpty()) {
			if(!queue.isEmpty() && i == queue.peek()) {
				queue.remove();
				i++;
			} else if(!stack.isEmpty() && i == stack.peek()){
				stack.pop();
				i++;
			}
			else {
				stack.add(queue.poll());
			}
			//큐가 다 비었을 때
			if(queue.isEmpty()) {
				if(!stack.isEmpty() && i == stack.peek()) {
					stack.pop();
					i++;
				} else {
					break;
				}
			}
			
		}
		
		if(stack.isEmpty() && queue.isEmpty()) {
			System.out.println("Nice");
		} else {
			System.out.println("Sad");
		}
		
	}

}
