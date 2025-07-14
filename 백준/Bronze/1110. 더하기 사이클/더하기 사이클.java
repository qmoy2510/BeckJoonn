import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		int num = Integer.parseInt(br.readLine()),
				num1 = num/10+num%10, 
				num2 = (num%10)*10+ num1%10;
		int count = 1;
		
		while(true) {
			if(num2 == num) {
				break;
			}
			num1 = num2/10+num2%10;
			num2 = (num2%10)*10+ num1%10;
			count++;
		}
		
		bw.write(count+"\n");
		
		bw.flush();
		bw.close();
		br.close();		
	}
}