import java.io.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = null;
		while(true) {
			str = br.readLine();
			if(str.equals("0 0 0")) {
				break;
			}
			String[] arr1 = str.split(" ");
			int[] arr = new int[3];
			for (int i = 0; i < 3; i++) {
				arr[i] = Integer.parseInt(arr1[i]);
			}
			Arrays.sort(arr);	
			if(Math.pow(arr[0], 2) + Math.pow(arr[1], 2)== 
					Math.pow(arr[2], 2)) {
				bw.write("right"+ "\n");				
			}
			else {				
				bw.write("wrong"+ "\n");				
			}
				
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}