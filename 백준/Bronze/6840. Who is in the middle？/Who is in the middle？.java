import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		for (int i = 0; i < 3; i++) {
			ts.add(Integer.parseInt(br.readLine()));
		}
		ts.remove(ts.first());
		bw.write(ts.first().toString());
				
		
		bw.flush();
		bw.close();
		br.close();		
	}
}