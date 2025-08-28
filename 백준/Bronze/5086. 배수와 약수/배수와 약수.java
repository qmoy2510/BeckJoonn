import java.io.*;
import java.math.*;	
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String str;
		while(true) {
			str = br.readLine();
			if(str.equals("0 0")) {
				break;
			}
			StringTokenizer st = new StringTokenizer(str);
			int num01 = Integer.parseInt(st.nextToken());
			int num02 = Integer.parseInt(st.nextToken());
			if(num02%num01==0) {
				bw.write("factor");
				bw.newLine();
				continue;
			}
			if(num01%num02==0) {
				bw.write("multiple");
				bw.newLine();
				continue;
			}
			bw.write("neither");
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}