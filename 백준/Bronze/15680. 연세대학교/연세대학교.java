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
		
		if(Integer.parseInt(br.readLine()) == 0) {
			bw.write("YONSEI");
		}
		else {
			bw.write("Leading the Way to the Future");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}