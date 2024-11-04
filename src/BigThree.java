import java.util.Scanner;

public class BigThree {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter three numbers:");
		int a=sc.nextInt();
		int b = sc.nextInt();
		int c=sc.nextInt();
		
		int big =(a>b && a>c)?a:(b>a && b>c)?b:c;
        
		System.out.println("Biggest of three is:"+big);

	}

}
