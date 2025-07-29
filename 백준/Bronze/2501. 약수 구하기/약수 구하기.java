
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num1=Integer.parseInt(st.nextToken()), num2=Integer.parseInt(st.nextToken());
		for (int i = 1; i <= num1; i++) {
			if(num1%i==0) {
				num2--;
				if(num2==0) {
					bw.write(String.valueOf(i));
					bw.newLine();
					break;
				}
			}
		}
		if(num2>0) {
			bw.write("0");
			bw.newLine();
		}
		
		
		bw.flush();
		bw.close();
		br.close();		
	}
}