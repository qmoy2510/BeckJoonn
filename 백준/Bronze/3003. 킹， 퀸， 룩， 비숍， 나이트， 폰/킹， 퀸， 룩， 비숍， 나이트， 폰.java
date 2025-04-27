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
		int[] arr = new int[6];
		for (int i=0; i<6; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		bw.write(Integer.toString((1-arr[0])) + " " +
				Integer.toString((1-arr[1])) + " " +
				Integer.toString((2-arr[2])) + " " +
				Integer.toString((2-arr[3])) + " " +
				Integer.toString((2-arr[4])) + " " +
				Integer.toString((8-arr[5])) +"\n");
	
		
		
		bw.flush();
		br.close();
		bw.close();
	}
}