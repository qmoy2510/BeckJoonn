import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		bw.write(String.valueOf(Integer.parseInt(br.readLine())%21));
		
		bw.flush();
		bw.close();
		br.close();
	}
}