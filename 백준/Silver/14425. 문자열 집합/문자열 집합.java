
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int result = 0;
		for (int i = 0; i < n; i++) {
			hs.add(br.readLine());
		}
		n = Integer.parseInt(st.nextToken());
		for (int i = 0; i < n; i++) {
			if(hs.contains(br.readLine())) {
				result++;
			}
		}
		bw.write(String.valueOf(result));

		bw.flush();
		bw.close();
		br.close();
	}

}