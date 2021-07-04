package com.company.ct0701;

import java.util.Arrays;

public class pro_땅따먹기 {
    public static void main(String[] args) {
        int[][] land = {{1, 2, 3, 5}, {5, 6, 7, 8}, {4, 3, 2, 1}};

        int answer = 0;
        int num = 5;
        int max = 0;
        int index1 = 0;
        int index2 = 0;
        int index3 = 0;
        for (int i = 0; i < land.length; i++) {
            for (int j = 0; j < land[i].length ; j++) {

                  /*  System.out.print(land[i][j]);*/

                // 첫번째줄에 선택한숫자(num)이 있으면
                if(land[0][j] == num){
                    // num이 있는곳의 인덱스 추출
                    index1 = Arrays.binarySearch(land[i],num);
                    System.out.println("index1 = " + index1);
                    answer += land[0][index1];
             /*       System.out.println(answer);*/
                    continue;                   
                }
                // 두번쨰 줄에서 가장 큰 숫자 max에 담는다
                if(land[1][j] > max){
                    max = land[1][j];

                    // max 있는곳의 인덱스 추출
                    index2 = Arrays.binarySearch(land[i],max);

                     System.out.println("index2 = " + index2);
                    if(index1 == index2){
                        continue;

                    }else{
                        answer += land[1][index2];
                    }

                /*    System.out.println(answer);*/
                    continue;
                }

            } System.out.println();

        }
    }
}
