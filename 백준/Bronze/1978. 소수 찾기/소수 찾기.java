import java.io.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
	
public class Main {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
		int a = Integer.parseInt(br.readLine());
		int[] arr = new int[a];
		int count = 0;

		String[] str = br.readLine().split(" ");
		for (int i = 0; i < a; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		for (int i = 0; i < a; i++) {
			int count2 = 0;
			for (int j = 1; j < arr[i]+1; j++) {
				if(arr[i]%j == 0) {
					count2++;
				}
			}
			if(count2 == 2) {
				count++;
			}
		}
		bw.write(count+"\n");
		
			
			
		bw.flush();
		br.close();
		bw.close();
	}
}