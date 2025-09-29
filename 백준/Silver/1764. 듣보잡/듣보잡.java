
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		StringTokenizer st = new StringTokenizer(br.readLine());
		HashSet<String> hs = new HashSet<String>();
		TreeSet<String> rs = new TreeSet<String>();
		
		int n = Integer.parseInt(st.nextToken());
		for (int i = 0; i < n; i++) {
			hs.add(br.readLine());
		}
		n = Integer.parseInt(st.nextToken());
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			if(hs.contains(str)) {
				rs.add(str);
			}
		}
		bw.write(String.valueOf(rs.size()));
		bw.newLine();
		rs.stream().forEach(str->{
			try {
				bw.write(str);
				bw.newLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		bw.flush();
		bw.close();
		br.close();
	}

}