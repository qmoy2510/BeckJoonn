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
		bw.write(sclc(Long.parseLong(str[0]),Long.parseLong(str[1])) + "\n");
		
		bw.flush();
		br.close();
		bw.close();
	}
	static public long sclc(long num01, long num02) {
		return (num01+num02)*(num01-num02);
	}
}