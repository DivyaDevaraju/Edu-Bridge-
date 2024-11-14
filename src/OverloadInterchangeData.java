//Function overload by interchanging datatype
//Note: we cannot overload the method based on return type
public class OverloadInterchangeData {
	
	int display(int i, float j) {
		   System.out.println("int and float ");
		   return 98;
	   }
	
	   float display(float j, int i) {
		   System.out.println("float and int ");
		   return 87.4f;
	   }
	

	public static void main(String[] args) {
		OverloadInterchangeData obj = new OverloadInterchangeData();
		obj.display(56,56.4f); //add(int, float)
		obj.display(56.4f,78); //ad(float,int)


	}

}
