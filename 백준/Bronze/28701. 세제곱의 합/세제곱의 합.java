import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int num = Integer.parseInt(br.readLine());
		int count =0;
		for (int i = 0; i < num; i++) {
			count += i+1;
		}
		bw.write(count+"\n");
		bw.write((int)Math.pow(count,2)+"\n");
		count=0;
		for (int i = 0; i < num; i++) {
			count += Math.pow((i+1), 3);
		}
		bw.write(count+"\n");
		
		
		bw.flush();
		bw.close();
		br.close();
	}
}