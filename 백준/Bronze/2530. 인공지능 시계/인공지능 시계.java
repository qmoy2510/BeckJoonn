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
		
		String[] str = br.readLine().split(" ");
		int num = Integer.parseInt(br.readLine());
		int count = 0;
		count += Integer.parseInt(str[0])*3600;
		count += Integer.parseInt(str[1])*60;
		count += Integer.parseInt(str[2]);
		count += num;
		
		bw.write((count/3600)%24 + " "+ (count/60)%60+" "+count%60);
		
		bw.write("\n");
		
		bw.flush();	
		br.close();
		bw.close();
	}
}