import java.util.Scanner;

public class BigTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int a=sc.nextInt();
		int b = sc.nextInt();
		int big = a>b?a:b;
		
		System.out.println("Biggest of two is:"+big);
	}

}
