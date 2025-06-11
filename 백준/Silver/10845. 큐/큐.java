import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int num = Integer.parseInt(br.readLine());
		String str = "";
		LinkedList<Integer> sta = new LinkedList<Integer>();
		for (int i = 0; i < num; i++) {
			str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);
			str = st.nextToken();
			if(str.equals("push")) {
				sta.add((Integer.parseInt(st.nextToken())));
			}
			else if(str.equals("pop")) {
				if(sta.isEmpty()) {
					bw.write("-1\n");	
				}
				else {					
					bw.write(sta.poll()+"\n");
				}
			}
			else if(str.equals("size")) {
				bw.write(sta.size()+"\n");
			}
			else if(str.equals("empty")) {
				if(sta.isEmpty()) {
					bw.write("1\n");
				}
				else {					
					bw.write("0\n");
				}
			}
			else if(str.equals("front")) {
				if(sta.isEmpty()) {
					bw.write("-1\n");
				}
				else {					
					bw.write(sta.get(0)+"\n");
				}
			}
			else if(str.equals("back")) {
				if(sta.isEmpty()) {
					bw.write("-1\n");
				}
				else {					
					bw.write(sta.get(sta.size()-1)+"\n");
				}
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
