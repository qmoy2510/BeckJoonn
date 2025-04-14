import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
		
		int num = Integer.parseInt(br.readLine());
		for (int i = 0; i < num; i++) {
			String str = br.readLine();
			String[] num0 = str.split(" ");
			String result = Integer.toString(Integer.parseInt(num0[0]) + Integer.parseInt(num0[1]));
			bw.write(result + "\n");
		}
		bw.flush();
		br.close();
		bw.close();
	}
}