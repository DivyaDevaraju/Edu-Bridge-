
public class ConstructorOverload {
	int i ,j;
	    
	public ConstructorOverload() 
	{
		 this(9,8);
		 System.out.println("No argument constructor");
	}

	public ConstructorOverload(int i, int j) 
	{
	super();
	this.i = i;
	this.j = j;
	System.out.println("With argument constructor");
}

	public static void main(String[] args) {
		ConstructorOverload obj = new ConstructorOverload();
        System.out.println(obj.i);
        System.out.println(obj.j);
		
	}

}