package test0621;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test10807 {
    /**
     * 백준 10807 개수 세기
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int findNum = scanner.nextInt();
        int count = 0;


        for (int number : array) {
            if (number == findNum) {
                count++;
            }
        }


        System.out.println(count);

    }
}
