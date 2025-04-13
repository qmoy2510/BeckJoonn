import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int result = 1;
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			int num01 = sc.nextInt();
			int num02 = sc.nextInt();
			System.out.println(num01 + num02);
		}
	}

}