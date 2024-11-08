
public class ReverseNumber {

	public static void main(String[] args) {
		int num=121;
		int rev=0;
		
		int num1=num;
		
		while(num>0)
		{
			int digit=num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		
		System.out.println(rev);

		//check for palindrome
		
		if(rev==num1)
		{
			System.out.println("Palindrome");
		}
		
		else
		{
			System.out.println("Not Palindrome");
		}
	}

}
