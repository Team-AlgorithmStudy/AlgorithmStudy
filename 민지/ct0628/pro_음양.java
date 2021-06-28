package com.company.ct0628;

public class pro_음양 {

    public static void main(String[] args) {
        int[] absolutes = {4,7,12};
        boolean[] signs = {true,false,true};
        int answer = 0;

        for(int i = 0; i< absolutes.length;  i++){

            if(signs[i] == true){
                answer += absolutes[i];

            }else if (signs[i] == false ){

                answer -= absolutes[i];
            }
        }
        System.out.println(answer);

    }
}
