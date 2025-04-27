import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
	
public class Main {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		str = br.readLine().split(" ");
		int[] arr = new int[n];
		int result=0;
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}	
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				for (int j2 = 0; j2 < arr.length; j2++) {
					if(i != j && i != j2 && j != j2) {
						if(arr[i] + arr[j] + arr[j2] <= m && result < arr[i] + arr[j] + arr[j2]) {
							result = arr[i] + arr[j] + arr[j2];
						}
					}
					if(result == m) {
						break;
					}
				}
				if(result == m) {
					break;
				}
			}
			if(result == m) {
				break;
			}
		}
		bw.write(result + "\n");
	
		
		
		bw.flush();
		br.close();
		bw.close();
	}
}