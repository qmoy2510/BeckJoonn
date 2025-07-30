import java.io.*;
import java.math.*;import java.net.Inet4Address;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String str = br.readLine().toUpperCase();
		TreeMap<Integer, HashSet<Integer>> tm = new TreeMap<Integer, HashSet<Integer>>();
		int arr[][] = new int[26][1];
		boolean b = true;
		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i)-65][0]++;
		}
		for (int i = 0; i < 26; i++) {
			int getNum=arr[i][0];
			if(getNum!=0) {
				if(tm.containsKey(getNum)) {
					HashSet<Integer> hs = tm.get(getNum);					
					hs.add(i);
					tm.put(getNum, hs);					
				}
				else {
					HashSet<Integer> hs = new HashSet<Integer>();					
					hs.add(i);
					tm.put(getNum, hs);		
				}
			}
		}
		if(tm.get(tm.lastKey()).size()>1) {
			bw.write("?");
			bw.newLine();
		}
		else {
			Iterator<Integer> it = tm.get(tm.lastKey()).iterator();
			bw.write(Character.toChars(it.next()+65));
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
		br.close();		
	}
}