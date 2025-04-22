import java.io.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int r = Integer.parseInt(br.readLine());
		for (int A = 0; A < r; A++) {
			String[] str = br.readLine().split(" ");;
			int h = Integer.parseInt(str[0]);
			int w = Integer.parseInt(str[1]);
			int n = Integer.parseInt(str[2]);
			
			int floor = (n - 1) % h + 1;
			int room = (n - 1) / h + 1;
			
			// 방 번호 출력
			bw.write(floor * 100 + room + "\n");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}