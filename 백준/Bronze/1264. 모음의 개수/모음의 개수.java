import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
	
public class Main {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
		String str = new String(); 
		while(true) {
			int count = 0;
			str =  br.readLine();
			if(str.equals("#")) break;
			for (int i = 0; i < str.length(); i++) {
				if(str.charAt(i) == 'a'
						||str.charAt(i) == 'e'
								||str.charAt(i) == 'i'
										||str.charAt(i) == 'o'
												||str.charAt(i) == 'u') {
					count++;
				}
				else if(str.charAt(i) == 'A'
						||str.charAt(i) == 'E'
						||str.charAt(i) == 'I'
						||str.charAt(i) == 'O'
						||str.charAt(i) == 'U') {
					count++;
				}
			}
			bw.write(count+"\n");
		}
		
		
		bw.flush();
		br.close();
		bw.close();
	}
}
