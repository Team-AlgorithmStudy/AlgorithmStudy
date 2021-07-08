package com.company.ct0629;

import java.util.Arrays;

public class pro_비밀지도 {
    public static void main(String[] args) {
        int n = 5;
        int[] arr1 = {9,20,28,18,11};
        int[] arr2 = {30,1,21,17,28};

        String[] answer = new String[n];
        String[] answer2 = new String[n];
        String[] answer3 = new String[n];
        String[] answer4 = new String[n];

        // 10진수 -> 2진수로 변환
        for(int i = 0; i < n; i++){

            answer[i] = Integer.toBinaryString(arr1[i]);
            answer2[i] = Integer.toBinaryString(arr2[i]);

            // 빈자리에 0 채우기
            if(answer[i].length() !=n ){
                int a = answer[i].length();
                for(int j = 0; j < n-a; j++){
                    answer[i] = "0" + answer[i];
                }
            }
            System.out.println("answer[i] = " + answer[i]);

            if(answer2[i].length() !=n ){
                int a = answer2[i].length();
                for(int j = 0; j < n-a; j++){
                    answer2[i] = "0" + answer2[i];
                }
            }

            System.out.println("answer2[i] = " + answer2[i]);

          /*  for(int k = 0; k < n ; k ++){
                answer3[k] = answer[k] + answer2[k];
                System.out.println("answer3[k] = " + answer3[k]);
            }*/
        }


    }
}
