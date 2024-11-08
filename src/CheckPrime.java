import java.util.Scanner;

class Prime
{
	
	int num,cnt=0; // instance variables
	
	void input()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number:");
		num=sc.nextInt();
		
	}
	
	void chekPrime()
	{
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				cnt++;
			}
		}
		
		if(cnt==2)
		{
			System.out.println(num+" is a prime number");
		}
		else
		{
			System.out.println(num+" is not a prime number");
		}

	}

	}
		
		
public class CheckPrime {

	public static void main(String[] args) {
		Prime obj = new Prime();
		obj.input();
		obj.chekPrime();
	}

}
