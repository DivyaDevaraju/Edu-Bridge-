/**  Units        Charge/unit
	first 100      2 
	next 200       3
	above 300      5
*/

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your name:");
		String name=sc.nextLine();		
		System.out.println("Enter the number of units used:");
		int unit=sc.nextInt();
		int charge;
		if(unit >=0 && unit<=100)
		{
			charge=unit*2;
		}
		
		else if(unit<=300)
		{
			charge=100*2+(unit-100)*3;
		}
		
		else 
		{
			charge=100*2+200*3+(unit-300)*5;
		}
		
		System.out.println("The customer name is:"+name);
		System.out.println("The bill of the customer is:"+charge);
		

	}

}
