import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			String str = bReader.readLine();
			int strSize = str.length();
			boolean check = true;
			if(str.equals("0")) {
				break;
			}
			if(strSize!=1) {
				for(int i=0; i < strSize/2; i++) {
					if(str.charAt(i)!=str.charAt(strSize-1-i)) {
						check = false;
						break;
					}
				}
			}
			if(check) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
		}
	}

}
