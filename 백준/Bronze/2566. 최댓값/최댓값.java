import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		int[] arr = new int[9];
		int num, max = 0, arrmax = 0;
		for (int i = 0; i < 9; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 9; j++) {
				num = Integer.parseInt(st.nextToken());
				if(max<num) {
					max=num;
					arrmax = i*10+j;
				}
				arr[j] = num;
			}
		}
		bw.write(max+"\n");
		bw.write((arrmax/10+1)+" "+(arrmax%10+1)+"\n");
		
		bw.flush();
		bw.close();
		br.close();
	}
}