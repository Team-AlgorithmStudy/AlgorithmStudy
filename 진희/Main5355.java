import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main5355{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String line;
        float num=0;
        for(int i=0; i<n;i++){
            line = br.readLine();
            String[] lines = line.split(" ");
            num = Float.parseFloat(lines[0]);
            for(int j=1; j<lines.length;j++){
                if(lines[j].equals("@")) num = num*3;
                if(lines[j].equals("%")) num = num+5;
                if(lines[j].equals("#")) num = num-7;
            }
            System.out.printf("%.2f",num);
            System.out.println();
        }

    }
}
