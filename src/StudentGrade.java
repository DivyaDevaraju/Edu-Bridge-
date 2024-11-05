//use else if ladder
/*  
  Marks(i/p)     Grade(o/p)
    90-100         Grade A
    80-89          Grade B
    50-79          Grade C
    35-49          Grade D
    0 - 34         Grade E
    0>m>100        Invalid marks
  
 */

import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args)
	{
           Scanner sc=new Scanner(System.in);
		   System.out.println("Enter student name:");
		           String name=sc.nextLine();
		   System.out.println("Enter marks secured:");
				int marks=sc.nextInt();
				
				char grade;
				
		  if(marks<0 || marks>100) 
				{
		   System.out.println("Invalid marks");
				return;
				}
		  
		  if(marks<=100 && marks>=90)
				grade='A';
		  
		  else if(marks>=80)
				grade='B';
		  
		  else if(marks>=50)
				grade='C';
		  
		  else if(marks>=35)
				grade='D';
		  
		  else
				grade='E';
		  
		  System.out.println("Student: "+name);
		  System.out.println("Grade: "+grade);

	}

}
