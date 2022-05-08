package Arrays;

public class ReverseUsingForLoop {

	public static void main(String[] args) {
		
		int arr[] = {51,78,91,45};
		
		// print the original array (from i = 0 to arr.length)
		for (int i =0; i < arr.length; i++)
		{
			
			System.out.print(" " + arr[i] + " ");
		}
		
		// gapping a new line
		System.out.println();
		
		// print the reverse array (from i = arr.lenngth to i > = 0)
		for (int i =arr.length - 1; i >= 0; i--)
		{
			
			System.out.print(" " + arr[i] + " ");
		}
	}
}
