import java.util.Scanner;

public class IfBigFour {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter four numbers:");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		int n4=sc.nextInt();
		
		if(n1>n2 && n1>n3 && n1>n4)
		{
			System.out.println(+n1+" is Greater");
		}
		
		else if(n2>n3 && n2>n4)
		{
			System.out.println(+n2+" is Greater");
		}
		
		else if(n3>n4)
		{
			System.out.println(+n3+" is Greater");
		}
		
		else
		{
		    System.out.println(+n4+" is Greater");
		}

	}

}
