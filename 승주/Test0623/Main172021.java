package test0623;

import java.util.Scanner;

public class Main172021 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        String answer = "";

        for(int i=0; i<8; i++) {

            answer += A.charAt(i);
            answer += B.charAt(i);
        }

//        laptop = answer;

        for (int i = answer.length(); i > 2; i--) {
            String laptop = "";
            for (int j = 0; j < i-1; j++) {
//                laptop += (Integer.parseInt(String.valueOf(answer.charAt(j))) + Integer.parseInt(String.valueOf(answer.charAt(j + 1)))) %10;
//                laptop += ((answer.charAt(j) -48) +(answer.charAt(j+1) -48)) %10;
                laptop += (Character.getNumericValue(answer.charAt(j)) + Character.getNumericValue(answer.charAt(j+1))) % 10;
            }
            answer = laptop;


        }
        System.out.println(answer);

    }

}
