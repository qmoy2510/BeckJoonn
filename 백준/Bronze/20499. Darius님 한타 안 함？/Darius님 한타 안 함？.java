import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception {
		StringTokenizer st = new StringTokenizer(br.readLine(),"/");
		int[] arr = new int[3];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		if(arr[0]+arr[2]<arr[1] || arr[1] == 0)
			bw.write("hasu");
		else
			bw.write("gosu");
		
		
		bw.flush();
		bw.close();
		br.close();
	}

}
