import java.io.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		if(str.equals("A+")) {
			bw.write("4.3" + "\n"); 
		}
		else if(str.equals("A0")) {
			bw.write("4.0" + "\n"); 
		}
		else if(str.equals("A-")) {
			bw.write("3.7" + "\n"); 
		}
		else if(str.equals("B+")) {
			bw.write("3.3" + "\n"); 
		}
		else if(str.equals("B0")) {
			bw.write("3.0" + "\n"); 
		}
		else if(str.equals("B-")) {
			bw.write("2.7" + "\n"); 
		}
		else if(str.equals("C+")) {
			bw.write("2.3" + "\n"); 
		}
		else if(str.equals("C0")) {
			bw.write("2.0" + "\n"); 
		}
		else if(str.equals("C-")) {
			bw.write("1.7" + "\n"); 
		}
		else if(str.equals("D+")) {
			bw.write("1.3" + "\n"); 
		}
		else if(str.equals("D0")) {
			bw.write("1.0" + "\n"); 
		}
		else if(str.equals("D-")) {
			bw.write("0.7" + "\n"); 
		}
		
		else if(str.equals("F")) {
			bw.write("0.0" + "\n"); 
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}