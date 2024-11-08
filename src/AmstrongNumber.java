import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		int num,c=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number:");
		num=sc.nextInt();
		
		int orgnum=num;
		
		while(num>0) {
			c++;
			num=num/10;
		}
		
		System.out.println("Number of digits is:"+c);
		
		num=orgnum;
		int s=0;
		
		while(num>0)
		{
			int d=num%10;
			s+=Math.pow(d, c);
			num=num/10;
		}
		
		if(orgnum==s)
		{
			System.out.println(orgnum+" is a amstrong number");
			
		}
		else
		{
			System.out.println(orgnum+" is not a amstrong number");
		}

	}

}
