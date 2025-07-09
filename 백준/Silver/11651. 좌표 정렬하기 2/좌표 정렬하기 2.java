import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		TreeMap<Integer, TreeSet<Integer>> tm = new TreeMap<Integer, TreeSet<Integer>>();
		int n1, n2;
		StringTokenizer st;
		int num = Integer.parseInt(br.readLine());
		for (int i = 0; i < num; i++) {
			st = new StringTokenizer(br.readLine());
			n1 = Integer.parseInt(st.nextToken());
			n2 = Integer.parseInt(st.nextToken());
			if(tm.containsKey(n2)) {
				TreeSet<Integer> ts = tm.get(n2);
				ts.add(n1);
				tm.put(n2, ts);
			}
			else {
				TreeSet<Integer> ts = new TreeSet<Integer>();
				ts.add(n1);
				tm.put(n2, ts);
			}
		}
		for (int i = 0; i < num; i++) {			
			if(!tm.isEmpty()) {
				Iterator<Integer> it = tm.get(tm.firstKey()).iterator();
				while(it.hasNext()) {
					bw.write(String.valueOf(it.next())+" "+tm.firstKey());
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