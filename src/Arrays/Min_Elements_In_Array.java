package Arrays;

public class Min_Elements_In_Array {

	public static void main(String[] args) {
		
		int arr[] = {78,87,58,14,4};
		
		int min= arr[0];
		
		for(int i = 1; i < arr.length; i++)
		{
			if(arr[i] < min)
			{
				min = arr[i];
			}
		}
		
		System.out.println("Min is - " + min);

	}

}
