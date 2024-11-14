
abstract class MainAppAbstract{//cannot create objects of abstract classes
	abstract void area();
	void display() {
		System.out.println("Display method");
	}
}
	
	
	public class MyClass  extends MainAppAbstract
	{
		@Override
		void area() {
			System.out.println("Area method");
				
		}
		
	public static void main(String[] args) {
		
		MyClass obj = new MyClass();
		obj.area();
		obj.display();
	}
}
