import java.util.Arrays;
import java.util.Scanner;

public class StringMethods {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string:");
		String str=sc.nextLine();
		int length=str.length();
		char[] dest=new char[length];
		str.getChars(0,length,dest,0);
		System.out.println(Arrays.toString(dest));
		
        char[] charArray = str.toCharArray();
		
		// Printing the char array
		System.out.println(Arrays.toString(charArray));
		
		//str.toCharArray();
		
		int ch="Divya".compareTo(str);
		System.out.println(ch);
		
		int ch2="DIVYA".compareToIgnoreCase(str);
		System.out.println(ch2);
		
		String str3="DIVYAGOWDA";
		System.out.println(str3.isEmpty());
		
		System.out.println(str3.charAt(4));
		
		System.out.println("Cooking".startsWith("king"));
		System.out.println("Cooking".endsWith("king"));
		System.out.println("Cooking".toUpperCase());
		System.out.println("Cooking".toLowerCase());
		
		
		
		
		
	}

}
