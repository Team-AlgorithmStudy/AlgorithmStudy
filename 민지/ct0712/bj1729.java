package com.company.ct0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class bj1729 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        double[] grade = new double[n];
        for(int i = 0; i < n; i++){
            grade[i] = Double.parseDouble(br.readLine());
        }
        Arrays.sort(grade);

        for (int i = 0; i < 7; i++){
            System.out.printf("%.3f\n",grade[i]);
        }

        /* Scanner sc = new Scanner(System.in);*/
        // 시간초과
/*        int n = sc.nextInt();
        double[] grade = new double[n];
        for(int i = 0; i < n; i++){
            grade[i] = sc.nextDouble();
        }
        Arrays.sort(grade);

        for (int i = 0; i < 7; i++){
            System.out.printf("%.3f\n",grade[i]);
        }*/


        // 시간초과
    /*    int n = sc.nextInt();
        double[] grade = new double[n];
        double tmp = 0;

        for(int i = 0; i < n; i++){
            grade[i] = sc.nextDouble();
            *//*System.out.println(grade[i]);*//*
        }
        double min = 0;
        for(int i = 0; i < grade.length; i++){
             min = grade[i];
             int j = i -1;
             while (j >= 0 && grade[j] > min){
                 grade[j+1] = grade[j];
                 j--;
             }
             grade[j + 1] = min;

        }

        for (int i = 0; i < 7; i++){
            System.out.println(grade[i]);
        }*/


    }


}
