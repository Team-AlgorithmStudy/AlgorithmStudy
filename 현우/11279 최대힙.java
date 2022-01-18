import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.zip.CheckedOutputStream;


public class Main {
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		int num = Integer.parseInt(str);
		PriorityQueue<Integer>p = new PriorityQueue<>(Collections.reverseOrder());
		for(int i = 0 ; i< num; i++) {
			int k = Integer.parseInt(bf.readLine());
			if(k == 0) {
				if(p.isEmpty()) {
					System.out.println("0");
				} else {
					System.out.println(p.poll());
				}
			}else {
				p.add(k);
			}
		}
	}
}
