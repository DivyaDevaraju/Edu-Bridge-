import java.util.Scanner;

public class ArrayDemo2 {

	public static void main(String[] args) {
		int a[];
		int size;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of an array");
		size = sc.nextInt();
		
		a=new int[size];
		
		System.out.println("Enter array elements");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		
		System.out.println("No of elements in a array "+a.length);
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}

	}

}
