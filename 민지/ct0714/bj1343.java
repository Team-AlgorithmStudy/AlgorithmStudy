package com.company.ct0714;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class bj1343 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
       /* BufferedReader br = new BufferedReader(new InputStreamReader(System.in));*/

  /*      String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        String[] ss = new String[str.length()];*/

        String str = sc.nextLine();
        String[] ss = str.split("");

/*        for(int i = 0; i < ss.length; i++){
            System.out.println(ss[i]);
        }*/
       /* String str = br.readLine();*/

        /*StringTokenizer st = new StringTokenizer(str,".");*/
          /*     for(int i = 0; st.hasMoreTokens(); i++){
            System.out.println(st.nextToken());
        }*/

        String[] a = {"A","A","A","A"};
        String[] b = {"B","B"};
        String answer = "";

        int count = 0;
        boolean ch ;
        for(int i = 0; i < ss.length; i++){

                if(ss[i].equals("X")){
                    count++;
                    if(count == 4){
                        for(int k = 0; k < count; k++){
                            answer += "A";
                        }
                        count = 0;
                    }
                    if((i+1) != ss.length && !ss[i+1].equals("X") ){
                        if(count == 2){
                            for(int j = 0; j < count; j++){
                                answer += "B";
                            }
                            count = 0;
                        }else {
                            ch = true;
                            break;
                        }

                    }

                }if(i == ss.length-1){
                if(count == 2){
                    for(int j = 0; j < count; j++){
                        answer += "B";
                    }
                    count = 0;
                }else {
                    ch = true;
                    break;
                }
            }
                if(ss[i].equals(".")){
                    answer += ".";
                }

        }
        if(ch = true){
            System.out.println("-1");
        }else {
            System.out.println(answer);
        }

/*

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String board = br.readLine(); //문자열

         board = board.replaceAll("XXXX", "AAAA");
         board = board.replaceAll("XX", "BB");

         if(board.contains("X")) {
             System.out.println(-1);
         } else {
             System.out.println(board);
         }
*/


    }
}
