import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int num = Integer.parseInt(br.readLine());
		ArrayList<Character> arr = new ArrayList<Character>();
		String str = null;
		boolean b;
		int count = 0;
		for (int i = 0; i < num; i++) {
			arr.clear();
			b = true;
			str = br.readLine();
			arr.add(str.charAt(0));
			for (int j = 1; j < str.length(); j++) {
				if(arr.indexOf(str.charAt(j)) == -1) {
					arr.add(str.charAt(j));
				}else if(str.charAt(j) != str.charAt(j-1)){
					b = false;
					break;
				}
			}
			if(b) {
				count++;
			}
		}
		bw.write(String.valueOf(count));
		
		bw.flush();
		bw.close();
		br.close();
	}
}