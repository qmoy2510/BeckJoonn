import java.io.*;
import java.math.*;	
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(br.readLine());
		double b=Double.parseDouble(br.readLine()), 
				c=Double.parseDouble(br.readLine()), 
				d=Double.parseDouble(br.readLine()), 
				e=Double.parseDouble(br.readLine());
		bw.write(String.valueOf(a-(int)Math.max(Math.ceil(b/d), Math.ceil(c/e))));
		
		
		bw.flush();
		bw.close();
		br.close();
	}
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        