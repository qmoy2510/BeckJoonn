import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int result = 1;
		int num = sc.nextInt();
		if(num == 0) {
			result = 1;
		}
		for (int i = 1; i <= num; i++) {
			result *= i;
		}
		System.out.println(result);
	}

}