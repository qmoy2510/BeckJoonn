import java.io.*;
import java.lang.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
	
public class Main {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
	
		while(true) {
			String[] str = br.readLine().split(" ");
			if(str[0].equals("#")) break;
			bw.write(str[0]);
			if(Integer.parseInt(str[1]) > 17 || Integer.parseInt(str[2]) >= 80) {
				bw.write(" Senior\n");
			}
			else {
				bw.write(" Junior\n");				
			}
		}
		
		bw.flush();	
		br.close();
		bw.close();
	}
}