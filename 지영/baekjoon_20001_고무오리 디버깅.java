package test;

import java.util.Scanner;
import java.util.Stack;

public class Test25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String start = sc.nextLine();  //고무오리 디버깅 시작
		
		Stack<Integer> stack = new Stack<>();
	
		if(start.equals("고무오리 디버깅 시작")) {
			stack.push(-1);
			while(true) {
				String x = sc.nextLine();
				
				if(x.equals("문제")) {  //0
					if(stack.peek() == 1) {
						stack.pop();
					} else {
						stack.add(0);
					}
				} else if (x.equals("고무오리")) {  //1
					//스택에 제일 상단에 있는 값이 "문제"라면 stack.peek();
					if(stack.peek() == 0) {
						stack.pop();
					} else if(stack.peek() == -1) {
						stack.push(0);
						stack.push(0);
					} else {
						stack.add(1);
						}
				} else if (x.equals("고무오리 디버깅 끝")) {
					break;
				}
			}
		}
		
		//System.out.println(stack);
		if(stack.size() == 1) {
			System.out.println("고무오리야 사랑해");
		} else {
			System.out.println("힝구");
		}
	}

}
