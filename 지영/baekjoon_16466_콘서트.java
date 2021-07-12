package test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//백준 콘서트 16466
public class Test26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] oneChaTicketing = new int[N];
		
		Queue<Integer> queue = new LinkedList<Integer>();
		for(int i = 0; i < N; i++) {
			oneChaTicketing[i] = sc.nextInt();
		}
		
		Arrays.sort(oneChaTicketing);
		
		for(int i : oneChaTicketing) {
			queue.add(i);
		}
		
		int j = 1;
		
		while(!queue.isEmpty()) {
			if(queue.peek() != j) {
				break;
			} else {
				queue.remove();
				j++;
			}
		}
		System.out.println(j);

		//시간초과
		/*Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //1차 티케팅에서 팔린 티켓들의 수
		int answer = 1;       //답
		ArrayList<Integer> oneChaTicketing = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			oneChaTicketing.add(sc.nextInt());
		}
		Collections.sort(oneChaTicketing);
		
		while(true) {
			if(!oneChaTicketing.contains(answer)) {
				break;
			} else if (oneChaTicketing.contains(answer)) {
				answer++;
			}
		}
		
		System.out.println(answer);
		*/
	}
}
