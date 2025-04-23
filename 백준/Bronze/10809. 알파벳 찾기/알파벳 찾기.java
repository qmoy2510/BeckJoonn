import java.io.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		
		String str = br.readLine();
		Integer[] arr = new Integer[26];
		for (int i = 97; i < 123; i++) {
			for (int j = 0; j < str.length(); j++) {
				if(str.charAt(j) == i) {
					if(arr[i-97] == null) {
						arr[i-97] = j;
					}
				}
			}
		}
		for (Integer i : arr) {
			if(i == null) {
				bw.write("-1 ");
			}
			else {
				bw.write(i+" ");
			}
		}
		bw.write("\n");
		
		
		bw.flush();
		br.close();
		bw.close();
	}
}