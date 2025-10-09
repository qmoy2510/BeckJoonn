
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		int result = 0;
		for (int i = 0; i < 8; i++) {
			String str = br.readLine();
			for (int j = 0; j <8; j++) {
				if((i%2!=0&&j%2!=0)||(i%2==0&&j%2==0)) {
					if(str.charAt(j)=='F') {
						result++;
					}
				}
			}
		}
		bw.write(String.valueOf(result));
		
		bw.flush();
		bw.close();
		br.close();
	}
}