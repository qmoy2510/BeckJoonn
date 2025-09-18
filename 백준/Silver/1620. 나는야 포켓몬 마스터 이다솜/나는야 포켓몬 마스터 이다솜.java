import java.io.*;
import java.math.*;	
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		HashMap<String, String> hm1 = new HashMap<String, String>();
		HashMap<String, String> hm2 = new HashMap<String, String>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		for (int i = 1; i <= n; i++) {
			String str = br.readLine();
			hm1.put(String.valueOf(i), str);
			hm2.put(str, String.valueOf(i));
		}
		for (int i = 0; i < m; i++) {
			String str = br.readLine();
			if(hm1.containsKey(str)) {
				bw.write(hm1.get(str));
				bw.newLine();
				continue;
			}
			bw.write(hm2.get(str));
			bw.newLine();
		}

		
		bw.flush();
		bw.close();
		br.close();
	}

}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        