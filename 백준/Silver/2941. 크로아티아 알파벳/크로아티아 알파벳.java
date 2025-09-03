import java.io.*;
import java.math.*;	
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int count = 0;
		StringBuilder sb = new StringBuilder(br.readLine());
		for (int i = 0; i < sb.length(); i++) {
			if(i<sb.length()-2) {
				String str = sb.substring(i, i+3);
				if(str.equals("dz=")) {
					count++;
					i+=2;
					continue;
				}
			}
			if(i<sb.length()-1) {
				String str = sb.substring(i, i+2);
				if(str.equals("c=") 
					|| str.equals("c-") 
					|| str.equals("d-") 
					|| str.equals("lj") 
					|| str.equals("nj") 
					|| str.equals("s=")
					|| str.equals("z=")) {
					count++;
					i++;
					continue;
				}
			}
			count++;
		}
		bw.write(String.valueOf(count));
		
		bw.flush();
		bw.close();
		br.close();
	}
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        