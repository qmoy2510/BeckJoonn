import java.io.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] num = new int[9];

		for (int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(br.readLine());
		}
		int[] arr = Arrays.copyOf(num, num.length);
		Arrays.sort(num);
		bw.write(num[num.length-1] + "\n");
		
		for (int i = 0; i < arr.length; i++) {
			if(num[num.length-1] == arr[i]) {
				bw.write(i+1+ "\n");
			}
						
		}
		
		
		bw.flush();
		br.close();
		bw.close();
	}
}