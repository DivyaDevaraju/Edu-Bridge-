class MyStaticClass{
	static int i;
	int j; 
	
	MyStaticClass(){
		i++;
		j++;
		System.out.println("Static i="+i);
		System.out.println("Non static data j="+j);
	}
	 
	static void staticMethod() {
		System.out.println(i); //static method can access static data
	//	System.out.println(j);//non static data cannot be accessed error
	}
}

public class MainAppStaticMethod extends MyStaticClass{
	static void staticMethod() {
    	System.out.println("static method of MainAppStaticMethod");
        //super.staticMethod(); //we cannot override static method
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStaticClass.staticMethod();
		MyStaticClass obj1 = new MyStaticClass();
		MyStaticClass obj2 = new MyStaticClass();


	}

}
