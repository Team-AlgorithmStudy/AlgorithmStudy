package com.company.ct0630;

import java.util.Arrays;
import java.util.Collections;

public class pro_최솟값 {
    public static void main(String[] args) {
        int []A = {1,2};
        int []B = {3,4};

        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);
        for(int i = 0; i < A.length; i++){

            answer += A[i] * B[A.length -i - 1];

        }
        System.out.println(answer);

        // 시간초과
        /*Integer[] C = Arrays.stream(B).boxed().toArray(Integer[]::new);
        Arrays.sort(C, Collections.reverseOrder());
        Arrays.sort(A);


        for(int i = 0; i < A.length; i++){

            answer += A[i] * B[i];

        }
        System.out.println(answer);*/
    }
}
