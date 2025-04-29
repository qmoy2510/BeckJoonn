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
		int num01 = Integer.parseInt(str[0]);
		int num02 = Integer.parseInt(str[1]);
		int num03 = Integer.parseInt(str[2]);
		
		if(num01  == num02 && num02 == num03) {
			bw.write(num01 *1000+10000+"\n");
		}
		else if(num01 == num02 || num01 == num03) {
			bw.write(num01*100+1000+"\n");
		}
		else if(num02 == num03) {
			bw.write(num02*100+1000+"\n");
		}
		else {
			bw.write(Math.max(num01, Math.max(num02, num03))*100 +"\n");
		}
		
		
		bw.flush();
		br.close();
		bw.close();
	}
}