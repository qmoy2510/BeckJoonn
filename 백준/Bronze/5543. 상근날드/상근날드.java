import java.io.*;
import java.math.*;	
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		bw.write(String.valueOf(Math.min(Math.min(Integer.parseInt(br.readLine()), 
				Integer.parseInt(br.readLine())), Integer.parseInt(br.readLine())
				)+Math.min(Integer.parseInt(br.readLine())
						, Integer.parseInt(br.readLine()))-50));
		
		bw.flush();
		bw.close();
		br.close();
	}
}