import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int[] arr = new int [3];
		for (int i = 0; i < 3; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		if(arr[0] == 60 && arr[1] == 60 && arr[2] == 60) {
			bw.write("Equilateral");
		}
		else if(arr[0] + arr[1] + arr[2] == 180) {
			if(arr[0] == arr[1] || arr[1] == arr[2] || arr[0] == arr[2]) {
				bw.write("Isosceles");
			}
			else {				
				bw.write("Scalene");
			}
		}
		else {
			bw.write("Error");
		}

		bw.flush();
		bw.close();
		br.close();
	}
}