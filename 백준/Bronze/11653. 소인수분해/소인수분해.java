import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		double num = Integer.parseInt(br.readLine());
		boolean b = false;
		for (int i = 2; i <= num; i++) {
			while(true) {
				if(num%i==0) {
					bw.write(String.valueOf(i));
					bw.newLine();
					num/=i;
					if(num==1) {
						b=true;
					}
				}
				else {
					break;
				}
			}	
			if(b) {
				break;
			}
		}
		bw.flush();
		bw.close();
		br.close();		
	}
}