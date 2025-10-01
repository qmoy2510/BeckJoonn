
import java.io.*;
import java.math.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			if(str.equals("Algorithm")) {
				bw.write("204");
				bw.newLine();
				continue;
			}
			if(str.equals("DataAnalysis")) {
				bw.write("207");
				bw.newLine();
				continue;
			}
			if(str.equals("ArtificialIntelligence")) {
				bw.write("302");
				bw.newLine();
				continue;
			}
			if(str.equals("CyberSecurity")) {
				bw.write("B101");
				bw.newLine();
				continue;
			}
			if(str.equals("Network")) {
				bw.write("303");
				bw.newLine();
				continue;
			}
			if(str.equals("Startup")) {
				bw.write("501");
				bw.newLine();
				continue;
			}
			if(str.equals("TestStrategy")) {
				bw.write("105");
				bw.newLine();
				continue;
			}
		}
		
		
		bw.flush();
		bw.close();
		br.close();
	}

}