public class LinearSearch {
    public static int linearSearch(int arr[],int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[] = {2,4,6,8,1,3,5,7,9};
		int key = 5;
		int result = linearSearch(arr,key);
		if(result!=-1) {
			System.out.println("Element Found at "+result);
		}else {
			System.out.println("Element Not Found....");
		}
	}
}