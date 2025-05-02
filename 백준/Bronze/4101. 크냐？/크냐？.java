import java.io.*;
import java.lang.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
	
public class Main {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int a,b;
		while(true) {
			String str = br.readLine();
			if(str.equals("0 0")) break;
			String[] arr = str.split(" ");
			a = Integer.parseInt(arr[0]);
			b = Integer.parseInt(arr[1]);
			if(a>b) {
				bw.write("Yes" +"\n");
			}
			else {
				bw.write("No" +"\n");
			}
			
		}
		
		
		bw.flush();
		br.close();
		bw.close();
	}
}