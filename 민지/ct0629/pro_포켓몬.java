package com.company.ct0629;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class pro_포켓몬 {
    public static void main(String[] args) {

        int[] nums = {3,1,2,3};
        int answer = 0;

        // 중복값 제거 - 지영이가 알려준거
        HashSet<Integer> set = new HashSet<Integer>();

        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        for(int i = 0; i < set.size(); i++){
            answer++;
            // answer 이 nums 길이의 1/2 가 되면 브레이크
            if(answer == nums.length / 2){
                break;
            }

        } System.out.println(answer);

       /*   // 중복값 제거
        int[] num = Arrays.stream(nums).distinct().toArray();
        for(int i = 0; i < num.length; i++){

            answer++;
            // answer 이 nums 길이의 1/2 가 되면 브레이크
            if(answer == nums.length / 2){
                break;
            }
        }
        System.out.println(answer);*/
    }
}
