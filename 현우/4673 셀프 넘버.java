package com.simple.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class Main {
	
	static boolean check[] = new boolean[10001];
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Arrays.fill(check, true);
		List<Integer> answer = new ArrayList<>();
		for(int i=1;i<10001;i++) {
			if(check[i]) {
				answer.add(i);
				int start = i;
				while(true) {
					start = func(start);
					if(start>10000 || !check[start]) {
						break;
					}
					check[start] = false;
				}
			}
		}
		for(int i=0; i<answer.size(); i++) {
			System.out.println(answer.get(i));
		}
	}
	public static int func(int num) {
		int answer = num;
		while(num!=0) {
			answer += num%10;
			num/=10;
		}
		return answer;
	}
}
