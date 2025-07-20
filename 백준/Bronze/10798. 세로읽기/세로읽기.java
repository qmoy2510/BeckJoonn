import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ArrayList<ArrayList<Character>> arr = new ArrayList<ArrayList<Character>>();
		for (int i = 0; i < 5; i++) {
			String str = br.readLine();
			ArrayList<Character> a = new ArrayList<Character>();
			for (int j = 0; j < str.length(); j++) {
				a.add(str.charAt(j));
			}
			arr.add(a);
		}
		
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 5; j++) {
				ArrayList<Character> a = arr.get(j);
				if(a.size()>i) {
					bw.write(a.get(i).toString());
				}
			}
		}
		
		bw.flush();
		bw.close();
		br.close();		
	}
}