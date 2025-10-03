
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		int n = Integer.parseInt(br.readLine());
		StringBuilder result = new StringBuilder();
		String[] arr = new String[n];
		for (int j = 0; j < arr.length; j++) {
			arr[j]=br.readLine();
		}	
		for (int j = 0; j < arr[0].length(); j++) {
			char c = arr[0].charAt(j);
			boolean b = true;
			for (int j2 = 0; j2 < arr.length-1; j2++) {
				if(c!=arr[j2+1].charAt(j)) {
					b=false;
				}
			}
			if(b) {
				result.append(c);
			}
			else {					
				result.append('?');
			}
		}	
		bw.write(result.toString());
		
		bw.flush();
		bw.close();
		br.close();
	}

}