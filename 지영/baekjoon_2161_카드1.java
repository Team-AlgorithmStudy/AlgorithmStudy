package test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//백준 카드1
//queue
public class Test21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();  //N장의 카드 7
		
		Queue<Integer> queue = new LinkedList<>();
		ArrayList<Integer> trashQueue = new ArrayList<>();
		
		for(int i = 1; i <= N ; i++) {
			queue.add(i);  //1,2,3,4,5,6,7
		}
		
		//1을 버린카드에 담고, 2를 queue의 맨뒤로보내기
		while(queue.size() != 1) {
			//System.out.println(" queue.remove() : " + queue.remove().intValue());
			int x = queue.remove();
			trashQueue.add(x);
			System.out.print(x + " ");
			queue.offer(queue.poll());
		}
		System.out.println(queue.poll());
	}
}
