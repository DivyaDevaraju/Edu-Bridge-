import java.util.Scanner;

public class ArraysDemo {

	public static void main(String[] args) {
		int a[]= {3,8,1,2,4};
        
             System.out.println(a[0]);
             System.out.println(a[1]);
             System.out.println(a[2]);
             System.out.println(a[3]);
             System.out.println(a[4]);

             System.out.println("No of elements in a array "+a.length);

             for(int i=0;i<a.length;i++) 
             {
	            System.out.println(a[i]);
	         }
             
             
            int a1[]=new int[5];
     		
     		Scanner sc = new Scanner(System.in);
     		
     		System.out.println("Enter array elements");
     		for(int i=0;i<a1.length;i++) {
     			a1[i]=sc.nextInt();
     		}
     		
     		
     		System.out.println("No of elements in a array "+a1.length);
     		
     		for(int i=0;i<a1.length;i++) {
     			System.out.println(a1[i]);
     		}

}
}
