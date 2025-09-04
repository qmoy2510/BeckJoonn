import java.io.*;
import java.math.*;	
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		StringTokenizer st = new StringTokenizer(br.readLine());
		String str01 = st.nextToken();
		String str02 = st.nextToken();
		int num = Integer.parseInt(st.nextToken());
		int kingX = str01.charAt(0)-'A', kingY = str01.charAt(1)-'1';
		int stoneX = str02.charAt(0)-'A', stoneY = str02.charAt(1)-'1';
		for (int i = 0; i < num; i++) {
			String str = br.readLine();
			if(str.equals("R")) {
				if(kingX+1>7) {
					continue;
				}
				if(kingX+1==stoneX&&kingY==stoneY) {
					if(stoneX+1>7) {
						continue;
					}
					kingX+=1;
					stoneX+=1;
					continue;
				}
				kingX+=1;
				continue;
			}
			if(str.equals("L")) {
				if(kingX-1<0) {
					continue;
				}
				if(kingX-1==stoneX&&kingY==stoneY) {
					if(stoneX-1<0) {
						continue;
					}
					kingX-=1;
					stoneX-=1;
					continue;
				}
				kingX-=1;
				continue;
			}
			if(str.equals("T")) {
				if(kingY+1>7) {
					continue;
				}
				if(kingY+1==stoneY&&kingX==stoneX) {
					if(stoneY+1>7) {
						continue;
					}
					kingY+=1;
					stoneY+=1;
					continue;
				}
				kingY+=1;
				continue;
			}
			if(str.equals("B")) {
				if(kingY-1<0) {
					continue;
				}
				if(kingY-1==stoneY&&kingX==stoneX) {
					if(stoneY-1<0) {
						continue;
					}
					kingY-=1;
					stoneY-=1;
					continue;
				}
				kingY-=1;
				continue;
			}
			if(str.equals("RT")) {
				if(kingX+1>7||kingY+1>7) {
					continue;
				}
				if(kingX+1==stoneX && kingY+1==stoneY) {
					if(stoneX+1>7||stoneY+1>7) {
						continue;
					}
					kingX+=1;
					kingY+=1;
					stoneX+=1;
					stoneY+=1;
					continue;
				}
				kingX+=1;
				kingY+=1;
				continue;
			}
			if(str.equals("LT")) {
				if(kingX-1<0||kingY+1>7) {
					continue;
				}
				if(kingX-1==stoneX && kingY+1==stoneY) {
					if(stoneX-1<0||stoneY+1>7) {
						continue;
					}
					kingX-=1;
					kingY+=1;
					stoneX-=1;
					stoneY+=1;
					continue;
				}
				kingX-=1;
				kingY+=1;
				continue;
			}
			if(str.equals("RB")) {
				if(kingX+1>7||kingY-1<0) {
					continue;
				}
				if(kingX+1==stoneX && kingY-1==stoneY) {
					if(stoneX+1>7||stoneY-1<0) {
						continue;
					}
					kingX+=1;
					kingY-=1;
					stoneX+=1;
					stoneY-=1;
					continue;
				}
				kingX+=1;
				kingY-=1;
				continue;
			}
			if(str.equals("LB")) {
				if(kingX-1<0||kingY-1<0) {
					continue;
				}
				if(kingX-1==stoneX && kingY-1==stoneY) {
					if(stoneX-1<0||stoneY-1<0) {
						continue;
					}
					kingX-=1;
					kingY-=1;
					stoneX-=1;
					stoneY-=1;
					continue;
				}
				kingX-=1;
				kingY-=1;
				continue;	
			}
		}
		bw.write(Character.toString(kingX+'A')+String.valueOf(kingY+1));
		bw.newLine();
		bw.write(Character.toString(stoneX+'A')+String.valueOf(stoneY+1));
		bw.newLine();

		
		bw.flush();
		bw.close();
		br.close();
	}
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        