import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		LinkedList<Boolean> ll;
		int num = Integer.parseInt(br.readLine());
		boolean b = false;
		for (int i = 0; i < num; i++) {
			ll = new LinkedList<Boolean>();
			String str = br.readLine();
			b=false;
			for (int j = 0; j < str.length(); j++) {
				if(str.charAt(j) == '(') {
					ll.add(0, true);
				}
				else {
					if(ll.isEmpty()) {
						b=false;
						break;
					}
					else {
						ll.remove(0);
						b=true;
					}
				}
			}
			bw.write((ll.isEmpty()&&b)?"YES":"NO");
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
		br.close();		
	}
}