public class InsertionSort {
    public static int[] insertionSort(int array[]) {
		int arr[] = array;
		for(int i=1;i<arr.length;i++) {
			int key = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		return arr;
	}
	public static void main(String[] args) {
		int arr[] = {2,4,6,8,1,3,5,7,9};
		int result[] = insertionSort(arr);
		for(int var : result) {
			System.out.print(var+" ");
		}
	}
}  