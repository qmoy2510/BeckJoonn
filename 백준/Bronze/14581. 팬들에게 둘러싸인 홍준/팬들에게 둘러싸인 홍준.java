import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		bw.write(":fan::fan::fan:");
		bw.newLine();
		bw.write(":fan::"+br.readLine()+"::fan:");
		bw.newLine();
		bw.write(":fan::fan::fan:");
		bw.newLine();
		
		bw.flush();
		bw.close();
		br.close();		
	}
}