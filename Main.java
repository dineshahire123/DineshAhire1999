package Question1;

public class Main {

	
	public static void main(String[] args) {
		
		int[] arr = {1,4,6,2,40,23,26};
		
		int n = arr.length;
		int key = 23;
		
		int ans = BinarySearch(n,arr,key);
		System.out.println("answer " + ans);
	}

	private static int BinarySearch(int n, int[] arr, int key) {
	
		int s = 0;
		int e = n;
		
		while(s<=e)
		{
			int mid = (s+e)/2;
			
			if(arr[mid]==key)
			{
				return mid;
			}
			else if(arr[mid]>key)
			{
				e = mid-1;
			}
			else
			{
			 s = mid + 1;
			}
		}
		return -1;
			
	}
}
