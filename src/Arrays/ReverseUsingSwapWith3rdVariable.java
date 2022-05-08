package Arrays;

public class ReverseUsingSwapWith3rdVariable {

	
	public static void main(String[] args)
	{
		int arr[] = {51,78,91,45};
		
		System.out.println("the original array is - " );
		for (int i =0; i < arr.length; i++)
		{
			
			System.out.print(" " + arr[i] + " ");
		}
		
		// place start at staring of array and assign its index
		int start = 0;
		// place end at ending of array and assign the length - 1 (since index starts with 0)
		int end = arr.length-1;
		
		// start swapping using 3rd variable
		while(start < end)
		{
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			// incrementing start and decrementing end with 1
			start = start +1;
			end = end -1;

		}
		System.out.println("\nThe reversed array is - ");
		for (int a : arr)
		{
			System.out.print(" "+ a + " ");
		}
	
	}
}
