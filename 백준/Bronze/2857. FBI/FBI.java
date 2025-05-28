import java.io.*;
import java.lang.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;
	
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int count = 0;
		for (int i = 0; i < 5; i++) {
			String str = br.readLine();
			for (int j = 0; j < str.length(); j++) {
				if(str.charAt(j) == 'F') {
					if(str.charAt(j+1) == 'B') {
						if(str.charAt(j+2) == 'I') {
							count++;
							bw.write(i+1+" ");
							break;
						}
					}
				}
			}
		}
		if(count==0) {
			bw.write("HE GOT AWAY!");	
		}
		bw.flush();	
		br.close();
		bw.close();
	}
}