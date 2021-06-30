package com.company.ct0701;

import java.util.*;

public class pro_모의고사 {
    public static void main(String[] args) {
        int[] answers = {1,2,3,4,5};

        int[] a = {1,2,3,4,5};
        int[] b = {2,1,2,3,2,4,2,5};
        int[] c = {3,3,1,1,2,2,4,4,5,5};

        // 각 수포자가 맞은갯수
        int[] answer = new int[4];
        
        int max = 0;
        HashSet<Integer> set = new HashSet<>();
        
        
        for (int i = 0; i < answers.length; i++){
            
            if(answers[i] == a[i % 5]){
                // 맞은갯수 카운트 
                answer[1]++;    
            }
            if(answers[i] == b[i % 8]){
                answer[2]++;
            }
            if(answers[i] == c[i % 10]){
                answer[3]++;
            }

        }

        // 1부터 시작 -> 위에서 1인덱스부터 넣었기 때문에
        for(int i = 1; i < answer.length; i++){
            
            // i인덱스(맞은갯수)가 max값보다 크면
            if(answer[i] > max) {
                // max에 제일큰 수 대입
                max = answer[i];
            }

        }
        
        for (int i = 1; i < answer.length; i++){
            // 제일 큰 수와 i인덱스가 같으면
            if(max == answer[i]){
                // set에 넣어준다
                set.add(i);
            }
        }
        // set을 배열에 넣어주기위해 list로 치환
        List<Integer> list = new ArrayList(set);

        // 프로그래머스의 리턴타입이 배열이기 때문에 list를 배열로 치환
        int[] an = new int[list.size()];

        for(int i = 0; i < an.length; i++){
            an[i] = list.get(i);
        }
        // 오름차순 정렬
        Arrays.sort(an);

        for (int i = 0; i < an.length; i++){
            System.out.println(an[i]);
        }

  /*      int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        // 점수 저장할 배열
        int[] score = new int[3];


        for(int i=0; i<answers.length; i++) {
            // 맞은갯수 카운트
            if(answers[i] == a[i%a.length]) {score[0]++;}
            if(answers[i] == b[i%b.length]) {score[1]++;}
            if(answers[i] == c[i%c.length]) {score[2]++;}
        }

        // Math.max : 두 인자 값중 큰 값을 리턴
        int maxScore = Math.max(score[0], Math.max(score[1], score[2]));
        
        ArrayList<Integer> list = new ArrayList<>();
        // 가장 큰값과 맞은갯수의 값이 같으면 list에 넣어준다
        if(maxScore == score[0]) {list.add(1);}
        if(maxScore == score[1]) {list.add(2);}
        if(maxScore == score[2]) {list.add(3);}
        // 배열로 변경
        int[] an = list.stream().mapToInt(i->i.intValue()).toArray();


        // 오름차순 정렬
        Arrays.sort(an);

        for (int i = 0; i < an.length; i++){
            System.out.println(an[i]);
        }
*/
    }
}

