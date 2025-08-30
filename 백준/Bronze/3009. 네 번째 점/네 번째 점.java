import java.io.*;
import java.math.*;	
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int[] arr01 = new int[3];
		int[] arr02 = new int[3];
		for (int i = 0; i < 3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr01[i] = Integer.parseInt(st.nextToken());
			arr02[i] = Integer.parseInt(st.nextToken());
		}
		if(arr01[0]==arr01[1]) {
			bw.write(String.valueOf(arr01[2]));
		}
		else if(arr01[1]==arr01[2]) {
			bw.write(String.valueOf(arr01[0]));
		}
		else if(arr01[0]==arr01[2]) {
			bw.write(String.valueOf(arr01[1]));
		}
		bw.write(" ");
		if(arr02[0]==arr02[1]) {
			bw.write(String.valueOf(arr02[2]));
		}
		else if(arr02[1]==arr02[2]) {
			bw.write(String.valueOf(arr02[0]));
		}
		else if(arr02[0]==arr02[2]) {
			bw.write(String.valueOf(arr02[1]));
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}