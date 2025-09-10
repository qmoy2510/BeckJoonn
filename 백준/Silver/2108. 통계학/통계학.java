import java.io.*;
import java.math.*;	
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	static HashMap<HashSet<Integer>, Integer> memo = new HashMap<HashSet<Integer>, Integer>();
	static ArrayList<Integer[]> arr;
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(br.readLine());
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		TreeSet<Integer> ts = new TreeSet<Integer>();
		int[] arr = new int[n];
		int result =0;
		int mode = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			result+=arr[i];
			if(hm.containsKey(arr[i])) {
				hm.put(arr[i], hm.get(arr[i])+1);
				continue;
			}
			hm.put(arr[i], 1);
		}
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			int nnn = hm.get(arr[i]);
			if(mode<nnn) {
				mode = nnn;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if(hm.get(arr[i])==mode) {
				ts.add(arr[i]);
			}
		}
		if(ts.size()>1) {
			ts.remove(ts.first());
		}
		bw.write(String.valueOf((int)Math.round(result/(double)n)));
		bw.newLine();
		bw.write(String.valueOf(arr[n/2]));
		bw.newLine();
		bw.write(String.valueOf(ts.first()));
		bw.newLine();
		bw.write(String.valueOf(arr[n-1]-arr[0]));
		bw.newLine();
		
		bw.flush();
		bw.close();
		br.close();
	}
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        