package Arrays;

public class Max_Elements_In_Array {

	public static void main(String[] args) {
		
		// take an array
		int [] arr = {4,7,15,87,98};
		
		// assign 0th index as the max
		int max = arr[0];
		
		// traverse the array
		for(int i = 1; i < arr.length; i++)
		{
		
		// inside the for loop , check if a[i] is greater than max value or not and accordinlgy assign  max 
			if (arr[i] > max)
			{
				max = arr[i];
				
			}
			
		}
		
		System.out.println("Max is -  " + max);
		
			}

}
