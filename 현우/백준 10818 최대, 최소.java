import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bReader.readLine());
		String s = bReader.readLine();
		String arr[] = s.split("\\s+");
		int arrSize = arr.length;
		int arrInt[] = new int[arrSize]; ;
		for(int i =0 ;i<arrSize; i++) {
			arrInt[i] = Integer.parseInt(arr[i]);
		}
		Arrays.sort(arrInt);
		System.out.print(arrInt[0]+" "+arrInt[arrSize-1]);
	}

}
