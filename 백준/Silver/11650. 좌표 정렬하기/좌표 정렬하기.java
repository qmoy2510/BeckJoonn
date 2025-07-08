import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		TreeMap<Integer, TreeSet<Integer>> tm = new TreeMap<Integer, TreeSet<Integer>>();
		int n;
		StringTokenizer st;
		int num = Integer.parseInt(br.readLine());
		for (int i = 0; i < num; i++) {
			st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			if(tm.containsKey(n)) {
				TreeSet<Integer> ts = tm.get(n);
				ts.add(Integer.parseInt(st.nextToken()));
				tm.put(n, ts);
			}
			else {
				TreeSet<Integer> ts = new TreeSet<Integer>();
				ts.add(Integer.parseInt(st.nextToken()));
				tm.put(n, ts);
			}
		}
		for (int i = 0; i < num; i++) {			
			if(!tm.isEmpty()) {
				Iterator<Integer> it = tm.get(tm.firstKey()).iterator();
				while(it.hasNext()) {
					bw.write(tm.firstKey()+" "+String.valueOf(it.next()));
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