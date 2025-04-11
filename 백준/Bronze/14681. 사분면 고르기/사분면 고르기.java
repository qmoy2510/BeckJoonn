import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(0 < a && 0 < b) {
			System.out.println("1");
		}
		else if(0 > a && 0 > b) {
			System.out.println("3");
		}
		else if(0 < a && 0 > b) {
			System.out.println("4");
		}
		else if(0 > a && 0 < b) {
			System.out.println("2");
		}
	}

}