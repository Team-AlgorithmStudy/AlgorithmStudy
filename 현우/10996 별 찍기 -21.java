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
		for(int i = 0; i<n; i++) {
			for(int j =0 ;j<2; j++) {
				String str = "";
				for(int k= 0; k<n; k++) {
					if(j%2==0) {
						if(k%2==0) {
							str+="*";
						}else {
							str+=" ";
						}
					}else {
						if(k%2!=0) {
							str+="*";
						}else {
							str+=" ";
						}
					}
				}
				System.out.println(str);
			}
		}
		
	}
