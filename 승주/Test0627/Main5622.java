package test0627;

import java.util.Scanner;

public class Main5622 {
    /**
     * 다이얼
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numText = scanner.next();
        int timeSum = 0;

        String[] numChar = numText.split("");

        for (String s : numChar) {
            char c = s.charAt(0);
            switch (Character.getNumericValue(c)) {
                case 10 :
                case 11 :
                case 12 : timeSum +=3;
                break;
                case 13 :
                case 14 :
                case 15 : timeSum +=4;
                    break;
                case 16 :
                case 17 :
                case 18 : timeSum +=5;
                    break;
                case 19 :
                case 20 :
                case 21 : timeSum +=6;
                    break;
                case 22 :
                case 23 :
                case 24 : timeSum +=7;
                    break;
                case 25 :
                case 26 :
                case 27 :
                case 28 : timeSum +=8;
                    break;
                case 29 :
                case 30 :
                case 31 : timeSum +=9;
                    break;
                case 32 :
                case 33 :
                case 34 :
                case 35 : timeSum +=10;
                    break;
            }
        }
        System.out.println(timeSum);

    }
}
