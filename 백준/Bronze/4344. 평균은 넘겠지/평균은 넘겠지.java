import java.io.*;
import java.math.*;import java.net.Inet4Address;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int num = Integer.parseInt(br.readLine());
		for (int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			double count=0 ,n= Integer.parseInt(st.nextToken()), avg=0;
			int[] arr = new int[(int)n];
			for (int j = 0; j < n; j++) {
				arr[j]=Integer.parseInt(st.nextToken());
				avg+=arr[j];
			}
			avg/=n;
			for (int j = 0; j < n; j++) {
				if(arr[j]>avg) {
					count++;
				}
			}			
			bw.write(String.format("%.3f", Math.round((count/n)*100000.0)/1000.0)+"%");
			bw.newLine();
		}
		
		
		bw.flush();
		bw.close();
		br.close();		
	}
}