import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		
		String str = br.readLine();
		if(str.equals("M")) {
			bw.write("MatKor");
		}
		else if(str.equals("W")) {
			bw.write("WiCys");
		}
		else if(str.equals("C")) {
			bw.write("CyKor");
		}
		else if(str.equals("A")) {
			bw.write("AlKor");
		}
		else if(str.equals("$")) {
			bw.write("$clear");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}