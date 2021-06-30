package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

//백준 _ 달팽이는 올라가고 싶다 
//마지막날에는 낮에 정상에 도달하면 밤에는 미끄러지지 않는다
//A-B : 하루(낮-밤)에 올라갈 수 있는 높이 : 1
//V-B : 총길이  - 미끄러지는높이 .......(마지막날엔 미끄러지지않으니까)
//      하지만.. (V-B) / (A-B)가 0으로 딱 떨어지지 않을 때 하루가 더 소요됨
public class Test6 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");

		int A = Integer.parseInt(str[0]); // 낮에 올라갈 수 있는 높이
		int B = Integer.parseInt(str[1]); // 밤에 미끄러지는 높이
		int V = Integer.parseInt(str[2]); // 나무막대의 높이
		int day = 0; // 올라가는데 걸리는 일 수

		br.close();

		day = (V - B) / (A - B);
		if ((V - B) % (A - B) != 0) {
			day++;
		}

		System.out.println(day);

		// 에러1) Scanner 시간초과...환장하겠네
		
		/*
		 * Scanner sc = new Scanner(System.in); int V = sc.nextInt(); //나무막대의 높이 int A =
		 * sc.nextInt(); //낮에 올라갈 수 있는 높이 int B = sc.nextInt(); //밤에 미끄러지는 높이 int day =
		 * 0; //올라가는데 걸리는 일 수
		 * 
		 * day = (V-B) / (A-B); if((V-B) % (A-B) != 0) { day++; }
		 * 
		 * System.out.println(day);
		 */

		// 에러2) while 시간초과!!!!!!!!!!!
		/*
		 * int V = 0; //나무막대의 높이 int A = 0; //낮에 올라갈 수 있는 높이 int B = 0; //잠을 자는동안 B미터
		 * 미끄러지는 높이 int C = 0; //하루동안 올라갈 수 있는 높이 int day = 0; //모두 올라가는데 걸리는 일수
		 * 
		 * //int[] input = {5,1,6}; //int[] input = {2,1,5}; int[] input = {100, 99,
		 * 1000000000};
		 * 
		 * 
		 * while(true) { day++; //하루째부터 시작하니까 //낮일때 C += input[0]; if(C >= input[2]) {
		 * break; } C -= input[1];
		 * 
		 * //System.out.println("일수:" + day + ", 누적높이 : " + C);
		 * 
		 * } System.out.println("일수 : " + day);
		 * 
		 */

	}
}
