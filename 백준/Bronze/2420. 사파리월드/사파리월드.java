import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long a = sc.nextInt();
		long b = sc.nextInt();
		if((a - b) < 0) {
			System.out.println((a - b)*-1);
		}
		else {
			System.out.println(a-b); 
		}
	}

}