import java.io.*;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] arr01 = new int[28];
		boolean[] arr02 = new boolean[30];
		int count = 1;

		for (int i = 0; i < arr01.length; i++) {
			arr01[i] = (Integer.parseInt(br.readLine()))-1;
		}

		for (int a : arr01) {
			arr02[a] = true;
		}
		
		for (int i = 0; i < arr02.length; i++) {
			if(arr02[i] == false) {
				bw.write((i+1)+"\n");
			}
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}