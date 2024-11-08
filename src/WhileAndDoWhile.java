
public class WhileAndDoWhile {

	public static void main(String[] args) {
		int i=1;
		
		while(i>1)
		{
			//pre check if the condition is false the statement will not execute
			System.out.println("Hello World");
		}
		
		
		do
		{
			//post check
			System.out.println("Hello");
		}while(i>1);

	}

}
