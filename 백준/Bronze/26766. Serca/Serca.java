
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		int n = Integer.parseInt(br.readLine());
		String str = " @@@   @@@ \n"
				+ "@   @ @   @\n"
				+ "@    @    @\n"
				+ "@         @\n"
				+ " @       @ \n"
				+ "  @     @  \n"
				+ "   @   @   \n"
				+ "    @ @    \n"
				+ "     @     ";
		for (int i = 0; i < n; i++) {
			bw.write(str);
			bw.newLine();
			
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

}