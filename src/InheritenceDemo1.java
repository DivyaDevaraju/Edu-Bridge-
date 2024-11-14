import java.util.Scanner;
//if the class is final , the class cannot be inherited
//final class Parent

class Parent{
	private int id; //private belongs same class,
	public String name;
	protected float salary;
	
	public Parent(int id,String name, float salary) {
		System.out.println("Parent class constructor");
		this.id = id;
		this.name=name;
		this.salary=salary;
	}
	
	public void inputData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id");
		id = sc.nextInt();
		System.out.println("Enter name");
		name = sc.next();
		System.out.println("Enter salary");
		salary = sc.nextFloat();
	}
		
		//Run time polymorphisam
		//Function overriding
	//final void display() { //method is final we cannot override
		void display() {
			System.out.println("Id "+id); 	
			System.out.println("name "+name);
			System.out.println("Salary "+salary);	
	}
}


class Child extends Parent{ //is-A relation
	//final int k=9;
	public Child(int id,String name,float salary) {
		super(id,name,salary); //calls parent class constructor
		System.out.println("Child class constructor");
	}
	
	void display() {
		//System.out.println("Id "+id); //private data cannot be inherited
		//k=k+1;
		
		super.display();//calls Parent class method
		System.out.println("name "+name);
		System.out.println("Salary "+salary);	
		 
		
		}
}
public class InheritenceDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child cobj = new Child(87,"Sandhya",78654);
		//cobj.inputData();
		cobj.display();
		

	}

}
