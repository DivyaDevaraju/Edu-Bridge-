import java.util.Scanner;

class Student{
	   //instance variables
	   int sid;
	   String sname;
	   float sfees; 


	  void inputData(){
	      Scanner sc = new Scanner(System.in);
	       System.out.println("Enter name");
	       sname=sc.next();
	        System.out.println("Enter id");
	         sid=sc.nextInt();
	        System.out.println("Enter fees");
	        sfees = sc.nextFloat();
	 }
	  
	  void display(){
	     System.out.println("Name="+sname);
	     System.out.println("ID="+sid);
	     System.out.println("fees="+sfees);
	  }
}



public class MainClass {
	
	public static void main(String[] args) {
		 Student stobj = new Student();
		   stobj.inputData();
		   stobj.display();

	}

}
