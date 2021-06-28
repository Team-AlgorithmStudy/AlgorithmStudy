package com.company.ct0628;

import java.util.Arrays;
import java.util.regex.Pattern;

public class pro_다트 {
    public static void main(String[] args) {

        String dartResult = "1S2D*3T";

        // 입력받은 문자열 분리
        String[] dart = dartResult.split("");
/*
        for(int i = 0; i < dart.length; i++){
            System.out.println(dart[i]);
        }
*/
        // 다트 점수
        int answer = 0;

        // 각 단계 점수
        int[] sc = new int[3];

        // 다트에 맞춘 점수
        int tmp = 0;

        // 인덱스
        int index = 0;


        String [] num = {"0","1","2","3","4","5","6","7","8","9"};
        String[] score = {"S","D","T"};
        String[] bonus = {"*","#"};

/*
        if(Arrays.asList(num).contains(dart[0])){
            System.out.println(dart[0]);
        }
*/

        for(int i = 0; i < dart.length; i++){
            // 입력값이 숫자일경우
            if(Arrays.asList(num).contains(dart[i])){

                // 10일경우
                if(dart[i].equals("1") && dart[i+1].equals("0")){
                    tmp = Integer.parseInt(dart[i] + dart[i+1]);

                }else {

                    tmp = Integer.parseInt(dart[i]);

                }

            }
            // 스코어 S D T일 경우
            if (Arrays.asList(score).contains(dart[i])){

                // s일경우
                if(dart[i].equals("S")){

                    sc[index] = (int) Math.pow(Integer.parseInt(String.valueOf(tmp)), 1);
                    index++;
                }else if (dart[i].equals("D")){
                    sc[index] = (int) Math.pow(Integer.parseInt(String.valueOf(tmp)),2);
                    index++;
                }else if (dart[i].equals("T")){
                    sc[index] = (int) Math.pow(Integer.parseInt(String.valueOf(tmp)),3);
                    index++;
                }
            }
            // 보너스 옵션일 경우

            if (index-1 >=0 && Arrays.asList(bonus).contains(dart[i])){

                if(dart[i].equals("*")){

                    sc[index] *=2;
                    sc[index-1] *=2;

                }else if (dart[i].equals("#")){

                    sc[index] *= -1;
                }


            }
        }

        for(int i = 0; i < sc.length; i++){
            answer += sc[i];
            System.out.println(answer);
        }


    }
}
