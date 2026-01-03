import java.util.Arrays;

public class BinarySearch {
    public static int binearySearch(int arr[],int key) {
		int left = 0;
		int right = arr.length-1;
		while(left<=right) {
			int mid = (left+right)/2;
			if(arr[mid]==key) {
				return mid;
			}else if(key>arr[mid]) {
				left = mid + 1;
			}else {
				right = mid - 1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[] = {2,4,6,8,1,3,5,7,9};
		int key = 5;
		Arrays.sort(arr);
		for(int var : arr) {
			System.out.print(var+" ");
		}
		System.out.println();
		int result = binearySearch(arr,key);
		if(result!=-1) {
			System.out.println("element found at "+result);
		}else {
			System.out.println("element not found......");
		}
	}
}