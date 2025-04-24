import java.io.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
	
public class Main {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
		long num = Integer.parseInt(br.readLine());
		long[] sss = new long[6];
		String[] str = br.readLine().split(" ");
		for (int i = 0; i < 6; i++) {
			sss[i] = Integer.parseInt(str[i]);
		}
		str = br.readLine().split(" ");
		int[] tp = new int[2];
		tp[0] = Integer.parseInt(str[0]);
		tp[1] = Integer.parseInt(str[1]);
		
		int cnt = 0;
		for (int i = 0; i < sss.length; i++) {
			if(sss[i]%tp[0]!=0) {
				cnt+=1;
			}
			cnt+=sss[i]/tp[0];
		}
		bw.write(cnt+"\n");
		bw.write(num/tp[1] + " " + num%tp[1]);
		
		bw.flush();
		br.close();
		bw.close();
	}
}