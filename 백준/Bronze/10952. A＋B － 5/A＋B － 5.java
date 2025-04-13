import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean b = true;
		while(b) {
			int num01 = sc.nextInt();
			int num02 = sc.nextInt();
			if(num01 + num02 == 0) {
				break;
			}
			System.out.println(num01 + num02);
		}
	}

}