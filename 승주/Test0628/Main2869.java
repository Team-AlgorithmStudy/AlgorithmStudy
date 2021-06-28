package test0628;

import java.util.Scanner;

public class Main2869 {
    /**
     * 달팽이는 올라가고 싶다.
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int V = scanner.nextInt();
        scanner.close();

        int num = (V - B) / (A - B);
        if ((V - B) % (A - B) != 0) {
            num++;
        }

        System.out.println(num);

    }
}
