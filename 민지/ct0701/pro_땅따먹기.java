package com.company.ct0701;

import java.util.Arrays;

public class pro_땅따먹기 {
    public static void main(String[] args) {
        int[][] land = {{1, 2, 3, 5}, {5, 6, 7, 8}, {4, 3, 2, 1}};

 /*       int answer = 0;
        int num = 5;
        int max = 0;
        int index1 = 0;
        int index2 = 0;
        int index3 = 0;*/
/*        for (int i = 0; i < land.length; i++) {
            for (int j = 0; j < land[i].length ; j++) {

                  *//*  System.out.print(land[i][j]);*//*

                // 첫번째줄에 선택한숫자(num)이 있으면
                if(land[0][j] == num){
                    // num이 있는곳의 인덱스 추출
                    index1 = Arrays.binarySearch(land[i],num);
                    System.out.println("index1 = " + index1);
                    answer += land[0][index1];
             *//*       System.out.println(answer);*//*
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

                *//*    System.out.println(answer);*//*
                    continue;
                }

            } System.out.println();

        }*/

/*        //land 배열의 열을 도는 for문
        for(int i = 1; i < land.length; i++){
            // land 배열의 행을 도는 for문
            for(int j = 0; j < 4; j++){
                System.out.println("land[i][j] = " + land[i][j]);

                int max = 0;

                //이전 행 중 조건에 맞는 큰 값을 찾아 더하는 과정
                for(int k = 0; k < 4; k++){
                    if(j != k) {
                        max = Math.max(max, land[i - 1][k]);
                    }
                }

                land[i][j] += max;
            }
        }
        Arrays.sort(land[land.length -1]);
        System.out.println(land[land.length -1][3]);*/

        // 거꾸로 접근 -> 뒤에서부터 앞의 값을 통해 답을 구한다
        // i+1 값의 최댓값 : i의 최댓값 + i+1에서 선택할 수 있는 최댓값
        for(int i=1; i<land.length; i++){
            land[i][0] += Math.max(Math.max(land[i-1][1], land[i-1][2]), land[i-1][3]);
            System.out.println("land[i][0]" + land[i][0]);
            land[i][1] += Math.max(Math.max(land[i-1][0], land[i-1][2]), land[i-1][3]);
            System.out.println("land[i][1]" + land[i][1]);
            land[i][2] += Math.max(Math.max(land[i-1][1], land[i-1][0]), land[i-1][3]);
            System.out.println("land[i][2]" + land[i][2]);
            land[i][3] += Math.max(Math.max(land[i-1][1], land[i-1][2]), land[i-1][0]);
            System.out.println("land[i][3]" + land[i][3]);
        }

        int[] answer = land[land.length-1];
        Arrays.sort(answer);

        System.out.println(answer[answer.length-1]);

    }
}
