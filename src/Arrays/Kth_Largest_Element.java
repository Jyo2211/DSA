package Arrays;

public class Kth_Largest_Element {

	public static void main(String[] args) {
		
		int arr[] = {1,8,7,5,6,2};
		int k = 3; // k=3 means finding 3rf largest number - which is 6
		System.out.println(largestKthElement(arr, k));	

	}

	public static int largestKthElement(int[] arr, int k) {
		
		// traverse the array first  from 0th index to length - 1
		for(int i = 0; i< arr.length-1; i++){
		
		// start traversing from i+1 position to arr length
			for (int j = i+1; j< arr.length; j++){
		
		// inside the for loop , check if a[i] is less than a[j] value or not and accordinlgy swap using third variable
				if(arr[i] < arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
				}
				
			}
			
			if(i == k-1)
			{
				System.out.println("The kth largest element " + arr[i]);
			}
		}
		return k;
				
	}

}
