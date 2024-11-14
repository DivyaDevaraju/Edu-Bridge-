interface Intf1{  //usnig interface we can achieve 100%
	int i=10; //public static final
	void m1(); //by default methods are public abstract
	void m2();
}


class MyClass1 implements Intf1{


	@Override
	public void m1() {
		System.out.println("m1 method of interface");
		
	}


	@Override
	public void m2() {
		
		System.out.println("m2 method of interface");
	}
	
}

public class MainApp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass1 obj = new MyClass1();
		obj.m1();
		obj.m2();

	}

}
