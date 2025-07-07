import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		TreeMap<Integer, ArrayList<String>> tm = new TreeMap<Integer, ArrayList<String>>();
		int n;
		StringTokenizer st;
		int num = Integer.parseInt(br.readLine());
		for (int i = 0; i < num; i++) {
			st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			if(tm.containsKey(n)) {
				ArrayList<String> arr = tm.get(n);
				arr.add(arr.size(),st.nextToken());
				tm.put(n, arr);
			}
			else {
				ArrayList<String> arr = new ArrayList<String>();
				arr.add(st.nextToken());
				tm.put(n, arr);
			}
		}
		for (int i = 0; i < num; i++) {			
			if(!tm.isEmpty()) {
				for (int j = 0; j < tm.get(tm.firstKey()).size(); j++) {
					bw.write(tm.firstKey()+" "+tm.get(tm.firstKey()).get(j));
					bw.newLine();
				}
				tm.remove(tm.firstKey());
			}
		}
		
		bw.flush();
		bw.close();
		br.close();		
	}
}