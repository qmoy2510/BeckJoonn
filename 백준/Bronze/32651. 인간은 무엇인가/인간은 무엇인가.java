import java.io.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
	
public class Main {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
		long num = Integer.parseInt(br.readLine());
		if(num%2024==0 && num/2024 <= 100000/2024&&num!=0)
		{
			bw.write("Yes"+"\n");
		}
		else {
				bw.write("No" + "\n");
		}
			
			
		bw.flush();
		br.close();
		bw.close();
	}
}