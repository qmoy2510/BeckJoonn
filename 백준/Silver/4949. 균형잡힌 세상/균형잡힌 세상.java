
import java.io.*;
import java.math.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		while(true) {
			String str = br.readLine();
			if(str.equals(".")) {
				break;
			}
			ArrayList<Character> al = new ArrayList<Character>();
			boolean b = false;
			for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				if(c=='(') {
					al.add(0, '(');
				}
				else if(c=='[') {
					al.add(0, '[');
				}
				else if(c==')') {
					if(al.size()>0) {
						if(al.get(0)=='(') {
							al.remove(0);
							continue;
						}
						else {
							break;
						}
					}
					else {
						b=true;
						break;
					}
				}
				else if(c==']') {
					if(al.size()>0) {
						if(al.get(0)=='[') {
							al.remove(0);
							continue;
						}
						else {
							break;
						}
					}
					else {
						b=true;
						break;
					}
				}
			}
			if(al.size()>0||b) {
				bw.write("no");
			}
			else {
				bw.write("yes");
			}
			bw.newLine();
		}
		
		
		bw.flush();
		bw.close();
		br.close();
	}

}