package com.company.ct0630;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class pro_전화번호목록 {
    public static void main(String[] args) {
        String[] phone_book = {"119", "97674223", "1195524421"};

        boolean answer = true;
/*
        // 오름차순 정렬 -> 빠른비교를위해
        Arrays.sort(phone_book);

        // phone_book 배열의 -1 길이까지 반복
        for (int i = 0; i < phone_book.length-1; i++){
            // i+1번째 값이 i번째 값과 같은 값으로 시작할 때
            if(phone_book[i+1].startsWith(phone_book[i])){
                answer = false;
            }
        }
        System.out.println(answer);*/

/*        // hashMap 사용한 방법
        HashMap<String,Integer> map = new HashMap<>();

        for(int i = 0; i < phone_book.length; i++){
            // 배열값 map에 넣기
            map.put(phone_book[i],i);
            System.out.println("map = " + map);
        }

        for(int i = 0; i < phone_book.length; i++) {
                // 배열의 i번째 값의 길이만큼 -> i번째 값을확인하려고
            for(int j = 1; j < phone_book[i].length(); j++) {
                // map에 배열 i값중 0번째 인덱스부터 j번째 인덱스 까지의 값이 존재하면
                if(map.containsKey(phone_book[i].substring(0,j))) {

                    answer = false;
                    System.out.println(answer);
                }
            }
        }  System.out.println(answer);*/


        HashSet<String> set = new HashSet<>();
        for(int i = 0; i < phone_book.length; i++){

            set.add(phone_book[i]);

            System.out.println("set = " + set);
        }

        for(int i = 0; i < phone_book.length; i++){
            for(int j = 1; j < phone_book[i].length(); j++){
                if(set.contains(phone_book[i].substring(0,j))){

                    answer = false;
                  
                }

            }
        } System.out.println(answer);
    }
}
