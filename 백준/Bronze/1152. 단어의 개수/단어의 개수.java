import java.io.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str1 = br.readLine();
		if(str1.equals(" ")) {
			System.out.println("0");
			System.exit(0);
		}
		String[] str = str1.split(" ");
		if(str[0] == "" || str[str.length-1] == "") {
			bw.write((str.length-1) + "\n" );
		}
		else {
			bw.write(str.length + "\n" );
		}
		
		
		bw.flush();
		br.close();
		bw.close();
	}
}