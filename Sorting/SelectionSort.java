public class SelectionSort {
    public static int[] selectionSort(int array[]) {
		int arr[] = array;
		for(int i=0;i<arr.length;i++) {
			int minindex = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[minindex]) {
					minindex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minindex];
			arr[minindex] = temp;
		}
		return arr;
	}
	public static void main(String[] args) {
		int arr[] = {2,4,6,8,1,3,5,7,9};
		int result[] = selectionSort(arr);
		for(int var : result) {
			System.out.print(var+" ");
		}
	}
}