import java.util.Scanner;

public class Main5622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String arr[] = str.split("");
        int arrTime[] = {3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,8,8,8,8,9,9,9,10,10,10};
        int sum = 0;
        for(int i =0; i<arr.length;i++){
            int a = arr[i].charAt(0)-'A';
            sum += arrTime[a];
        }
        System.out.println(sum);
    }
}
