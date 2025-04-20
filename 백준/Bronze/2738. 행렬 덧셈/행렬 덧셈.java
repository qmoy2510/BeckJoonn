import java.io.*;
import java.util.Arrays;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] arr01 = br.readLine().split(" ");
		int[] nm = new int[2];
		
		for (int i = 0; i < 2; i++) {
			nm[i] = Integer.parseInt(arr01[i]);
			
		}
		int[][] a = new int[nm[0]][nm[1]];
		int[][] b = new int[nm[0]][nm[1]];
		int[][] result = new int[nm[0]][nm[1]];
		
		for (int i = 0; i < nm[0]; i++) {
			String[] arr = br.readLine().split(" ");
			for (int j = 0; j < nm[1]; j++) {
				a[i][j] = Integer.parseInt(arr[j]);
			}
		}
		
		for (int i = 0; i < nm[0]; i++) {
			String[] arr = br.readLine().split(" ");
			for (int j = 0; j < nm[1]; j++) {
				b[i][j] = Integer.parseInt(arr[j]);
			}
		}
		
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < nm[1]; j++) {
				result[i][j] = a[i][j] + b[i][j];
			}
		}
		
		for (int i = 0; i < nm[0]; i++) {
			for (int j = 0; j < nm[1]; j++) {
				bw.write(result[i][j] + " ");
			}
			bw.write("\n");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}