package test;

import java.util.Arrays;
import java.util.Scanner;

public class Test11111 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String TT = sc.nextLine();    //테스트 케이스의 개수
		int T = Integer.parseInt(TT); //int형으로 변경 ! 
		
		String[] a = new String[T];
		String answer = ""; //결과값
		
		for(int i = 0; i < T; i++) {
			a[i] = sc.nextLine();
		}

//		for(int i=0; i<a.length;i++) {
//			System.out.println("a["+i+"] = " + a[i]);
//		}
//		System.out.println("성공!!");
		
		
		
		for(int i = 0; i < T; i++) {
			String[] result = a[i].split(" ");
			
			//System.out.println("a["+i+"].result = " + Arrays.toString(result));
			
			double x = Double.parseDouble(String.valueOf(result[0]));
			//System.out.println(i+"번째 시작 x ; " + x);
			
			for(int j = 1; j < result.length; j++) {
				
				if(result[j].equals("@")) {
					x *= 3;
				}
				if(result[j].equals("%")) {
					x += 5;
				}
				if(result[j].equals("#")) {
					x -= 7;
				}
			}
			//System.out.println(i + "번쨰 x의 값은 :" + x);
			
			answer = String.format("%.2f",x);
			System.out.println(answer);
		}
		
		
		
		
	}

}
