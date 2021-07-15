package com.company.ct0714;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class bj2865 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String st[] = br.readLine().split(" ");

        // 예선참가자
        int n = Integer.parseInt(st[0]);
        // 장르
        int m = Integer.parseInt(st[1]);
        // 본선진출
        int k = Integer.parseInt(st[2]);


        // 참가자, 제일 높은 점수 쌍을 저장할 map 선언
        HashMap<Integer, Float> map = new HashMap<>();

        for (int i = 0; i < m; i++) {
            st = br.readLine().split(" ");

            for (int j = 0; j < n * 2; j+=2) {
                int participant = Integer.parseInt(st[j]);
                float score = Float.parseFloat(st[j+1]);

                // map에 이미 있는 참가자면 기존값과 새 값중 더 큰 값을 저장
                if (map.containsKey(participant)) {
                    map.put(participant, score > map.get(participant) ? score : map.get(participant));
                }
                // map에 없는 참가자라면 현재 점수를 넣는다.
                else {
                    map.put(participant, score);
                }
            }
        }

        // map을 value 기준으로 내림차순
        List<Map.Entry<Integer,Float>> list = new ArrayList<Map.Entry<Integer, Float>>(map.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Integer, Float>>() {
            @Override
            public int compare(Map.Entry<Integer, Float> o1, Map.Entry<Integer, Float> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        float answer = 0;
        int count = 0;
        for(Map.Entry<Integer, Float> entry : list){

            if(count == k){
                break;
            }else{
                answer += entry.getValue();
                count++;
            }
        }
        System.out.printf("%.1f\n", answer);

    }
}
