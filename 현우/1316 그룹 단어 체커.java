import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int ans = 0;
		for(int j =0 ;j<n;j++) {
			String str = bf.readLine();
			Set<Character>s = new HashSet<>();
			boolean check = true;
			for(int i =0 ;i<str.length();i++) {
				if(s.contains(str.charAt(i))&&str.charAt(i-1)!=str.charAt(i)) {
					check = false;
					break;
				}else {
					s.add(str.charAt(i));
				}
			}
			if(check) {
				ans++;
			}
		}
		System.out.print(ans);
		
	}
}
