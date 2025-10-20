import java.io.*;
import java.math.*;
import java.security.KeyStore.Entry;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		TreeMap<Integer, TreeSet<String>> tm = new TreeMap<Integer, TreeSet<String>>();
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			if(hm.containsKey(str)) {
				hm.put(str, hm.get(str)+1);
			}
			else {
				hm.put(str, 1);
			}
		}
		Iterator<String> it = hm.keySet().iterator();
		while(it.hasNext()) {
			String str = it.next();
			int m = hm.get(str);

			if(tm.containsKey(m)) {
				TreeSet<String> ts = tm.get(m);
				ts.add(str);
				tm.put(m, ts);
			}
			else {
				TreeSet<String> ts = new  TreeSet<String>();
				ts.add(str);
				tm.put(m, ts);
			}
		}
		bw.write(tm.get(tm.lastKey()).first());
		
		bw.flush();
		bw.close();
		br.close();
	}
}