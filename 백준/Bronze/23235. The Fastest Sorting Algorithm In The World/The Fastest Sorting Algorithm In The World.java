import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		String str;
		int i=1;
		while(true) {
			str=br.readLine();
			if(str.equals("0")) {
				break;
			}
			bw.write("Case "+i+": Sorting... done!");
			bw.newLine();
			i++;
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}