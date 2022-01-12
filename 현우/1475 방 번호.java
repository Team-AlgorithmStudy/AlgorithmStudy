import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int num[] = new int[9];
		Arrays.fill(num, 0);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		for(int i = 0; i<str.length(); i++) {
			int number = str.charAt(i)-'0';
			if(number == 9) {
				num[6]++;
			}else {
				num[number]++;
			}
			
		}
		int needP = -1;
		if(num[6]%2 == 0) {
			num[6]/=2;
		}else {
			num[6]/=2;
			num[6]+=1;
		}
		for(int i =0 ;i < 9; i++) {
			if(needP < num[i]) {
				needP = num[i];
			}
		}
		System.out.print(needP);
		
		
		
	}
}
