import java.io.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String arr = br.readLine();
		if(arr.equals("1 2 3 4 5 6 7 8")) {
			bw.write("ascending" + "\n");
		}
		else if(arr.equals("8 7 6 5 4 3 2 1")) {
			bw.write("descending" + "\n");
		}
		else {
			bw.write("mixed" + "\n");
		}
		
		
		bw.flush();
		br.close();
		bw.close();
	}
}
