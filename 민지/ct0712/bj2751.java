package com.company.ct0712;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class bj2751 {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        // 시간초과 -> StringBuilder 추가로 해결
        int n = Integer.parseInt(br.readLine());
        int[] grade = new int[n];
        for(int i = 0; i < n; i++){
            grade[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(grade);

    /*    for(int i = 0; i < grade.length; i++) {
            System.out.println(grade[i]);
        }*/
        for(int a: grade) {
            sb.append(a);
            sb.append("\n");
        }
        System.out.println(sb);

        // 시간초과
      /*  Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr [] = new int [n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        Arrays.stream(arr).forEach(System.out::println);*/
    }
}
