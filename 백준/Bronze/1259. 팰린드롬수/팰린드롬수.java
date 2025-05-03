import java.io.*;
import java.lang.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
	
public class Main {
	
	public static int method(String num) {
		for (int i = 0; i < num.length()/2; i++) {
			if(num.charAt(i) != num.charAt(num.length()-i-1)) { 
				return 1;
			}
		}
		return 0;
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while(true) {
			String num = br.readLine();
			if(num.equals("0")) break;
			if(method(num) == 0) {
				bw.write("yes" + "\n");				
			}
			else {
				bw.write("no" + "\n");				
			}
		}
		bw.flush();
		br.close();
		bw.close();
	}
}