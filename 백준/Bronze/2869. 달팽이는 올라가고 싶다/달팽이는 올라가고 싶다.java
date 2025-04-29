import java.io.*;
import java.lang.*;
import java.util.ArrayList;
import java.util.Arrays;
	
public class Main {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] str = br.readLine().split(" ");
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		int v = Integer.parseInt(str[2]);
		
		bw.write((int)Math.ceil((double)(v-a)/(a-b)) + 1 + "\n");
		
		
		bw.flush();
		br.close();
		bw.close();
	}
}