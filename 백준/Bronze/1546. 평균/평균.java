import java.io.*;
import java.lang.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
	
public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		double result = 0;
		double[] arr= new double[n];
		String[] str = br.readLine().split(" ");
		System.out.println();
		for (int i = 0; i < str.length; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			result += arr[i]/arr[arr.length-1]*100;
		}
		bw.write(result/n + "\n");
		
		bw.flush();	
		br.close();
		bw.close();
	}
}