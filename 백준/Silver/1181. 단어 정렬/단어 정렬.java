
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		int num = Integer.parseInt(br.readLine());
		TreeMap<Integer, TreeSet<String>> tm = new TreeMap<Integer, TreeSet<String>>();
		TreeSet<Integer> tss = new TreeSet<Integer>();
		for (int i = 0; i < num; i++) {
			String str = br.readLine();
			tss.add(str.length());
			if(!tm.containsKey(str.length())) {
				TreeSet<String> ts = new TreeSet<String>();
				ts.add(str);
				tm.put(str.length(), ts);
			}
			else {
				TreeSet<String> ts = tm.get(str.length());
				ts.add(str);
				tm.put(str.length(), ts);
			}
		}
		Iterator<Integer> it1 = tss.iterator();
		while(it1.hasNext()) {
			Iterator<String> it = tm.get(it1.next()).iterator();
			while(it.hasNext()) {
				bw.write(it.next());
				bw.newLine();
			}
		}
		bw.flush();
		bw.close();
		br.close();		
	}
}