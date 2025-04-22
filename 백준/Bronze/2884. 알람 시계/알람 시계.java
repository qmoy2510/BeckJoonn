import java.io.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] str = null;
		str = br.readLine().split(" ");
		int h = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		
		m-=45;
		if(m < 0) {
			m = 60 +m;
			h-=1;
		}
		else {
			if(m/60 > 1) {
				m%=60;
				h+=(m/60);
			}
			else {
				m%=60;
			}
		}
		if(h>24) {
			h%=24;
		}
		else if (h<0){
			h = 24+h;
		}
		
		bw.write(h + " " + m + "\n");
		
		bw.flush();
		br.close();
		bw.close();
	}
}