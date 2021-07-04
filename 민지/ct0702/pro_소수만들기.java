package com.company.ct0702;

import java.util.ArrayList;
import java.util.List;

public class pro_소수만들기 {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4};
        int answer = 0;

        boolean flag = false;
        int sum = 0;
/*
    for(int i = 0; i < nums.length; i++){
        for(int j = i + 1; j < nums.length; j++){
            for(int k = j + 1; k < nums.length; k++){

                sum = nums[i] + nums[j] + nums[k];

                System.out.println(sum);

                if(sum >= 2){
                    flag = sosu(sum);
                }
                if(flag){
                    answer++;
                }
            }
        }
    }
        System.out.println(answer);

}
    public static boolean sosu(int sum){
        boolean check = true;
        if(sum == 2 ){
            return check;
        }
        // 2부터 sum 사이의수 확인
        for(int i = 2; i < sum; i++){
            if(sum % i == 0){
                check = false;
                break;
            }
        }
        return check;
    }*/
        List<Integer> prime = new ArrayList<>();
        for(int i = 0; i < nums.length-2; i++){
            for(int j = i + 1; j < nums.length-1; j++){
                for(int k = j + 1; k < nums.length; k++){

                    sum = nums[i] + nums[j] + nums[k];

                    for(int z = 2; z < sum; z++){
                        if( sum % z == 0){
                            break;
                        }
                        if(z == sum -1){
                            prime.add(sum);
                        }
                    }
                }
            }
        }
        answer = prime.size();
        System.out.println(answer);

    }
}
