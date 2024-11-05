import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		
		System.out.println("Enter your choice:");
		int choice=sc.nextInt();
		
		System.out.println("Enter two numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int result;
		switch(choice)
		{
		    case 1: result=a+b;
		            System.out.println("The sum of "+a +" and "+b+ " is "+result);
		            break;
		            
		    case 2 : result=a-b;
		            System.out.println("The difference of "+a +" and "+b+ " is "+result);
		             break;
		             
		    case 3 : result=a*b;
		             System.out.println("The product of "+a +" and "+b+ " is "+result);
		             break;
		             
		    case 4:  if(b!=0)
		    	      {
		    	         result=a/b;
		    	         System.out.println("The division of "+a +" and "+b+ " is "+result);
		    	      }
		             else
		              {
		    	        System.out.println("Divide by zero error");
		              }
		             break;
		             
		    default : System.out.println("Invalid choice");
		}

	}

}
