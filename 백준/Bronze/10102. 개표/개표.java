
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		int result01 = 0;
		int result02 = 0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)=='A') {
				result01++;
			}
			else if(str.charAt(i)=='B') {
				result02++;
			}
		}
		if(result01==result02) {
			bw.write("Tie");
		}
		else if(result01>result02) {
			bw.write("A");
		}
		else if(result01<result02) {
			bw.write("B");
		}

		bw.flush();
		bw.close();
		br.close();
	}

}