public class QuickSort {
    public static int[] quickSort(int array[],int low,int high) {
		int arr[] = array;
		if(low<high) {
			int pi = partition(arr,low,high);
			quickSort(arr,low,pi-1);
			quickSort(arr,pi+1,high);
		}
		return arr;
	}

	private static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low-1;
		for(int j=low;j<high;j++) {
			if(arr[j]<pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		return i+1;
	}
	public static void main(String args[]) {
		int arr[] = {2,4,6,8,1,3,5,7,9};
		int result[] = quickSort(arr, 0, arr.length-1);
		for(int var : result) {
			System.out.print(var+" ");
		}
	}
}