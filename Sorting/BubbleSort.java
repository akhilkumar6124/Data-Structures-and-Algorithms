public class BubbleSort {
   public static int[] bubbleSort(int arr[]) {
		int array[] = arr;
		boolean swapped;
		for(int i=0;i<array.length;i++) {
			swapped = false;
			for(int j=0;j<array.length-i-1;j++) {
				if(array[j]>array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					swapped = true;
				}
			}
			if(!swapped) {
				break;
			}
		}
		return array;
	}
	public static void main(String[] args) {
		int arr[] = {2,4,6,8,1,3,5,7,9};
		int result[]	 = bubbleSort(arr);
		for(int var : result) {
			System.out.print(var+" ");
		}
	}
}