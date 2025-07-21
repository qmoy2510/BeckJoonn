import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		int num = Integer.parseInt(br.readLine()), count=0;;
		for (int i = 0; i < num; i++) {
			if(br.readLine().equals("0")) {
				count--;
			}
			else {
				count++;
			}
		}
		bw.write("Junhee is "+ (count<=0?"not ":"")+"cute!");
		
		bw.flush();
		bw.close();
		br.close();		
	}
}