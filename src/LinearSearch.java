import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int[] arr= {20,40,56,37,89,67};
		System.out.println("Enter an element to search:");
		int ele=sc.nextInt();
		
		for(int i=0;i<arr.length;i++)
		{
			if (arr[i]==ele)
			{
				System.out.println("Element found at index:"+i);
				break;
			}
			
		}
		
	}

}
