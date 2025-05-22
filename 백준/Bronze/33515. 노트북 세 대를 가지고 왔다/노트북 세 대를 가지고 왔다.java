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
		
		String[] str = br.readLine().split(" ");
		int num1 = Integer.parseInt(str[0]);
		int num2 = Integer.parseInt(str[1]);
		bw.write(String.valueOf(num1<num2?num1:num2));
		bw.write("\n");
		
		
		bw.flush();	
		br.close();
		bw.close();
	}
}