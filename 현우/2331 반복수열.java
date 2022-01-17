import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		String s[] = str.split(" ");
		int num = Integer.parseInt(s[0]);
		int p = Integer.parseInt(s[1]);
		boolean check = true;
		Set<Integer>set = new HashSet<Integer>();
		set.add(num);
		while(true) {
			int next = func(num, p);
			num = next;
			if(set.contains(next)) {
				check =false;
				set.remove(next);
			}else {
				if(check) {
					set.add(next);
				}else {
					break;
				}
			}
		}
		System.out.print(set.size());
	}
	public static int func(int num,int p) {
		int sum = 0;
		while(num!=0) {
			sum += Math.pow(num%10, p);
			num/=10;
		}
		return sum;
	}
}
