import java.io.*;
import java.lang.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
	
public class Main {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num01 = Integer.parseInt(br.readLine());
		String num02 = br.readLine();
		for (int i = 2; i >= 0; i--) {			
			bw.write(num01*Integer.parseInt(String.valueOf(num02.charAt(i)))+"\n");
		}
		bw.write(num01*Integer.parseInt(num02)+"\n");
		
		bw.flush();	
		br.close();
		bw.close();
	}
}