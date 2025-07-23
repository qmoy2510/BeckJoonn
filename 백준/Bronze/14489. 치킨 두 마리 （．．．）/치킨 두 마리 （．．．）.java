import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int min=Integer.parseInt(st.nextToken()), max=Integer.parseInt(st.nextToken());
		int num = Integer.parseInt(br.readLine())*2;
		if(min+max>=num) {			
			bw.write(String.valueOf((min+max)-num));
		}
		else {
			bw.write(String.valueOf((min+max)));
		}
		
		bw.flush();
		bw.close();
		br.close();		
	}
}