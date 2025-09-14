import java.io.*;
import java.math.*;	
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
			
		String str = br.readLine();
		if(str.equals("SONGDO")) {
			bw.write("HIGHSCHOOL");
		}
		else if(str.equals("CODE")) {
			bw.write("MASTER");
		}
		else if(str.equals("2023")) {
			bw.write("0611");
		}
		else if(str.equals("ALGORITHM")) {
			bw.write("CONTEST");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        