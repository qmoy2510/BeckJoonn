import java.io.*;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
	
public class Main {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		int count = 0;
		BigInteger result = new BigInteger("1");
		for (int i = 0; i < num; i++) {
			result = result.multiply(result.valueOf(num-i));
		}
		String str = result.toString();
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(str.length()-i-1) == '0') {
				count++;
			}
			else {
				break;
			}
		}
		bw.write(count + "\n");
		
		
		bw.flush();
		br.close();
		bw.close();
	}
}