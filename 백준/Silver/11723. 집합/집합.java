import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		int num = Integer.parseInt(br.readLine());
		HashSet<Integer> s = new HashSet<Integer>();
		for (int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			if(str.equals("add")) {
				s.add(Integer.parseInt(st.nextToken()));
			}
			else if(str.equals("remove")) {
				s.remove(Integer.parseInt(st.nextToken()));
			}
			else if(str.equals("check")) {
				if(s.contains(Integer.parseInt(st.nextToken()))) {
					bw.write("1");
					bw.newLine();
				}
				else {
					bw.write("0");
					bw.newLine();
				}
			}
			else if(str.equals("toggle")) {
				int num1=Integer.parseInt(st.nextToken());
				if(s.contains(num1)) {
					s.remove(num1);
				}
				else {
					s.add(num1);
				}
			}
			else if(str.equals("all")) {
				s.clear();
				for (int j = 0; j < 20; j++) {
					s.add(j+1);
				}
			}
			else if(str.equals("empty")) {
				s.clear();
			}
		}
		
		bw.flush();
		bw.close();
		br.close();		
	}
}