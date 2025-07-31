import java.io.*;
import java.math.*;import java.net.Inet4Address;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int num = Integer.parseInt(br.readLine());
		LinkedList<Integer> ll = new LinkedList<Integer>();
		for (int i = 0; i < num; i++) {
			int n = Integer.parseInt(br.readLine());
			if(n==0) {
				if(!ll.isEmpty()) {
					ll.remove(0);
				}
			}
			else {
				ll.add(0, n);
			}
		}
		Iterator<Integer> it = ll.iterator();
		int count = 0;
		while(it.hasNext()) {
			count += it.next();
		}
		bw.write(String.valueOf(count));
		
		bw.flush();
		bw.close();
		br.close();		
	}
}