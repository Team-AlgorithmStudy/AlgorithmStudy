package com.company.ct0721;

import java.util.LinkedList;
import java.util.List;

public class bj6679 {
    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();
       for(int i = 1000; i <= 9999; i++){
           String o = toDeposition(Integer.parseInt(String.valueOf(i)),10);
           String t = toDeposition(Integer.parseInt(String.valueOf(i)),12);
           String s = toDeposition(Integer.parseInt(String.valueOf(i)),16);


         for(int j = 0; j <o.length(); j++){
             int sum1 = Integer.parseInt(o);
             for(int k = 0; k < t.length(); k++){
                 int sum2 = Integer.parseInt(t);
                 for(int x = 0; x < s.length(); x++){
                     int sum3 = Integer.parseInt(s);
                     if(sum1 == sum2 && sum2 == sum3){
                         list.add(i);
                     }
                 }
             }
         }
       }

       for(int i = 0; i < list.size(); i++){
           System.out.println(list.get(i));
       }
    }

 /*   for(int i=1000; i<=9999; i++)
    {
        int sum_10 = 0;
        int sum_12 = 0;
        int sum_16 = 0;

        for(int n=i; n>0; n/=10)
            sum_10 += n%10;

        for(int n=i; n>0; n/=12)
            sum_12 += n%12;

        for(int n=i; n>0; n/=16)
            sum_16 += n%16;

        if(sum_10 == sum_12 && sum_12 == sum_16)
            System.out.println(i);
    }*/
    public static String toDeposition(int value, int i){

        String returnString = "";
        String temp = "";


        while(value != 0){

            // 나머지가 0~9 사이이면  캐릭터 값을 배열에 저장
            if( (value % i) < 10 ) {
                //문자열 우->좌로 배열
                returnString = (value % i) + returnString;
                //몫을 구함
                value /= i;
            }
            // 나머지가 10 이상이면 해당하는 값의 알파벳을 저장
            else {
                int temp1 = (char)((value % i)  + 55);

                returnString = Integer.toString(temp1) + returnString;
            }

        }

        return returnString;

    }
}
