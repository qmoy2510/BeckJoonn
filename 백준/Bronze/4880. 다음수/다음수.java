
import java.io.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
	
public class Main {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
		String arr = null;
		while(true) {
			arr = br.readLine();
			if(arr.equals("0 0 0")) break;
			String[] str = arr.split(" ");
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			int c = Integer.parseInt(str[2]);
			
			if(b-a == c-b) {
				bw.write("AP " + (c+(b-a)) + "\n");
			}
			else {
				bw.write("GP " + c*(b/a) + "\n");
			}
			
		}
			
			
		bw.flush();
		br.close();
		bw.close();
	}
}