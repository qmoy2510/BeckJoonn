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
		
		int result = 0;
		for (int i = 0; i < 5; i++) {
			int num = Integer.parseInt(br.readLine());
			if(num<40) {
				result+=40;
			}
			else {
				result+=num;
			}	
		}
		bw.write(result/5+ "\n");
		bw.flush();
		br.close();
		bw.close();
	}
}