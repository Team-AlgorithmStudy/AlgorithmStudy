import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main20001 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<String> st = new Stack<>();
        st.push(br.readLine());
        int prob = 0;
        while (true){
            st.push(br.readLine());
            if(st.peek().equals("문제")) {
                prob++;
            } else if (st.peek().equals("고무오리")) {
                if (prob == 0) {
                    prob += 2;
                } else {
                    prob--;
                }
            } else if(st.peek().equals("고무오리 디버깅 끝")){
                break;
            }
        }

        if(prob==0) System.out.println("고무오리야 사랑해");
        if(prob!=0) System.out.println("힝구");
    }
}
