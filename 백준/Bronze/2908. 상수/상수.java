import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
	
public class Main {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
		String[] str = br.readLine().split(" ");
		int num001 = Integer.parseInt(str[0]);
		num001 = (num001%10)*100 + ((num001%100)-(num001%10)) + num001/100;
		int num002 = Integer.parseInt(str[1]);
		num002 = (num002%10)*100 + ((num002%100)-(num002%10)) + num002/100;
		
		if(num001 > num002) {
			bw.write(num001 + "\n");
		}
		else {
			bw.write(num002 + "\n");
		}

		
		
		bw.flush();
		br.close();
		bw.close();
	}
}