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
		int num[] = new int[26];
		Arrays.fill(num, 0);
		char ans = ' ';
		int key = -1;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		str = str.toUpperCase();
		for(int i = 0;i < str.length(); i++) {
			num[str.charAt(i)-'A']++;
		}
		for(int i = 0; i<26; i++) {
			if(num[i]!=0 && key<num[i]) {
				key = num[i];
				ans = (char) (i+'A');
				continue;
			}
			if(num[i]!=0 && key == num[i]) {
				ans = '?';
			}
		}
		System.out.print(ans);
		
	}
}
