import java.io.*;
import java.math.*;
import java.security.KeyStore.Entry;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		LinkedList<String> ll = new LinkedList<String>();
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			if(str.charAt(0)=='1') {
				StringTokenizer st = new StringTokenizer(str," ");
				st.nextToken();
				ll.add(0, st.nextToken());
				continue;
			}
			else if(str.equals("2")) {
				if(ll.isEmpty()) {
					bw.write("-1");
				}
				else {
					bw.write(ll.get(0));
					ll.remove(0);
				}
			}
			else if(str.equals("3")) {
				bw.write(String.valueOf(ll.size()));
			}
			else if(str.equals("4")) {
				if(ll.isEmpty()) {
					bw.write("1");
				}
				else {
					bw.write("0");
				}
			}
			else if(str.equals("5")) {
				if(ll.isEmpty()) {
					bw.write("-1");
				}
				else {
					bw.write(ll.get(0));
				}
			}
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}