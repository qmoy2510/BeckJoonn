import java.io.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] str = br.readLine().split(" ");
		int count=0;
		for (int i = 0; i < str.length; i++) {
			count += Math.pow(Integer.parseInt(str[i]), 2);
		}
		bw.write(count%10 + "\n");
		
		bw.flush();
		br.close();
		bw.close();
	}
	static public long sclc(long num01, long num02) {
		return (num01+num02)*(num01-num02);
	}
}
