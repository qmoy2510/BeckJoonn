import java.io.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int[] arr = new int[10];
		int count = 0;
		for (int i = 0; i < 10; i++) {
			arr[i] = (Integer.parseInt(br.readLine()))%42;
		}
		Arrays.sort(arr);
		for (int i = 0; i < 10; i++) {
			if (i==9?false:arr[i]!=arr[i+1]) {
				count++;
			}
		}

		bw.write((count+1) + "\n");
		
		
		bw.flush();
		br.close();
		bw.close();
	}
}