package Arrays;

public class Kth_smallest_elements {

	public static void main(String[] args) {
		
		int arr[] = {4,5,7,1,10,8};
		int k = 3;
		
		System.out.println(smallestKthElement(arr, k));

	}

	public static int smallestKthElement(int[] arr, int k) {
		
		for(int i = 0; i< arr.length-1; i++)
		{
			for(int j = i+1; j< arr.length; j++)
			{
				if(arr[i]> arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		
			if (i == k-1){
				System.out.println("The smallest element at kth position -" + arr[i]);
			}
		}
		
		return k;
	}

}
