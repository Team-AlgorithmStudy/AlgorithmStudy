package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			int count = Integer.parseInt(br.readLine());
			int list[] = new int[count];
			for (int i = 0; i < count; i++) {
				String[] strs = br.readLine().split(" ");

				int A = Integer.parseInt(strs[0]);
				int B = Integer.parseInt(strs[1]);
				list[i] = A + B;
			}
			for (int i = 0; i < list.length; i++) {
				bw.write(list[i] + "\n"); // 버퍼에 있는 값 전부 출력
			}
			bw.flush(); // 남아있는 데이터를 모두 출력시킴
			bw.close(); // 스트림을 닫음
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
