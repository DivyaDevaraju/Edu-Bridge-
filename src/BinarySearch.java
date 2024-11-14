import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr= {11,35,45,46,87,88,98};
		System.out.println("Enter the element to search:");
		int ele=sc.nextInt();
		
		int i=0;
		int j=arr.length-1;
		
		while(i<=j)
		{
			int mid=(i+j)/2;
			
			if(arr[mid]==ele)
			{
				System.out.println("Element found at:"+mid);
				break;
			}
			
			else if(arr[mid]<ele)
			{
				i=mid+1;
			}
			
			else
			{
				j=mid-1;
			}
			
		}
		 if (i > j) {
	            System.out.println("Element not found in the array");
		
	}
	}
}



