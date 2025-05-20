import java.io.*;
import java.lang.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;
	
public class Main {
	
	static public int[] solution(int[] numlist, int n) {
        int[] answer = {};
        return answer;
    }
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < i+1; j++) {
				bw.write("*");
			}
			for (int j = 0; j < (num-i)*2-2; j++) {
				bw.write(" ");
			}
			for (int j = 0; j <i+1; j++) {
				bw.write("*");
			}
			bw.write("\n");
		}
		for (int i = 1; i < num; i++) {
			for (int j = 0; j < num-i; j++) {
				bw.write("*");
			}
			for (int j = 0; j < i*2; j++) {
				bw.write(" ");
			}
			for (int j = 0; j <num-i; j++) {
				bw.write("*");
			}
			bw.write("\n");
		}
	
		

		
		bw.flush();	
		br.close();
		bw.close();
	}
}