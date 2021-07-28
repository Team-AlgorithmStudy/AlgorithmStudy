package com.company.ct0728;

import java.util.Scanner;

public class bj2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] croatia = {"c=","c-","dz=","d-","lj","nj","s=","z="};

        String str = sc.nextLine();
        for(int i = 0; i < croatia.length; i++){
            if(str.contains(croatia[i])){
                // 크로아티아 알파벳이 발견되면 그것을 공백으로 치환 -> replaceAll
                str = str.replaceAll(croatia[i]," " );
            }
        }
        System.out.println(str.length());
       /* String[] word = sc.nextLine().split("");
        int count = 0;

        for(int i = 0; i< word.length; i++){

            if (i == word.length-1){
                count++;
                break;
            }else if(word[i].equals("c")){
                if(word[i+1].equals("=") || word[i+1].equals("-")){
                    count++;
                    i++;
                }else if(!word[i+1].equals("=") || word[i+1].equals("-")){
                    count++;
                }
            }else if(word[i].equals("d")){
                if(word[i+1].equals("-")){
                    count++;
                    i++;
                }else if(word[i+1].equals("z")){
                    if(i+1 != word.length-1){
                        if( word[i+2].equals("=")){
                            count++;
                            i++;
                            i++;
                        }else {
                            count++;
                        }
                    }else {
                        count++;
                    }

                }else {
                    count++;
                }

            }else if (word[i].equals("l") || word[i].equals("n")){
                if(word[i+1].equals("j")){
                    count++;
                    i++;
                }else if(!word[i+1].equals("j")){
                    count++;
                }
            }else if(word[i].equals("s") || word[i].equals("z")){
                if(word[i+1].equals("=")){
                    count++;
                    i++;
                }else if(!word[i+1].equals("=")){
                    count++;
                }
            } else {
                count++;
            }
        }
        System.out.println(count);*/
    }
}
